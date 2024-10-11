package Atividade2;

public class Gerente extends Empregado {
	private String departamento;

	public Gerente(String nome, double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;

	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String toString() {
		return "\nNome do gerente: " + getNome() + "\nSalário do Gerente: " + getSalario() + "\nDepartamento: "
				+ getDepartamento();
	}

}
