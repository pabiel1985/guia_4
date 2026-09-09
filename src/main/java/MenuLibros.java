import java.util.Scanner;

public class MenuLibros {
    Scanner teclado = new Scanner(System.in);
    GestorLibros gestor = new GestorLibros();
    Libros libro;

    int opcion = 0;

    public void menu(){
        System.out.println("Bienvenido a la blblioteca");
        System.out.println("Elija una opcion");

        switch (opcion){
            case 1 -> gestor.agregarLibro(Libros libro = new Libros());

        }
    }

}
