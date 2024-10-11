package Atividade1;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	private String nome;
	private List<Ingresso> ingressos;

	public Evento(String nome) {
		this.nome = nome;
		this.ingressos = new ArrayList<>();
	}

	public void adicionarIngresso(Ingresso ingresso) {
		ingressos.add(ingresso);
	}

	public void venderIngresso(Ingresso ingresso) {
		if (ingressos.contains(ingresso) && !ingresso.isVendido()) {
			ingresso.vender();
			System.out.println("Ingresso vendido: " + ingresso);
		} else {
			System.out.println("Ingresso Ja vendido ou Não esta disponivel.");
		}
	}

	public double ValorTotalVendido() {
		double total = 0;
		for (Ingresso ingresso : ingressos) {
			if (ingresso.isVendido()) {
				total += ingresso.getValor();
				if (ingresso instanceof IngressoVIP) {
					total += ((IngressoVIP) ingresso).getValor() - ingresso.getValor();
				}
			}
		}
		return total;
	}

	public void mostrarIngressosNaoVendidos() {
		boolean todosVendidos = true;
		System.out.println("Ainda Restam Esses Ingressos para serem vendidos:");
		for (Ingresso ingresso : ingressos) {
			if (!ingresso.isVendido()) {
				System.out.println(ingresso);
				todosVendidos = false;
			}
		}
		if (todosVendidos) {
			System.out.println("Todos os ingressos foram vendidos.");
		}
	}
}
