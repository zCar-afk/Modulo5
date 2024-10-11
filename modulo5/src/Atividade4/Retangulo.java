package Atividade4;

public class Retangulo extends Forma {

	public Retangulo(String nome) {
		super(nome);
	}

	public double calcularArea() {

		return largura * altura;
	}

}