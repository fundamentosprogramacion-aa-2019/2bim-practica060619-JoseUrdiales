/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_arreglos;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class Manejo_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);     
        int [] valores = new int[4];
        System.out.println(valores [3]);
        valores [1+1] = 35;
        // valores [4] = 25;
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores [i]);
        }
        for (int i = 0; i < valores.length; i++){
            System.out.printf("Ingrese el valor: %d\n", i+1);
            valores[i] = entrada.nextInt();    
        }
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores [i]);
        }
    }
}
