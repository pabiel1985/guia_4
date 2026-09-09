import java.util.ArrayList;
import java.util.List;


public class GestorLibros {
   private List<Libros> libroslist;

    public GestorLibros(){
        libroslist = new ArrayList<>();
    }

    public void agregarLibro(Libros libros){
        libroslist.add(libros);
    }


}
