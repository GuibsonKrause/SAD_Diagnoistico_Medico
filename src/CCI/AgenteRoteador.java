package CCI;

import CDP.Analysis;
import DAO.AgenteArquivador;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author gkrause
 */
public class AgenteRoteador
{
    private static final int port = 6789;

    public static void main(String[] args)
    {
        DatagramSocket aSocket = null;
        Set<String> disease = new LinkedHashSet<>();
        ArrayList<String> diseaseList = new ArrayList<>();

        double utmost = Double.MIN_VALUE;
        double[] percent;
        String[] symptoms;
        String answer = null;

        try
        {
            aSocket = new DatagramSocket(port);
            byte[] buffer = new byte[100];

            while (true)
            {
                DatagramPacket request = new DatagramPacket(buffer,
                        buffer.length);
                aSocket.receive(request);
                DatagramPacket reply
                        = new DatagramPacket(request.getData(),
                                request.getLength(), request.getAddress(),
                                request.getPort());

                String message = new String(request.getData());
                symptoms = message.split(";");
                AgenteArquivador arquivador = new AgenteArquivador();

                arquivador.getDoencas().forEach((atual) ->
                {
                    disease.add(atual.getNomeD());
                });

                percent = new double[disease.size()];

                for (String atual : disease)
                {
                    switch (atual.toLowerCase())
                    {
                        case "resfriado":
                            percent[0] = AgenteResfriado.occurrenceCount(arquivador,
                                    "resfriado", symptoms);
                            break;
                        case "dengue":
                            percent[1] = AgenteDengue.occurrenceCount(arquivador,
                                    "dengue", symptoms);
                            break;
                        case "pneumonia":
                            percent[2] = AgentePneumonia.occurrenceCount(arquivador,
                                    "pneumonia", symptoms);
                            break;
                        case "catapora":
                            percent[3] = AgenteCatapora.occurrenceCount(arquivador,
                                    "catapora", symptoms);
                            break;
                        default:
                            break;
                    }
                }
                diseaseList.addAll(disease);

                for (int i = 0; i < percent.length; i++)
                {
                    if (percent[i] > utmost)
                    {
                        utmost = percent[i];
                        answer = diseaseList.get(i);
                    } else if (percent[i] == utmost)
                    {
                        answer += "; " + diseaseList.get(i);
                    }
                }
                if (answer != null)
                {
                    reply.setData(answer.getBytes());
                    aSocket.send(reply);
                } else
                {
                    reply.setData("Não foi possível obter um diagnóstico para esse caso".getBytes());
                    aSocket.send(reply);
                }
            }
        } catch (SocketException e)
        {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e)
        {
            System.out.println("Input Output: "
                    + e.getMessage());
        } finally
        {
            if (aSocket != null)
            {
                aSocket.close();
            }
        }
    }
}
