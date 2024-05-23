package org.example;
public class Triangulos extends org.example.FigurasGeometricas {
    Double base;
    Double altura;
    public Triangulos(Double base, Double altura) {}
    public Triangulos() {}

    public double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public double calcularArea() {
        return base*altura;
    }
}
