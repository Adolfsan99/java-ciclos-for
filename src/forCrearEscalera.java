import javax.swing.*; //JOptionPane solo funciona si se importa
public class forCrearEscalera {
    public static void main(String[] args) {

        //Crear un JOptionPane para ingresar valores
        String inputVentana = JOptionPane.showInputDialog("Escribe el numero de altura de tu escalera");
        //Tamaño de la escalera sera igual al numero convertido a dato int
        int sizeEscalera = Integer.parseInt(inputVentana);
        //Llamamos el metodo drawEscalera para ejecutar esta funcion y asignamos su parametro para que pueda
        //Procesar la informacion
        drawEscalera(sizeEscalera);
    }
        public static void drawEscalera (int sizeEscalera) {


            for (int asterisco = 1; asterisco <= sizeEscalera; asterisco++) {


                for (int i=0; i < asterisco; i++) {
                    System.out.print("*"); //print crea contenido en la misma linea (horizontal)
                }

                System.out.println("");  //println crea contenido en nueva linea (vertical)

        }
    }

}