package Jogo;

public class pessoa {
	private int idade;
	
	public pessoa(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	
	public String Contratacao() {
		String contratacao = "";
		
		if(idade > 55) 
			contratacao = "Sem contrato";
		else if(idade >= 18) 
			contratacao = "Integral";
		else if(idade >= 16)
			contratacao = "Parcial";
		else
			contratacao = "Sem contrato";
		
		return contratacao;
	}
}
