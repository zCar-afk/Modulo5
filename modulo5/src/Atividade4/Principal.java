package Atividade4;

public class Principal {

	public static void main(String[] args) {
		Quadrado q = new Quadrado("Quadrado");
		q.altura = 10;
		q.largura = 10;
		System.out.println("Forma: " + q.imprimirNome());
		System.out.println("Área: " + q.calcularArea());
		
		Circulo c = new Circulo("Circulo");
		c.raio = 5;
		c.pi = 3.14;
		System.out.println("\nForma: " + c.imprimirNome());
		System.out.println("Área: " + c.calcularArea());
		
		Retangulo r = new Retangulo("Retângulo");
		r.altura = 12;
		r.largura = 6;		
		System.out.println("\nForma: " + r.imprimirNome());
		System.out.println("Área: " + r.calcularArea());
		
		Triangulo t = new Triangulo("Triângulo");
		t.altura = 10;
		t.largura = 5;
		System.out.println("\nForma: " + t.imprimirNome());
		System.out.println("Área: " + t.calcularArea());
	}
}