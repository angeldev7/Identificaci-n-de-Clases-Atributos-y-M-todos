package paquetePrincipal;

public class Cuarto {
    private boolean cama;
    private boolean ventanas;

    public Cuarto() {
        this.cama = false;
        this.ventanas = false;
    }

    public void arreglarCama() {
        cama = true;
        System.out.println("La cama ha sido arreglada.");
    }

    public void abrirVentanas() {
        ventanas = true;
        System.out.println("Las ventanas han sido abiertas.");
    }
        // Getters y setters
    public boolean isCama() {
        return cama;
    }

    public void setCama(boolean cama) {
        this.cama = cama;
    }

    public boolean isVentanas() {
        return ventanas;
    }

    public void setVentanas(boolean ventanas) {
        this.ventanas = ventanas;
    }
}
