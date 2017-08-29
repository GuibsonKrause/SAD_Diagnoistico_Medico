package server;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gkrause
 */
public class Persistencia {

    private int indice;

    public Persistencia() {
        this.indice = 0;
    }

    public void lerArquivo() throws FileNotFoundException {

        ArrayList<AgenteArquivador> listArquivador = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new FileReader("dados.txt"))
                    .useDelimiter(" ");

            while (scanner.hasNext()) {

                listArquivador.add(new AgenteArquivador());
                this.indice = listArquivador.size();
                //////// TA DANDO ERRO ESSA MERDA /////////

                String doenca = scanner.next();
                switch (doenca) {
                    case "resfriado":
                        listArquivador.get(indice).setResfriado(true);
                        break;
                    case "dengue":
                        listArquivador.get(indice).setDengue(true);
                        break;
                    case "peneumonia":
                        listArquivador.get(indice).setPneumonia(true);
                        break;
                    case "catapora":
                        listArquivador.get(indice).setCatapora(true);
                        break;
                    default:
                        break;
                }

                String dor = scanner.next();
                if (dor.equals("S")) {
                    listArquivador.get(indice).setDor(true);
                }

                String febre = scanner.next();
                if (febre.equals("S")) {
                    listArquivador.get(indice).setFebre(true);
                }

                String manchas = scanner.next();
                if (manchas.equals("S")) {
                    listArquivador.get(indice).setManchas(true);
                }

                String tosse = scanner.next();
                if (tosse.equals("S")) {
                    listArquivador.get(indice).setTosse(true);
                }

                String cansaco = scanner.next();
                if (cansaco.equals("S")) {
                    listArquivador.get(indice).setCansaco(true);
                }

                indice++;
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(" Error opening file. ");
            System.exit(0);
        }
        System.out.println(listArquivador.get(indice).isCatapora());
        System.out.println(listArquivador.get(indice).isDengue());
        System.out.println(listArquivador.get(indice).isPneumonia());
        System.out.println(listArquivador.get(indice).isResfriado());
        System.out.println(listArquivador.get(indice).isDor());
        System.out.println(listArquivador.get(indice).isFebre());
        System.out.println(listArquivador.get(indice).isManchas());
        System.out.println(listArquivador.get(indice).isTosse());
        System.out.println(listArquivador.get(indice).isCansaco());
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Persistencia x = new Persistencia();
        x.lerArquivo();
    }
}
