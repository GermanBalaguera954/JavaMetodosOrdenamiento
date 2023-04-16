/*
Ordenamiento: Metodo Burbuja.
 */
package metodo_burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodo_burbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

        arreglo = new int[nElementos];//Le asignamos el numero de elementos al arreglo.

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ".Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        //Metodo Burbuja.
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {//Si numeroActual > numeroSiguiente.
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        // Mostrando el arreglo ordenado en forma creciente.
        System.out.print("\nArreglo ordenado en forma creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        // Mostrando el arreglo ordenado en forma Decreciente
        System.out.print("\nArreglo ordenado en forma decreciente: ");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}
