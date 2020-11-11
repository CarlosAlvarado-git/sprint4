import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class main {
    public static void main (String[] args) {

        biblioteca mainBiblioteca = new biblioteca();

        
        boolean bandera = true;
        while (bandera) {
            System.out.println("Bienvenido a biblioteca UFM, ¿que acción desea realizar?");
            System.out.println("1. Listar libros");
            System.out.println("2. Agregar un libro");
            System.out.println("3. Prestar un libro");
            System.out.println("4. Retornar un libro");
            System.out.println("5. Salir");
            Scanner scan = new Scanner(System.in);
            int eleccion = scan.nextInt();
            String saltoLinea = scan.nextLine();
            if (eleccion == 1) {
                List<libro> listaLibros = mainBiblioteca.getListaLibros();
                for (int i = 0; i < listaLibros.size(); i = i + 1) {
                    System.out.println( i + ". " + listaLibros.get(i).getNombre() + ", de: " + listaLibros.get(i).getAutor());
                }
            }
            if (eleccion == 2) {
                System.out.println("ingrese nombre del libro: ");
                String nombre = scan.nextLine();
                System.out.println("ingrese nombre del autor: ");
                String autor = scan.nextLine();

                mainBiblioteca.agregarLibro(nombre, autor);

            }

            if (eleccion == 3) {
                List<libro> listaLibros = mainBiblioteca.getListaLibros();
                if(listaLibros.size() > 0) {
                    for (int i = 0; i < listaLibros.size(); i++) {
                        libro libroRecorrido = listaLibros.get(i);
                        String estado;
                        if (!libroRecorrido.isReservado()) {
                            estado = "libre";
                        } else {
                            estado = "ocupado";
                        }
                        System.out.println( i + "." + libroRecorrido.getNombre() + ", de: " + libroRecorrido.getAutor() + " estado: " + estado);
                    }

                    System.out.println("cuál quiere prestar, considere que si esta ocupado no podrá hacerlo");
                    int numero = scan.nextInt();
                    while (numero < 0 || numero > listaLibros.size() - 1) {
                        System.out.println("pruebe con otro, ese no existe");
                        numero = scan.nextInt();
                    }
                    //libro libroElegido = listaLibros.get(numero);
                    boolean reservar = mainBiblioteca.prestarLibro(numero);
                    if (reservar) {
                        System.out.println("reservado con éxito");
                    } else {
                        System.out.println("este libro se encuentra reservado, prueba con otro");
                    }
                } else {
                    System.out.println("agrega unos libros primero");
                }


            }

            if (eleccion == 4) {
                List<libro> listaLibros = mainBiblioteca.getListaLibros();
                System.out.println("size: " + listaLibros.size());
                if (listaLibros.size() > 0) {
                    for (int i = 0; i < listaLibros.size(); i++) {
                        libro libroRecorrido = listaLibros.get(i);
                        String estado;
                        if (!libroRecorrido.isReservado()) {
                            estado = "libre";
                        } else {
                            estado = "ocupado";
                        }
                        System.out.println( i + "." + libroRecorrido.getNombre() + ", de: " + libroRecorrido.getAutor() + " estado: " + estado);
                    }

                    System.out.println("cuál quiere retornar, considere que si está libre no podrá hacerlo");
                    int numero = scan.nextInt();
                    while (numero < 0 || numero > listaLibros.size() - 1) {
                        System.out.println("pruebe con otro, este no existe");
                        numero = scan.nextInt();
                    }

                    //libro libroElegido = listaLibros.get(numero);
                    boolean retornar = mainBiblioteca.retornarLibro(numero);
                    if (retornar) {
                        System.out.println("retornado con éxito");
                    } else {
                        System.out.println("libro se encuentra libre, pruebe con otro");
                    }
                } else {
                    System.out.println("agrega unos libros primero");
                }



            }
            if (eleccion == 5) {
                bandera = false;
                System.out.println("adiós");
            }

        }




    }

}