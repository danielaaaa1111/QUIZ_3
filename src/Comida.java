package src;

/**
 * Clase src.Comida
 */
public class Comida {
    /**
     * Atributos:
     */
    String nombre;
    String tipo;

    /**
     * Constructor de la clase
     * @param nombre Nombre de la comida
     * @param tipo de la comida
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    Comida(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Método de imprime el tipo de comida a la que pertenece
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void tipoComida () {
        System.out.println("La " + nombre + " es " + tipo);
    }
}
