package org.example;

public class Pentagono extends FigurasGeometricas {
    double longitudLados = 0;
    public Pentagono(String nombre, int nLado, Double longitudLados){
        super(nombre, nLado, longitudLados);
    }
    public Pentagono() {}

    public double getLongitudLados(){
        return longitudLados;
    }

    public void setLongitudLados(double longitudLados){
        this.longitudLados = longitudLados;
    }


    public double calcularArea(){
        return 0.25 * nLado * Math.pow(longitudLados, 2) / Math.tan(Math.PI / nLado);
    }

    public double calcularPerimetro(){
        return 2 * nLado * Math.pow(longitudLados, 2);
    }


}
