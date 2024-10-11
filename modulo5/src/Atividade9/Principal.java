package Atividade9;

public class Principal {
	public static void main(String[] args) {

		Pessoa einstein = new Pessoa("Albert Einstein");
		einstein.ajustaDataDeNascimento(14, 3, 1879);

		Pessoa newton = new Pessoa("Isaac Newton");
		newton.ajustaDataDeNascimento(4, 1, 1643);

		int diaAtual = 10;
		int mesAtual = 10;
		int anoAtual = 2024;

		einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
		newton.calculaIdade(diaAtual, mesAtual, anoAtual);

		System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos Caso estivesse vivo.");
		System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos caso estivesse vivo.");
	}
}
