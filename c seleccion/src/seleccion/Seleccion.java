/*
Ordenamientos: ordenamiento por seleccion.
 */
package seleccion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Seleccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, min, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos para el arreglo: "));

        arreglo = new int[nElementos];

        System.out.println("Rellenando el arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ".Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Ordenamiento por seleccion
        for (int i = 0; i < nElementos; i++) {
            min = i;
            for (int j = i + 1; j < nElementos; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }

        // Mostrando el arreglo ordenado en forma creciente
        System.out.print("\nArreglo en orden Creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        // Mostrando el arreglo ordenado en forma Decreciente
        System.out.print("\nArreglo en orden Dereciente: ");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");
    }
}
