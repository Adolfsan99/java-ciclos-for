import javax.swing.*;

public class forCrearArray {
        public static void main(String[] args) {
            int [] listanum = new int[10];
            rellenar(listanum);
            mostrar(listanum);
        }

        public static void rellenar(int listanum[]){

            for (int i = 0; i<listanum.length; i++){

                int numeros = Integer.parseInt(JOptionPane.showInputDialog("ingresar el número"));
                listanum[i] = numeros;
            }
        }

        public static void mostrar(int listanum[]){
            System.out.println(" ");
            System.out.println("Tu arreglo es...");
            for (int i = 0; i<listanum.length; i++){
                System.out.print("" + listanum[i] + ",");
            }
            System.out.println(" ");
        }
    }