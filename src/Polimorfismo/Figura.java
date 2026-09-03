package Polimorfismo;

// Clase base que representa cualquier figura geométrica.
// No es abstracta (no vieron abstract todavía), pero está DISEÑADA
// para que sus subclases sobrescriban los métodos calcularArea() y describir().
public class Figura {

    // Método que va a ser sobrescrito en cada subclase.
    // Devuelve 0 porque una "figura genérica" no tiene una fórmula propia:
    // el área depende del tipo real (círculo, rectángulo, triángulo...).
    public double calcularArea() {
        return 0.0;
    }

    // Idem: cada subclase se va a describir a su manera.
    public void describir() {
        System.out.println("Soy una figura genérica.");
    }
}