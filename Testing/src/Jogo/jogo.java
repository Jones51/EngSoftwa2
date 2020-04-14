package Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jogo {
	private String descricao;
	private List<resultado> resultados;
	private List<rodada> rodadas;
	private List<participante> participantes;
	
	public jogo(String descricao, int rodadas) {
		this.descricao = descricao;
		this.resultados = new ArrayList<resultado>();
	}
	
	public void anota(resultado resultado) {
		if(resultados.isEmpty() || 
                !resultados.get(ultimoResultadoVisto()).getParticipante().equals(resultado.getParticipante())) {
            resultados.add(resultado);
        }
	}
	
	private int ultimoResultadoVisto() {
		return resultados.size()-1;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<resultado> getResultados() {
		return Collections.unmodifiableList(resultados);
	}
	
	public List<rodada> getRodadas() {
		return Collections.unmodifiableList(rodadas);
	}
	
	public List<participante> getParticipante() {
		return Collections.unmodifiableList(participantes);
	}

}
