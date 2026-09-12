import java.util.Scanner;

public class MenuLibros {
    Scanner teclado = new Scanner(System.in);
    GestorLibros gestor = new GestorLibros();


    int opcion = 0;

    public void menu() {
        System.out.println("Bienvenido a la blblioteca");
        System.out.println("Elija una opcion");
        do {
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el titulo del libro");
                    String titulo = teclado.nextLine();
                    System.out.println("Introduce el autor del libro");
                    String autor = teclado.nextLine();
                    System.out.println("Introduce el precio del libro");
                    double precio = teclado.nextDouble();
                    System.out.println("Introduce año del libro");
                    int anio = teclado.nextInt();
                    Libros libro = new Libros(titulo, autor, precio, anio);
                    gestor.agregarLibro(libro);
                    break;
                case 2:
                    System.out.println("Introduce el titulo del libro a eliminar");
                    String titulo2 = teclado.nextLine();
                    gestor.eliminarLibro(titulo2);
                    break;
                case 3:
                    System.out.println("Se muestra todos los libros");
                    gestor.mostrarLibros();
                    break;
                case 4:
                    System.out.println("Introduce el titulo del libro a buscar");
                    String titulo3 = teclado.nextLine();
                    gestor.buscarLibro(titulo3);
                    break;
                case 5:
                    System.out.println("Introduce el titulo del libro a buscar");
                    String titulo4 = teclado.nextLine();
                    System.out.println("Introfuce nuevo precio del libro");
                    double precio4 = teclado.nextDouble();
                    gestor.cambiarPrecio(titulo4, precio4);
                    break;
            }
        } while (opcion != 0);

    }

}
