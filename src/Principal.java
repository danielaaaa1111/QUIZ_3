package src;

import src.Comida;

/**
 * Primera clase que es ejecutada
 */
public class Principal {
    /**
     * Primer método que se ejecuta en mi aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void main(String[] args) {
        Comida fruta = new Comida("fresa", "saludable");
        Comida comidarapida = new Comida("hamburguesa", "chatarra");


        fruta.tipoComida();
        comidarapida.tipoComida();

    }
}
