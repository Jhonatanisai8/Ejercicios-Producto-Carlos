import java.util.Scanner;

public class App {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Productos");

        // pedimos al usuario el numero de productos
        int cantidadProductos;
        System.out.print("Ingrese la cantidad de productos: ");
        cantidadProductos = leer.nextInt();

        // creamos los arreglos y les asignamos el tamaño ingresado por el usuario
        String[] nombreProducto = new String[cantidadProductos];
        float[] precioProducto = new float[cantidadProductos];
        int[] stockProducto = new int[cantidadProductos];


    }
}
