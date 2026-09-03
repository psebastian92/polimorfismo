package Polimorfismo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ═══════════════════════════════════════════════════════════════
        // ESCENA 1: SIN POLIMORFISMO (el enfoque "cabeza dura")
        // ═══════════════════════════════════════════════════════════════
        // Tratamos a cada figura por su tipo específico.
        // Fijate que tenemos que repetir la misma idea tres veces,
        // y cada tipo obliga a un println distinto.

        System.out.println("=== SIN POLIMORFISMO ===");

        Circulo circulo = new Circulo(3);
        Rectangulo rectangulo = new Rectangulo(4, 5);
        Triangulo triangulo = new Triangulo(4, 6);

        System.out.println("Círculo de radio " + circulo.getRadio()
                + " -> área = " + String.format("%.2f", circulo.calcularArea()));
        System.out.println("Rectángulo de " + rectangulo.getBase() + "x" + rectangulo.getAltura()
                + " -> área = " + String.format("%.2f", rectangulo.calcularArea()));
        System.out.println("Triángulo de base " + triangulo.getBase() + " y altura " + triangulo.getAltura()
                + " -> área = " + String.format("%.2f", triangulo.calcularArea()));

        // ¿Qué pasa si mañana sumamos Trapecio, Pentágono, Elipse...?
        // Cada nueva figura obliga a agregar otro println acá.
        // Y si además queremos SUMAR todas las áreas, tenemos que ir a mano
        // acumulando c.calcularArea() + r.calcularArea() + t.calcularArea() + ...


        // ═══════════════════════════════════════════════════════════════
        // ESCENA 2: CON POLIMORFISMO (el enfoque elegante)
        // ═══════════════════════════════════════════════════════════════
        // Metemos todas las figuras en UNA lista tipada como Figura.
        // Un solo for las recorre a todas, sin importar qué son en concreto.

        System.out.println("\n=== CON POLIMORFISMO ===");

        // Inicialización de la lista
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(circulo); 
        figuras.add(rectangulo);
        figuras.add(triangulo);
        double areaTotal = 0;

        for (Figura f : figuras) {
            // Esta línea es la clave del polimorfismo:
            // f está DECLARADA como Figura, pero en cada iteración adentro hay
            // un objeto distinto (Circulo, Rectangulo, Triangulo...).
            // Java mira el TIPO REAL del objeto y llama la versión correcta
            // de describir(). Nosotros escribimos una sola línea.
            f.describir();

            // Idem con calcularArea(): cada objeto usa su propia fórmula.
            areaTotal += f.calcularArea();
        }

        System.out.println("Área total sumada: " + String.format("%.2f", areaTotal));


        // ═══════════════════════════════════════════════════════════════
        // ESCENA 3: EL MOMENTO "AHA" (agregar una figura nueva)
        // ═══════════════════════════════════════════════════════════════
        // Suponete que mañana necesitamos un cuadrado.
        // Alcanza con crear la clase Cuadrado que herede de Figura
        // y sobrescriba calcularArea() y describir().
        // El bucle de la ESCENA 2 sigue funcionando SIN CAMBIARLE UNA LÍNEA.

        // (Descomentar cuando exista la clase Cuadrado)
        // figuras.add(new Cuadrado(4));
        // for (Figura f : figuras) { f.describir(); }

    }

}