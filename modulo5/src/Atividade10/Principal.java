package Atividade10;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do produto: ");
		String nome = scanner.nextLine();

		System.out.print("Informe o preço de custo do produto: ");
		double precoCusto = scanner.nextDouble();

		System.out.print("Informe o preço de venda do produto: ");
		double precoVenda = scanner.nextDouble();

		System.out.print("Informe as despesas da empresa para esse produto: ");
		double despesas = scanner.nextDouble();

		Produto produto = new Produto(nome, precoCusto, precoVenda, despesas);

		produto.calculaMargemLucro();

		System.out.printf("A margem de lucro do produto %s é: %.2f%%\n", produto.getNome(), produto.getMargemLucro());

		scanner.close();
	}
}
