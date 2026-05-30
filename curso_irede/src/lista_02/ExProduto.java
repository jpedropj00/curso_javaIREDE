package lista_02;

import java.util.Scanner;

public class ExProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);
		produto.getNome();
		produto.getPreco();
		produto.getQuantidadeEstoque();
		produto.setPreco(80.0);
	}
}
