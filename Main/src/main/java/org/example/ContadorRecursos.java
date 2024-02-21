package org.example;


public class ContadorRecursos {
    private double[] recursos;
    private double umbralSeguro;

    public ContadorRecursos(double[] recursos, double umbralSeguro) {
        this.recursos = recursos;
        this.umbralSeguro = umbralSeguro;
    }

    public double[] calcularConsumo(int dias) {
        double[] consumo = new double[recursos.length];
        for (int i = 0; i < recursos.length; i++) {
            consumo[i] = recursos[i] * dias;
        }
        return consumo;
    }

    public double[] proyectarConsumoFuturo(int diasFuturos) {
        double[] proyeccion = new double[recursos.length];
        for (int i = 0; i < recursos.length; i++) {
            proyeccion[i] = recursos[i] * diasFuturos;
        }
        return proyeccion;
    }

    public boolean alertaUmbralSeguro() {
        for (double recurso : recursos) {
            if (recurso < umbralSeguro) {
                return true;
            }
        }
        return false;
    }

    public double[] estadisticasUso() {
        double suma = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double recurso : recursos) {
            suma += recurso;
            if (recurso < min) {
                min = recurso;
            }
            if (recurso > max) {
                max = recurso;
            }
        }

        double promedio = suma / recursos.length;
        return new double[]{promedio, min, max};
    }

    public void imprimirValores() {
        System.out.println("Valores de los recursos:");
        for (double recurso : recursos) {
            System.out.println(recurso);
        }
        System.out.println("Umbral seguro: " + umbralSeguro);
    }
}