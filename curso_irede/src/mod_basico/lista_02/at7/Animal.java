package lista_02.at7;

public class Animal {
	public Animal(String name) {
		super();
		this.name = name;
	}


	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void fazerSom() {
		System.out.println("Estou fazendo um som");
	}
}
