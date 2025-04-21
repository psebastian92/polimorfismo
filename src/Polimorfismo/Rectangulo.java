package Polimorfismo;

public class Rectangulo extends Figura {

    // Atributos privados
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Sobrescritura del método de la clase madre
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Getter y setter de base
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Getter y setter de altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
