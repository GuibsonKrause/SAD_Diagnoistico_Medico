package CCI;

import CDP.Doencas;
import DAO.AgenteArquivador;

/**
 *
 * @author gkrause
 */
public class AgentePrincipal
{

    public static double occurrenceCount(AgenteArquivador arquivador,
            String nomeD, String[] sintDoenca)
    {
        int vetSintDoenca[] = new int[5],
                vetSintomas[] = new int[5],
                calc = 0, smaller = Integer.MAX_VALUE,
                i = 0, j = 0, counter = 0;

        double probability = 0;

        for (Doencas doenca : arquivador.getDoencas())
        {
            if (doenca.getDor().toLowerCase().equals("s"))
            {
                vetSintomas[0]++;
            }
            if (doenca.getFebre().toLowerCase().equals("s"))
            {
                vetSintomas[1]++;
            }
            if (doenca.getManchas().toLowerCase().equals("s"))
            {
                vetSintomas[2]++;
            }
            if (doenca.getTosse().toLowerCase().equals("s"))
            {
                vetSintomas[3]++;
            }
            if (doenca.getCansaco().toLowerCase().equals("s"))
            {
                vetSintomas[4]++;
            }

            if (doenca.getNomeD().toLowerCase().equals(nomeD))
            {
                counter++;
                if (doenca.getDor().toLowerCase().equals("s"))
                {
                    vetSintDoenca[0]++;
                }
                if (doenca.getFebre().toLowerCase().equals("s"))
                {
                    vetSintDoenca[1]++;
                }
                if (doenca.getManchas().toLowerCase().equals("s"))
                {
                    vetSintDoenca[2]++;
                }
                if (doenca.getTosse().toLowerCase().equals("s"))
                {
                    vetSintDoenca[3]++;
                }
                if (doenca.getCansaco().toLowerCase().equals("s"))
                {
                    vetSintDoenca[4]++;
                }
            }
        }

        if (sintDoenca[4].contains("S"))
        {
            calc = calc + vetSintDoenca[4];
            if (vetSintDoenca[4] < smaller)
            {
                smaller = vetSintDoenca[4];
            }
            i++;
            j = 4;
        }

        if (sintDoenca[3].contains("S"))
        {
            calc = calc + vetSintDoenca[3];
            if (vetSintDoenca[3] < smaller)
            {
                smaller = vetSintDoenca[3];
            }
            i++;
            j = 3;
        }

        if (sintDoenca[2].contains("S"))
        {
            calc = calc + vetSintDoenca[2];
            if (vetSintDoenca[2] < smaller)
            {
                smaller = vetSintDoenca[2];
            }
            i++;
            j = 2;
        }

        if (sintDoenca[1].contains("S"))
        {
            calc = calc + vetSintDoenca[1];
            if (vetSintDoenca[1] < smaller)
            {
                smaller = vetSintDoenca[1];
            }
            i++;
            j = 1;
        }

        if (sintDoenca[0].contains("S"))
        {
            calc = calc + vetSintDoenca[0];
            if (vetSintDoenca[0] < smaller)
            {
                smaller = vetSintDoenca[0];
            }
            i++;
            j = 0;
        }

        calc = arquivador.getDoencas().size() - calc;
        if (calc < 0)
        {
            calc = calc * -1;
        }

        if (i > 1)
        {
            probability = ((double) smaller
                    / arquivador.getDoencas().size())
                    / ((double) calc / arquivador.getDoencas().size());
        } else if (i == 1)
        {
            probability = ((double) smaller
                    / arquivador.getDoencas().size())
                    / ((double) vetSintomas[j]
                    / arquivador.getDoencas().size());
        }

        return probability;
    }
}
