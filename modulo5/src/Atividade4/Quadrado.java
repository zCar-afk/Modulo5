package Atividade4;

public class Quadrado extends Forma {

	public Quadrado(String nome) {
		super(nome);
	}

	public double calcularArea() {

		return largura * altura;
	}

}
