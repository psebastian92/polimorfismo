package Polimorfismo;

public class Triangulo extends Figura {

	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}

	@Override
	public void describir() {
		System.out.println("Soy un triángulo de base " + base + " y altura " + altura + ". Mi área es "
				+ String.format("%.2f", calcularArea()));
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}