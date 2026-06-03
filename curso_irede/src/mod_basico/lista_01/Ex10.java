package lista_01;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String palavra = sc.nextLine();
		String[] vect = palavra.split(" ");
		System.out.println("A frase tem " + vect.length + " palavras");
		sc.close();
	}
}
