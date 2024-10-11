package Atividade4;

public class Triangulo extends Forma {

	public Triangulo(String nome) {
		super(nome);
	}

	public double calcularArea() {

		return largura * altura / 2;
	}

}
