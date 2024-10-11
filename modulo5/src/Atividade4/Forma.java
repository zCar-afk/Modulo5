package Atividade4;

public abstract class Forma {
	public double largura;

	public double altura;

	public String nome;

	public Forma(String nome) {
		this.nome = nome;
	}

	public abstract double calcularArea();

	public String imprimirNome() {
		return nome;
	}

}