package paquetePrincipal;
public class RutinaMatutina {
    public static void main(String[] args) {
        Mochila mochila = new Mochila(
            new String[]{"POO", "Estructuras Discretas"},
            new String[]{"Resumen semana", "Tarea #2"}
        );

        Persona persona = new Persona("pijama", mochila);
        Cuarto cuarto = new Cuarto();
        Cocina cocina = new Cocina(
            new String[]{"leche", "agua"},
            new String[]{"avena", "pan"}
        );

        System.out.println("---- Rutina Matutina ----");
        cuarto.arreglarCama();
        cuarto.abrirVentanas();

        persona.cambiarRopa("ropa de clases");

        cocina.revisarAlimentos();
        cocina.prepararDesayuno();

        persona.revisarMochila();

        System.out.println("---- Rutina finalizada ----");
    }
}


