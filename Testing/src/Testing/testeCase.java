package Testing;

import Jogo.aluno;
import Jogo.pessoa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Jogo.jogo;

class testeCase {

	@Test
	void verificaNaoContratado() {
		pessoa pessoa = new pessoa(80);
		String output = "";
		
		output = pessoa.Contratacao();
		
		assertEquals("Sem contrato", output);
	}
	
	@Test
	void verificaIdade() {
		pessoa pessoa =  new pessoa(80);
		boolean output = true;
		
		if(pessoa.getIdade() <= 0);
			output = false;
		assertEquals(true, output);
	}

}
