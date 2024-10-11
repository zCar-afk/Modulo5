package Atividade9;

public class Pessoa {
	// Atributos da classe
	private String nome;
	private int idade;
	private int dia;
	private int mes;
	private int ano;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public void ajustaDataDeNascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
		if (mesAtual > this.mes || (mesAtual == this.mes && diaAtual >= this.dia)) {
			this.idade = anoAtual - this.ano;
		} else {
			this.idade = anoAtual - this.ano - 1;
		}
	}

	public int informaIdade() {
		return this.idade;
	}

	public String informaNome() {
		return this.nome;
	}
}
