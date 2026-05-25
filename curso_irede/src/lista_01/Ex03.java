package lista_01;

import java.util.Scanner;

public class Ex03 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o primeiro número: ");
		int num01 = sc.nextInt();
		System.out.println();
		System.out.println("Digite o segundo número: ");
		int num02 = sc.nextInt();
		System.out.println("""
				MENU:
				1 - Somar dois números
				2 - Subtrair dois números
				3 - Sair
				""");
		int entradaUser = sc.nextInt();
		switch (entradaUser) {
			case 1:
				System.out.println("A soma dos números é: " + (num01 + num02));
				break;
			case 2:
				System.out.println("A subtração dos valores é: " + (num01 - num02));
				break;
			case 3:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Entrada inválida");
				break;
		}
		sc.close();
		
	}
}
