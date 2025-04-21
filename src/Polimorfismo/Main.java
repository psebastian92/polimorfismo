package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Creamos dos objetos usando la clase madre como tipo de referencia
        Figura f1 = new Circulo(3);          // f1 es un Círculo
        Figura f2 = new Rectangulo(4, 5);    // f2 es un Rectángulo

        // Polimorfismo: el método calcularArea() se comporta distinto según el objeto real
        System.out.println("Área del círculo: " + f1.calcularArea());
        System.out.println("Área del rectángulo: " + f2.calcularArea());
    }
}
