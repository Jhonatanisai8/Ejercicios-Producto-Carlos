import java.util.Scanner;

public class App {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Productos");

        // pedimos al usuario el numero de productos
        int cantidadProductos;
        System.out.print("Ingrese la cantidad de productos: ");
        cantidadProductos = leer.nextInt();
        System.out.println("===================================");

        // creamos los arreglos y les asignamos el tamaño ingresado por el usuario
        String[] nombreProducto = new String[cantidadProductos];
        float[] precioProducto = new float[cantidadProductos];
        int[] stockProducto = new int[cantidadProductos];

        // solicitacion de datos

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print((i + 1) + ". Ingrese el nombre del producto: ");
            nombreProducto[i] = leer.next();
            System.out.print(". Ingrese el precio del producto: ");
            precioProducto[i] = leer.nextFloat();
            System.out.print(". Ingrese el stock del producto: ");
            stockProducto[i] = leer.nextInt();
        }

        // calculamos el valor total del inventario
        float valorTotalInventario = 0;
        for (int i = 0; i < precioProducto.length; i++) {
            valorTotalInventario += precioProducto[i] * stockProducto[i];
        }

        System.out.println("===================================");
        System.out.println("Valor total del inventario: " + valorTotalInventario);

        // deteminacion del producto mas caro y mas barato
        System.out.println("===================================");
        System.out.println("deteminacion del producto mas caro y mas barato");

        float precioAlto = precioProducto[0], precioBajo = precioProducto[0];

        for (int i = 1; i < cantidadProductos; i++) {
            if (precioAlto > precioProducto[i]) {
                precioAlto = precioProducto[i];
            }

            if (precioBajo < precioProducto[i]) {
                precioAlto = precioProducto[i];
            }
        }

        
    }
}
