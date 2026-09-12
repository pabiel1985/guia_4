import java.util.ArrayList;
import java.util.List;


public class GestorLibros {
    private List<Libros> libroslist;

    public GestorLibros() {
        libroslist = new ArrayList<>();
    }

    public void agregarLibro(Libros libros) {
        libroslist.add(libros);
    }

    public void eliminarLibro(String tituloBuscado) {
        boolean existe = false;
        Libros encontrado = null;
        for (Libros libro : libroslist) {
            if (libro.getTitulo().equals(tituloBuscado)) {
                encontrado = libro;
                existe = true;
            }
        }
        if (existe) {
            libroslist.remove(encontrado);
            System.out.println("Libro eliminado");
        }
        else {
            System.out.println("Libro no encontrado");
        }
    }

    public void mostrarLibros() {
        for (Libros libro : libroslist) {
            System.out.println(libro);
            System.out.println("*****************");
        }
    }

    public void buscarLibro(String tituloBuscado) {
        boolean existe = false;
        for (Libros libro : libroslist) {
            if (libro.getTitulo().equals(tituloBuscado)) {
                existe = true;
                System.out.println(libro);
            }
        }
        if(!existe) {
            System.out.println("Libro no encontrado");
        }
    }

    public void cambiarPrecio(String tituloBuscado, double precio) {
        boolean existe = false;
        for (Libros libro : libroslist) {
            if (libro.getTitulo().equals(tituloBuscado)) {
                libro.setPrecio(precio);
                existe = true;
            }
        }
        if(existe) {
            System.out.println("Precio cambiado");
        }
        else {
            System.out.println("Libro no encontrado");
        }
    }

    public void sumarPrecio() {
       boolean hayLIbros = false;
        double precioTotal = 0;
        for (Libros libro : libroslist) {
            precioTotal += libro.getPrecio();
            hayLIbros = true;
        }
        if(hayLIbros) {
            System.out.println("Precio total: " + precioTotal);
        }
        else {
            System.out.println("Sin Libros para sumar");
        }
    }

}


