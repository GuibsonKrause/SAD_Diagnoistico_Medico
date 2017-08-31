package CCI;

import CDP.Doencas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author gkrause
 */
public class Persistencia
{

    private static Doencas aux;

    public static ArrayList<Doencas> ReadFile()
    {
        ArrayList<Doencas> table = new ArrayList<>();
        String dataFile = "data.txt";
        BufferedReader data = null;
        String row = "";
        String split = ";";
        try
        {
            data = new BufferedReader(new FileReader(dataFile));
            while ((row = data.readLine()) != null) // row recebe a linha inteira lida do arquivo
            {
                String[] doenca = row.split(split); // Cria um vertor de estrings, quebra a string row por ; e adiciona no vetor
                Doencas auxiliary = new Doencas(doenca[0], doenca[1],
                        doenca[2], doenca[3], doenca[4], doenca[5]); // Construtor da classe doencas
                table.add(auxiliary); // Adiciona na lista um objeto contendo o que foi lido do arquivo
            }
            return table; // retorna a lista
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally // o finally é executado de qualquer forma
        {
            if (data != null)
            {
                try
                {
                    data.close();// fecha o arquivo
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void WriteFile(String dataFile, Doencas doencas)
    {

        BufferedWriter file = null;
        try
        {
            file = new BufferedWriter(new FileWriter(dataFile, true));
            file.write(doencas.getNomeD() + ";" + doencas.getDor() + ";"
                     + doencas.getFebre() + ";"  + doencas.getManchas() + ";"
                     + doencas.getTosse() + ";"  + doencas.getCansaco());
            file.newLine();// Adiciona uma nova linha ao arquivo
            file.flush();// Limpa o BufferedWriter
        } catch (IOException ioe)
        {
            ioe.printStackTrace();
        } finally
        {
            if (file != null)
            {
                try
                {
                    file.close();
                } catch (IOException ioe2)
                {

                }
            }
        }
    }

}
