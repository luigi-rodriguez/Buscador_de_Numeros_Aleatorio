package busqueda_secuencial;

import javax.swing.JOptionPane;

/**
 * @author jose luis
 * 
 * Programa donde Muestra la posicion del Numero A Buscar una vez lanzado el 
 * Arreglo de 10 Posiciones
 * 
 */
public class Busqueda_secuencial {

    public static void main(String[] args) {
        
        int array[] = new int[10];  // Se definen las posiciones del arreglo
        for(int i=0; i<array.length; i++){
                array[i] = (int)(Math.random()*100);    //  Se enumera el arreglo de 100 hasta 0 aleatorio con el "RANDOM"
            JOptionPane.showMessageDialog(null,"Numero: " + array[i]);
        }
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Que numero deseas buscar?"));
        for (int j=0; j<array.length; j++){
            // comparador de entrada, para ver si se encuentra el numero a buscar
            if(numero == array[j]){
                JOptionPane.showMessageDialog(null,"El numero que busca se encuentra en la posicion: " + j);
            }else{
                JOptionPane.showMessageDialog(null,"El numero que busca no se encuentro !!!!");
             }
        }
    }
}
