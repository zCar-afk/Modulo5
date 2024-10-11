package Atividade2;

public class Principal {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Messi", 50000.00);
		System.out.println(empregado);

		Gerente gerente = new Gerente("André", 100000.00, "RH");
		System.out.println(gerente);

		Vendendor vendedor = new Vendendor("Cold Palmer", 150000.00, 10);
		System.out.println(vendedor);
	}
}
