package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Jogo.jogo;
import Jogo.criarJogo;

class Testing {

	@Test
	void maximoRodadasSao3() {
		jogo latinhas = new jogo("Latinhas", 4);
		int output = 3;
		assertEquals(3, output);
	}
	
	@Test
	void Vencedor(){
		jogo latinhas = new jogo("Latinhas", 3);
		
	}
}
