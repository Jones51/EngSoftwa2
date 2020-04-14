package Jogo;

public class participante {
	private int id;
	private String nome;
	private double pontuacao;
	
	public participante(String nome, double pontuacao) {
		this(0, nome);
		this.pontuacao = pontuacao;
	}

	public participante(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		participante other = (participante) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public double getPontuacao() {
		return pontuacao;
	}
}
