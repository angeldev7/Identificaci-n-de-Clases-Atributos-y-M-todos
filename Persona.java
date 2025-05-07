package paquetePrincipal;

public class Persona {
    private String ropa;
    private Mochila mochila;

    public Persona(String ropa, Mochila mochila) {
        this.ropa = ropa;
        this.mochila = mochila;
    }

    public void cambiarRopa(String nuevaRopa) {
        this.ropa = nuevaRopa;
        System.out.println("La persona se ha cambiado la ropa a: " + ropa);
    }

    public void revisarMochila() {
        mochila.verificarContenido();
    }
        // Getters y setters
    public String getRopa() {
        return ropa;
    }

    public void setRopa(String ropa) {
        this.ropa = ropa;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }
}
