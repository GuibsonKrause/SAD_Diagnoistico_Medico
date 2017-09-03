package CCI;

import CDP.Analysis;
import DAO.AgenteArquivador;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author gkrause
 */
public class AgenteRoteador
{

    public static void main(String[] args)
    {
        int auxiliary = 0;
        DatagramSocket aSocket = null;
        Set<String> doencas = new LinkedHashSet<>();
        Set<Analysis> analysis = new LinkedHashSet<>();
        double[] percent;
        String[] symptoms;
        try
        {
            aSocket = new DatagramSocket(6789);
            byte[] buffer = new byte[100];

            while (true)
            {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);
                DatagramPacket reply
                        = new DatagramPacket(request.getData(),
                                request.getLength(), request.getAddress(),
                                request.getPort());

                System.out.println(new String(request.getData()));
                String message = new String(request.getData());
                symptoms = message.split(";");
                AgenteArquivador arquivador = new AgenteArquivador();

                arquivador.getDoencas().forEach((atual) ->
                {
                    doencas.add(atual.getNomeD());
                });

                percent = new double[doencas.size()];
                AgenteResfriado agente = new AgenteResfriado(); ///////               
                for (String current : doencas)
                {
                    if (current.toLowerCase().equals("resfriado"))
                    {
                        System.out.println(agente.occurrenceCount(arquivador, "resfriado", symptoms));
                    }
                }

                reply.setData("Resfriado".getBytes());
                aSocket.send(reply);
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
