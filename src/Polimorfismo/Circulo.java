package Polimorfismo;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Sobrescribimos con la fórmula específica del círculo.
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Sobrescribimos para que el círculo se presente a su manera.
    @Override
    public void describir() {
        System.out.println("Soy un círculo de radio " + radio
                + ". Mi área es " + String.format("%.2f", calcularArea()));
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }
}