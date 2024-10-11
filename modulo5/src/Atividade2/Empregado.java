package Atividade2;

public class Empregado {
	private String nome;
	protected double salario;

	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;

	}

	public String toString() {
		return "Nome do empregado: " + getNome() + "\nSalário do Empregado: " + getSalario();
	}
}