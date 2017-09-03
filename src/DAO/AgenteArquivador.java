package DAO;

import CCI.Persistencia;
import CDP.Doencas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author gkrause
 */
public class AgenteArquivador
{
    private ArrayList<Doencas> doencas;
    private int[] auxSintomas;
    
    public AgenteArquivador()
    {
        this.doencas = new ArrayList<>();
        this.setDoencas(Persistencia.ReadFile()); // Adiciona as doenças do arquivo na lista        
        this.auxSintomas = new int[5];
        
        for (int i = 0; i < 5; i++) this.auxSintomas[i] = 0;        
    }

    public ArrayList<Doencas> getDoencas()
    {
        return doencas;
    }

    public void setDoencas(ArrayList<Doencas> doencas)
    {
        this.doencas = doencas;
    }

    public int[] getAuxSintomas()
    {
        return auxSintomas;
    }

    public void setAuxSintomas(int[] auxSintomas)
    {
        this.auxSintomas = auxSintomas;
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
