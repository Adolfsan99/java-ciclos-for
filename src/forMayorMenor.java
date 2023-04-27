import javax.swing.*;

public class forMayorMenor {

    public static void rellenar(int listanum[]){

        for (int i = 0; i<listanum.length; i++){

            int numeros = Integer.parseInt(JOptionPane.showInputDialog("ingresar el número"));
            listanum[i] = numeros;
        }
    }
    public static void main(String[] args) {

        int [] listanum = new int[10];
        rellenar(listanum);

        //Crear arreglo con numeros
        //int [] listaDeNumeros = {2,60,80,21,51,65,25,21,56};

        //Asignar arreglo a numero mayor y numero menor
        int numeroMaximo = listanum[0];
        int numeroMinimo = listanum[0];

        //Crear ciclo for, funciona cuando pos es menor a el ancho del arreglo, en este caso 9
        //2,60,80,21,51,65,25,21,56 = 1,2,3,4,5,6,7,8,9
        //Si pos es 0, el ciclo suma pos, pos se detiene cuando llega a 9
        //Es decir cuando termina el arreglo
        for (int pos = 0; pos < listanum.length; pos++) {

            //Si numero pos es mayor a numeroMaximo que es 0
            if (listanum[pos] > numeroMaximo)
                //entonces numeroMaximo sera igual a pos, solo si es mayor
                numeroMaximo = listanum[pos];

            if (listanum[pos] < numeroMinimo)
                numeroMinimo = listanum[pos];

        }
        System.out.println(" ");
        System.out.println("El numero maximo es "+numeroMaximo);
        System.out.println("El numero minimo es "+numeroMinimo);
    }

}