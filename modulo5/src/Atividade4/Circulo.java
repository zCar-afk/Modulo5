package Atividade4;

public class Circulo extends Forma {

	public double raio;
	public double pi;

	public Circulo(String nome) {
		super(nome);
	}

	public double calcularArea() {
		return pi * raio * raio;
	}

}
