package org.example;
public class Main {
    public static void main(String[] args) {
        NavegadorEstelar navegador = new NavegadorEstelar();

        // Definir dos matrices
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        // Multiplicar las matrices y visualizar el resultado
        int[][] c = navegador.multiplicarMatrices(a, b);
        navegador.visualizarMatriz(c);
    }
}