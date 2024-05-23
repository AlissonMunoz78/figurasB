package org.example;

public class Circulos extends org.example.FigurasGeometricas {
    Double radio;
    public Circulos(Double radio) {}
    public Circulos() {}

    public double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
