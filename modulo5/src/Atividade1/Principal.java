package Atividade1;

public class Principal {
	public static void main(String[] args) {

		Evento evento = new Evento("Fluminense x Real Madrid.");
		System.out.println("Partidade entre Fluminensa x Real Madrid: ");

		Ingresso ingresso1 = new Ingresso(50);
		Ingresso ingresso2 = new Ingresso(50);
		Ingresso ingresso3 = new Ingresso(50);
		Ingresso ingresso4 = new Ingresso(50);
		IngressoVIP ingressoVip1 = new IngressoVIP(150, 100);

		evento.adicionarIngresso(ingresso1);
		evento.adicionarIngresso(ingresso2);
		evento.adicionarIngresso(ingresso3);
		evento.adicionarIngresso(ingresso4);
		evento.adicionarIngresso(ingressoVip1);

		evento.mostrarIngressosNaoVendidos();

		evento.venderIngresso(ingresso1);
		evento.venderIngresso(ingresso3);
		evento.venderIngresso(ingressoVip1);

		evento.mostrarIngressosNaoVendidos();

		double valorTotal = evento.ValorTotalVendido();
		System.out.println("\nValor total dos ingressos vendidos: R$ " + valorTotal);
	}
}
