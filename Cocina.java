package paquetePrincipal;
public class Cocina {
    private String[] nevera;
    private String[] despensa;
    private boolean agua;
    private boolean pan;
    private boolean avena;
    private boolean leche;

    public Cocina(String[] nevera, String[] despensa) {
        this.nevera = nevera;
        this.despensa = despensa;
        verificarIngredientes(); // Se inicializan los booleanos según contenido
    }

    private void verificarIngredientes() {
        for (String item : nevera) {
            if (item.equalsIgnoreCase("agua")) agua = true;
            if (item.equalsIgnoreCase("leche")) leche = true;
        }
        for (String item : despensa) {
            if (item.equalsIgnoreCase("avena")) avena = true;
            if (item.equalsIgnoreCase("pan")) pan = true;
        }
    }

    public void revisarAlimentos() {
        System.out.println("Nevera:");
        for (String item : nevera) System.out.println("- " + item);
        System.out.println("Despensa:");
        for (String item : despensa) System.out.println("- " + item);
    }

    public void prepararDesayuno() {
        if (leche && avena && pan) {
            System.out.println("Desayuno preparado: Avena con leche y pan.");
        } else {
            System.out.println("Faltan ingredientes para el desayuno.");
        }
    }
        // Getters y setters
    public String[] getNevera() {
        return nevera;
    }

    public void setNevera(String[] nevera) {
        this.nevera = nevera;
        verificarIngredientes();
    }

    public String[] getDespensa() {
        return despensa;
    }

    public void setDespensa(String[] despensa) {
        this.despensa = despensa;
        verificarIngredientes();
    }

    public boolean isAgua() {
        return agua;
    }

    public boolean isPan() {
        return pan;
    }

    public boolean isAvena() {
        return avena;
    }

    public boolean isLeche() {
        return leche;
    }

}

