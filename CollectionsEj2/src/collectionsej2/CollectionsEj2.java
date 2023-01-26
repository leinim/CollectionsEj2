/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package collectionsej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class CollectionsEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        String opcion = "";
        do {
            System.out.println("Ingrese el nombre de la raza");
            String raza = leer.next();
            razas.add(raza);
            System.out.println("Desea continuar?S/N");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
        
        for (String raza : razas) {
            System.out.println(raza);
        }
        
        System.out.println("Ingrese la raza a encontrar");
        String busca = leer.next();
        
        Iterator<String> it = razas.iterator();
        //contains(elemento)
        
        int contador = 0;
        
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase(busca)){
                it.remove();
                contador++;
            }
        }
        
        Collections.sort(razas);
        
        if (contador > 0){                
            for (String raza : razas) {
            System.out.println(raza);
            }
        } else {
            System.out.println("No se ha encontrado la raza en la lista");
            for (String raza : razas) {
                System.out.println(raza);    
            }            
        }
    }
    
}
