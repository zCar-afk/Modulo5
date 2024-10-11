package Atividade567;

public class Principal {
	public static void main(String[] args) {

		Empregado emp = new Empregado("Carlos Henrique", 30, 101, 5000.00, 20.0);

		System.out.println("Nome: " + emp.getNome());
		System.out.println("Idade: " + emp.getIdade());
		System.out.println("Código Setor: " + emp.getCodigoSetor());
		System.out.println("Salário Base: " + emp.getSalarioBase());
		System.out.println("Imposto: " + emp.getImposto() + "%");

		System.out.println("Salário Líquido: " + emp.calcularSalario());

		Operario operario = new Operario("Bill Gates", 35, 202, 3000.00, 15.0, 20000.00, 10.0);

		System.out.println("Nome: " + operario.getNome());
		System.out.println("Idade: " + operario.getIdade());
		System.out.println("Código Setor: " + operario.getCodigoSetor());
		System.out.println("Salário Base: " + operario.getSalarioBase());
		System.out.println("Imposto: " + operario.getImposto() + "%");
		System.out.println("Valor Produção: " + operario.getValorProducao());
		System.out.println("Comissão: " + operario.getComissao() + "%");

		System.out.println("Salário Líquido: " + operario.calcularSalario());

		Vendedor vendedor = new Vendedor("Elon Musk", 40, 303, 4000.00, 10.0, 50000.00, 5.0);

		System.out.println("Nome: " + vendedor.getNome());
		System.out.println("Idade: " + vendedor.getIdade());
		System.out.println("Código Setor: " + vendedor.getCodigoSetor());
		System.out.println("Salário Base: " + vendedor.getSalarioBase());
		System.out.println("Imposto: " + vendedor.getImposto() + "%");
		System.out.println("Valor Vendas: " + vendedor.getValorVendas());
		System.out.println("Comissão: " + vendedor.getComissao() + "%");

		System.out.println("Salário Líquido: " + vendedor.calcularSalario());

	}
}
