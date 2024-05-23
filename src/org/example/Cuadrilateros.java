package org.example;

public class Cuadrilateros extends org.example.FigurasGeometricas {
    Double lado1;
    Double lado2;


    public Cuadrilateros(Double lado1, Double lado2) {
        this.lado1 = lado1;
    }

    public Cuadrilateros() {}

    public Double getLado1() {
        return lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public double calcularArea() {
        return lado1 * lado2;
    }
}
