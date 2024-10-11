package Atividade2;

public class Vendendor extends Empregado {
	private float comissao;

	public Vendendor(String nome, double salario, float comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float calcularSalario() {
		return (float) (getSalario() * (1 + comissao / 100));
	}

	public String toString() {
		return "\nNome do vendedor: " + getNome() + "\nsalario sem comissão em reais:  " + getSalario()
				+ "\nsalario com comissãoem reais:  " + calcularSalario() + "\npercentual de comissão: " + comissao
				+ " porcento";
	}
}
