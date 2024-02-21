package org.example;

public class Main {
    public static void main(String[] args) {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();

        // Analizar un mensaje
        String mensaje = "Esto es un mensaje desde la galaxia andromeda";
        System.out.println("Número de vocales: " + comunicador.contarVocales(mensaje));
        System.out.println("Mensaje invertido: " + comunicador.invertirMensaje(mensaje));
        System.out.println("Es palíndromo: " + comunicador.esPalindromo(mensaje));
    }
}