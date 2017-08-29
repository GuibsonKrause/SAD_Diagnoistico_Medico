/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                
                String doenca = scanner.next();
                if (doenca.equals("resfriado"))
                {
                    listArquivador.get(indice).setResfriado(true);
                }
                else if (doenca.equals("dengue"))
                {
                    listArquivador.get(indice).setDengue(true);
                }
                else if (doenca.equals("peneumonia"))
                {
                    listArquivador.get(indice).setPneumonia(true);
                }
                else if (doenca.equals("catapora"))
                {
                    listArquivador.get(indice).setCatapora(true);
                }
                        
                String dor = scanner.next();
                if (dor.equals("S"))
                {
                    listArquivador.get(indice).setDor(true);
                }
                
                String febre = scanner.next();
                if (febre.equals("S"))
                {
                    listArquivador.get(indice).setFebre(true);
                }
                
                String manchas = scanner.next();
                if (manchas.equals("S"))
                {
                    listArquivador.get(indice).setManchas(true);
                }
                
                String tosse = scanner.next();
                if (tosse.equals("S"))
                {
                    listArquivador.get(indice).setTosse(true);
                }
                
                String cansaco = scanner.next();
                if (cansaco.equals("S"))
                {
                    listArquivador.get(indice).setCansaco(true);
                }
                
                indice ++;
            }
            scanner.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(" Error opening file. ");
            System.exit(0);
        }
    }
}
