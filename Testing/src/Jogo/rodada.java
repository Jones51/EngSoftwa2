package Jogo;

import Jogo.participante;

public class rodada {
	private participante participante1;
	private participante participante2;
	private participante vencedor;
	
	public rodada(participante participante1, participante participante2) {
		this.participante1 = participante1;
		this.participante2 = participante2;
	}
	
	public participante getVencedor() {
		if(participante1.getPontuacao() > participante2.getPontuacao()) {
			vencedor = participante1;
		}
		else {
			vencedor = participante2;
		}
		
		return vencedor;
	}
}
