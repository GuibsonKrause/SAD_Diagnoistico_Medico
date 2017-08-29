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
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("executando código");
        Persistencia x = new Persistencia();
        x.lerArquivo();
    }

    public void lerArquivo() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("dados.txt"))
                       .useDelimiter(" ");
        
        while (scanner.hasNext()) {
            String doenca = scanner.next();
            String dor = scanner.next();
            String febre = scanner.next();
            String manchas = scanner.next();
            String tosse = scanner.next();
            String cansaco = scanner.next();
            
            System.out.println(doenca);
            System.out.println(dor);
            System.out.println(febre);
            System.out.println(manchas);
            System.out.println(tosse);
            System.out.println(cansaco);
        }
        scanner.close();
    }
}
