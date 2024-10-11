package Atividade8;

public class Principal {
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();

		controle.ligarDesligar();
		controle.aumentarVolume();
		controle.diminuirVolume();
		controle.aumentarCanal();
		controle.trocarCanal(45);
		controle.ativarMute();
		controle.consultarStatus();
		controle.ativarMute();
		controle.ligarDesligar();
	}
}
