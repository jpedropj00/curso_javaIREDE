package lista_02.atividade4;

public class Pessoa {
	public Pessoa(String nome) {
		this.nome = nome;
	}
	private String nome;

	public String getNome() {
		return nome;
	}
	public void HelloPeople() {
		System.out.println("Olá, meu nome é " + getNome());
	}
	
}
