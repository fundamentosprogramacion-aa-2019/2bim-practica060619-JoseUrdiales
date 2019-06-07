/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_arreglos;

/**
 *
 * @author Jose Luis
 */
public class ManejoEstructurasDos {
    public static void main (String[] args){
        String cadena = "";
        
        String [] listaNombres = {"Marjan", "Jhon", "Rodrigo", "Miguel", 
            "José"};
        String [] listaCiudades = {"Loja", "Catamayo", "Calvas", "Celica", 
            "Pindal"};
        double [] listaSueldos = {900.1, 1000.2, 450.3, 1500.2, 861.9};
        // de la 15 a la 19 muestran las matrices que utilizaremos
        
        cadena = String.format("%s%s\n", cadena, 
                "----LISTADO DE TRABJADORES."
                        + "-----\n");
        // utilize String.format para presentar un solo printf
        
        for (int i = 0; i < listaNombres.length; i++) {
            cadena = String.format("%s%s de la ciudad de %s,\ntiene un sueldo "
                    + "de %.1f\n-------------------------------\n", 
                    cadena, listaNombres[i], listaCiudades[i], 
                    listaSueldos[i]);
        }
        System.out.printf("%s", cadena);
        // presento todos los String.format que cree
    }
}
