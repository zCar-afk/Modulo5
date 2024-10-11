package Atividade8;

public class ControleRemoto {
    private boolean ligada;
    private int volume;
    private int canal;
    private boolean muteAtivado;

    public ControleRemoto() {
        this.ligada = false;
        this.volume = 50; 
        this.canal = 1;   
        this.muteAtivado = false;
    }

    public void ligarDesligar() {
        if (ligada) {
            System.out.println("Desligando a TV...");
        } else {
            System.out.println("Ligando a TV...");
        }
		ligada = !ligada;
        }
    

    public void aumentarVolume() {
        if (ligada && !muteAtivado) {
            if (volume < 100) {
                volume++;
                System.out.println("Volume aumentado para: " + volume);
            } else {
                System.out.println("Volume já está no máximo!");
            }
        }
    }

    public void diminuirVolume() {
        if (ligada && !muteAtivado) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume diminuído para: " + volume);
            } else {
                System.out.println("Volume já está no mínimo!");
            }
        }
    }


    public void aumentarCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal trocou para o: " + canal);
        }
    }

 
    public void diminuirCanal() {
        if (ligada) {
            if (canal > 1) {
                canal--;
                System.out.println("Canal trocou para o : " + canal);
            } else {
                System.out.println("Não foi possível Mudar de Canal!");
            }
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligada) {
            if (novoCanal > 0) {
                canal = novoCanal;
                System.out.println("Canal trocado para: " + canal);
            } else {
                System.out.println("Número de canal inválido.");
            }
        }
    }

    public void consultarStatus() {
        if (ligada) {
            System.out.println("TV está ligada.");
            System.out.println("Volume atual: " + (muteAtivado ? "Mudo" : volume));
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("TV está desligada.");
        }
    }

    public void ativarMute() {
        if (ligada) {
            muteAtivado = !muteAtivado;
            if (muteAtivado) {
                System.out.println("TV em modo Mute.");
            } else {
                System.out.println("Mute desativado.");
            }
        }
    }
}



