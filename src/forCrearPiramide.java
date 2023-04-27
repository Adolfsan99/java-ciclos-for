import javax.swing.*;

public class forCrearPiramide {

    public static void main(String[] args) {
        //Crear un JOptionPane para ingresar valores
        String inputVentana = JOptionPane.showInputDialog("Escribe el numero de altura de tu escalera");
        //Tamaño de la escalera sera igual al numero convertido a dato int
        int altura = Integer.parseInt(inputVentana);
        //Llamamos el metodo drawEscalera para ejecutar esta funcion y asignamos su parametro para que pueda
        //Procesar la informacion
        piramide(altura);
    }

    public static void piramide (int altura) {

        for (int espacios = altura, asterisco=1; asterisco<=(altura*2); espacios--,asterisco+=2) {

            for (int i=0; i<espacios; i++) {
                System.out.print(" ");
            }

            for (int j=asterisco; j!=0; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}
