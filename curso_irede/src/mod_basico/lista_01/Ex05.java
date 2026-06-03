package lista_01; 

import java.util.Scanner;

public class Ex05 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String entradaUser = sc.nextLine();
		StringBuilder texto = new StringBuilder(entradaUser.toLowerCase());
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == 'e') {
				texto.setCharAt(i, '*');
			}
		}
		System.out.println(texto);
		sc.close();
		
	}
}
