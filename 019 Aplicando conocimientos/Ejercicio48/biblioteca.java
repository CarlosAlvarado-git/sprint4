import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    private  List<libro> listaLibros;
    public biblioteca() {
        listaLibros = new ArrayList<libro>();
    }

    // listar libros
    public List<libro> getListaLibros() {
        return listaLibros;
    }

    // agregar libro
    public boolean agregarLibro(String nombre, String autor) {
        libro nuevoLibro = new libro(nombre, autor);
        listaLibros.add(nuevoLibro);
        return true;
    }
    //prestar libro
    public boolean prestarLibro(int numeroLibro) {
        libro libroElegido = listaLibros.get(numeroLibro);
        if (libroElegido.isReservado()) {
            return false;
        } else {
            libroElegido.setReservado(true);
            return true;
        }
    }
    // retornar libro
    public boolean retornarLibro(int numeroLibro) {
        libro libroElegido = listaLibros.get(numeroLibro);
        if (libroElegido.isReservado()) {
            libroElegido.setReservado(false);
            return true;
        } else {
            return false;
        }
    }
}
