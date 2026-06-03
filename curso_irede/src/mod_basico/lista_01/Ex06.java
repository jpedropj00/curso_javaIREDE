package lista_01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String args[]) {
		String[] vect = {"Maria", "João","Carlos", "Ana", "Beatriz"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nomeUser = sc.nextLine();
		boolean controller = false;
		for (int i = 0; i > vect.length; i++) {
			if (vect[i] == nomeUser) {
				controller = true;
				break;
			}
		}
		if (controller == true) {
			System.out.println("Nome na lista");
		} else {
			System.out.println("Nome não está na lista");
		}
		sc.close();
		
	}
}
