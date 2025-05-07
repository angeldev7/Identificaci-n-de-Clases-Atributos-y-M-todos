package paquetePrincipal;

public class Mochila {
    private String[] libros;
    private String[] apuntes;

    public Mochila(String[] libros, String[] apuntes) {
        this.libros = libros;
        this.apuntes = apuntes;
    }

    public void verificarContenido() {
        System.out.println("Contenido de la mochila:");
        for (String libro : libros) {
            System.out.println("- Libro: " + libro);
        }
        for (String apunte : apuntes) {
            System.out.println("- Apunte: " + apunte);
        }
    }
        // Getters y setters
    public String[] getLibros() {
        return libros;
    }

    public void setLibros(String[] libros) {
        this.libros = libros;
    }

    public String[] getApuntes() {
        return apuntes;
    }

    public void setApuntes(String[] apuntes) {
        this.apuntes = apuntes;
    }
}
