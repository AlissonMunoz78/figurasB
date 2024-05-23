package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FigurasGeometricas miFigura = new FigurasGeometricas();
        Circulos miFigura2 = new Circulos();
        Triangulos miFigura3 = new Triangulos();
        Cuadrilateros miFigura4 = new Cuadrilateros();
        Pentagono miFigura5 = new Pentagono();

        miFigura2.setNombre("Pileta del CEC");
        System.out.println(miFigura2.getNombre());

        System.out.println("La nueva pileta tendra un radio de ");
        miFigura2.setRadio(4.00);
        System.out.println(miFigura2.getRadio());

        System.out.println("y su area sera: ");
        System.out.println(miFigura2.calcularArea());


        //
        miFigura3.setNombre("Cupula");
        System.out.println(miFigura3.getNombre());
        System.out.println("La nueva cupula tendra una altura de ");
        miFigura3.setAltura(5.00);
        System.out.println(miFigura3.getAltura());

        System.out.println("La nueva cupula tendra una base de ");
        miFigura3.setBase(8.00);
        System.out.println(miFigura3.getBase());


        System.out.println("y su area sera: ");
        System.out.println(miFigura3.calcularArea());

        //

        miFigura4.setNombre("Mesa");
        System.out.println(miFigura4.getNombre());

        System.out.println("La nueva mesa tendra un lado1 de ");
        miFigura4.setLado1(10.00);
        System.out.println(miFigura4.getLado1());

        System.out.println("La nueva mesa tendra un lado2 de");
        miFigura4.setLado2(5.00);
        System.out.println(miFigura4.getLado2());

        System.out.println("y su area sera: ");
        System.out.println(miFigura4.calcularArea());

        //pentagono
        miFigura5.setNombre("Pentagono");
        System.out.println(miFigura5.getNombre());

        System.out.println("El pentagono tiene lados de  ");
        miFigura5.setLongitudLados(5.00);
        System.out.println(miFigura5.getLongitudLados());

        System.out.println("y su area sera: ");
        System.out.println(miFigura5.calcularArea());


//AZZNK

    }
}