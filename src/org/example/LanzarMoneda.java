package org.example;
    import java.util.Random;

    public class LanzarMoneda {
        public static void main(String[] args) {
            // Creamos un objeto de la clase Random para generar números aleatorios
            Random random = new Random();

            // Generamos un número aleatorio entre 0 y 1 (0 para cara, 1 para cruz)
            int resultado = random.nextInt(2);

            // Mostramos el resultado
            if(resultado == 0) {
                System.out.println("Ha salido cara.");
            } else {
                System.out.println("Ha salido cruz.");
            }
        }
    }

