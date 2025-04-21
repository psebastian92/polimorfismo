package Polimorfismo;

public class Circulo extends Figura {

    // Atributo privado para encapsulamiento
    private double radio;

    // Constructor para inicializar el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Sobrescribimos el método de la clase madre con el cálculo específico
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Getter del radio
    public double getRadio() {
        return radio;
    }

    // Setter del radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
