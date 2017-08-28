/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gkrause
 */
public class Persistencia {

    public void lerArquivo() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("dados.txt"))
                    .useDelimiter("\\||\\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        while (scanner.hasNext()) {
            String nome = scanner.next();
            String cidade = scanner.next();
            String compras = scanner.next();
            System.out.println(nome);
            System.out.println(cidade);
            System.out.println(compras);
        }
    }
}
