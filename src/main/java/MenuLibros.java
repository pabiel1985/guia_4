import java.util.Scanner;

public class MenuLibros {
    Scanner teclado = new Scanner(System.in);
    GestorLibros gestor = new GestorLibros();
    String tituloLibro;
    String autorLibro;
    double precioLibro;
    int anioLibro;

    int opcion = 0;

    public void menu() {
        System.out.println("Bienvenido a la blblioteca");
        do {
            System.out.println("1. Ingresar libro");
            System.out.println("2. Mostrar libro");
            System.out.println("3. Ver todos los libros");
            System.out.println("4. Buscar libro");
            System.out.println("5. Cambiar precio a libro");
            System.out.println("6. Mostrar su de los precios de todos los libros");
            System.out.println("7. Cantidad de libros");
            System.out.println("8. Mostrar el libro mas caro y el mas barato");
            System.out.print("Elija una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el titulo del libro");
                    do {
                        tituloLibro = teclado.nextLine();
                        if (tituloLibro == null || tituloLibro.isBlank()) {
                            System.out.println("Introduce el titulo del libro valido: ");
                        }
                    } while (tituloLibro == null || tituloLibro.isBlank());
                    System.out.println("Introduce el autor del libro");
                    do {
                        autorLibro = teclado.nextLine();
                        if (autorLibro == null || autorLibro.isBlank()) {
                            System.out.println("Introduce el autor del libro valido: ");
                        }
                    } while (autorLibro == null || autorLibro.isBlank());
                    System.out.println("Introduce el precio del libro");
                    do {
                        if (teclado.hasNextDouble()) {
                            precioLibro = teclado.nextDouble();
                            if (precioLibro <= 0) {
                                System.out.println("Introduce el precio del libro valido: ");
                            }
                        } else {
                            System.out.println("Introduce valor en números");
                            teclado.next();
                        }
                    } while (precioLibro <= 0);
                    System.out.println("Introduce año del libro");
                    do {
                        if (teclado.hasNextInt()) {
                            anioLibro = teclado.nextInt();
                            if (anioLibro <= 0) {
                                System.out.println("Introduce el año del libro valido: ");
                            }
                        } else {
                            System.out.println("Introduce valor en numeros");
                            teclado.next();
                        }
                    } while (anioLibro <= 0);
                    Libros libro = new Libros(tituloLibro, autorLibro, precioLibro, anioLibro);
                    gestor.agregarLibro(libro);
                    break;
                case 2:
                    System.out.println("Introduce el titulo del libro a eliminar");
                    do {
                        tituloLibro = teclado.nextLine();
                        if (tituloLibro == null || tituloLibro.isBlank()) {
                            System.out.println("Introduce el titulo del libro valido: ");
                        }
                    } while (tituloLibro == null || tituloLibro.isBlank());
                    gestor.eliminarLibro(tituloLibro);
                    break;
                case 3:
                    System.out.println("Se muestra todos los libros");
                    gestor.mostrarLibros();
                    break;
                case 4:
                    System.out.println("Introduce el titulo del libro a buscar");
                    do {
                        tituloLibro = teclado.nextLine();
                        if (tituloLibro == null || tituloLibro.isBlank()) {
                            System.out.println("Introduce el titulo del libro valido: ");
                        }
                    } while (tituloLibro == null || tituloLibro.isBlank());
                    gestor.buscarLibro(tituloLibro);
                    break;
                case 5:
                    System.out.println("Introduce el titulo del libro a cambiar precio");
                    do {
                        tituloLibro = teclado.nextLine();
                        if (tituloLibro == null || tituloLibro.isBlank()) {
                            System.out.println("Introduce el titulo del libro valido: ");
                        }
                    } while (tituloLibro == null || tituloLibro.isBlank());
                    System.out.println("Introduce nuevo precio del libro");
                    double precioBuscado = 0;
                    do {
                        if (teclado.hasNextDouble()) {
                            precioBuscado = teclado.nextDouble();
                            if (precioBuscado <= 0) {
                                System.out.println("Introduce el precio del libro valido: ");
                            }
                        } else {
                            System.out.println("Introduce valor en numeros");
                            teclado.next();
                        }
                    } while (precioBuscado <= 0);
                    gestor.cambiarPrecio(tituloLibro, precioBuscado);
                    break;
                case 6:
                    System.out.println("Se suman todos los libros");
                    gestor.sumarPrecio();
                    break;
                case 7:
                    gestor.librosTotales();
                    break;
                case 8:
                    gestor.mostrarLibroMasCaroyBarato();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la Biblioteca");
                    break;
                default:
                    System.out.println("Opción incorrecta, inténtelo nuevamente");
                    break;
            }
        } while (opcion != 0);

    }

}
