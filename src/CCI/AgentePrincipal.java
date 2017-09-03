/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCI;

import CDP.Doencas;
import DAO.AgenteArquivador;

/**
 *
 * @author gkrause
 */
public class AgentePrincipal
{

    private int v[];

    public int[] getV()
    {
        return v;
    }

    public void setV(int[] v)
    {
        this.v = v;
    }

    public static double occurrenceCount(AgenteArquivador arquivador,
            String nomeD, String[] sintDoenca)
    {
        int auxiliary1 = 0, auxiliary2 = 0,
                vetSintDoenca[] = new int[5],
                vetSintomas[] = new int[5],
                counter = 0, calc = 0, smaller
                = Integer.MAX_VALUE;
        double probability = 0;

        for (Doencas doenca : arquivador.getDoencas())
        {
            if (doenca.getNomeD().equals(nomeD))
            {

                if (doenca.getDor().equals("S"))
                {
                    vetSintDoenca[0]++;
                }
                if (doenca.getFebre().equals("S"))
                {
                    vetSintDoenca[1]++;
                }
                if (doenca.getManchas().equals("S"))
                {
                    vetSintDoenca[2]++;
                }
                if (doenca.getTosse().equals("S"))
                {
                    vetSintDoenca[3]++;
                }
                if (doenca.getCansaco().equals("S"))
                {
                    vetSintDoenca[4]++;
                }

                counter++;
            }

            if (doenca.getDor().equals("S"))
            {
                vetSintomas[0]++;
            }
            if (doenca.getFebre().equals("S"))
            {
                vetSintomas[1]++;
            }
            if (doenca.getManchas().equals("S"))
            {
                vetSintomas[2]++;
            }
            if (doenca.getTosse().equals("S"))
            {
                vetSintomas[3]++;
            }
            if (doenca.getCansaco().equals("S"))
            {
                vetSintomas[4]++;
            }
        }

        if (sintDoenca[0].equals("S"))
        {
            calc = calc + vetSintDoenca[0];
            if (vetSintDoenca[0] < smaller)
            {
                smaller = vetSintDoenca[0];
            }
            auxiliary2 = 0;
            auxiliary1++;            
        }
        if (sintDoenca[1].equals("S"))
        {
            calc = calc + vetSintDoenca[1];
            if (vetSintDoenca[1] < smaller)
            {
                smaller = vetSintDoenca[1];
            }
            auxiliary2 = 1;
            auxiliary1++;            
        }
        if (sintDoenca[2].equals("S"))
        {
            calc = calc + vetSintDoenca[2];
            if (vetSintDoenca[2] < smaller)
            {
                smaller = vetSintDoenca[2];
            }            
            auxiliary2 = 2;
            auxiliary1++;
        }
        if (sintDoenca[3].equals("S"))
        {
            calc = calc + vetSintDoenca[3];
            if (vetSintDoenca[3] < smaller)
            {
                smaller = vetSintDoenca[3];
            }            
            auxiliary2 = 3;
            auxiliary1++;
        }
        if (sintDoenca[4].equals("S"))
        {
            calc = calc + vetSintDoenca[4];
            if (vetSintDoenca[4] < smaller)
            {
                smaller = vetSintDoenca[4];
            }            
            auxiliary2 = 4;
            auxiliary1++;
        }

        calc = arquivador.getDoencas().size() - calc;
        if (calc < 0)
        {
            calc = calc * -1;
        }

        if (auxiliary1 > 1)
        {
            probability = ((double) smaller /
                    arquivador.getDoencas().size()) /
                    ((double) calc / arquivador.getDoencas().size());
        } else if (auxiliary1 == 1)
        {
            probability = ((double) smaller /
                    arquivador.getDoencas().size()) /
                    ((double) vetSintomas[auxiliary2] /
                    arquivador.getDoencas().size());
        }
        
        return probability;
    }
}
