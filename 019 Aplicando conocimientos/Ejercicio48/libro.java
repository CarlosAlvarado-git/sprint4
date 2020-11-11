public class libro {
    String nombre = "";
    String autor = "";
    boolean reservado = false;

    public libro(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }


    public boolean isReservado() {
        return reservado;
    }

    public boolean setReservado(boolean reservado) {
        this.reservado = reservado;
        return reservado;
    }

}
