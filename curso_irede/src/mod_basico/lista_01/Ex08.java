package lista_01;

import java.util.Scanner;

public class Ex08 {
	public static void main(String args[]) {
		boolean controller = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("""
				MENU:
				1 - Dizer Olá
				2 - Dizer Tchau
				3 - Encerrar
				""");
		while (controller) {
			System.out.println("Digite sua escolha:");
			int resp = sc.nextInt();
			
			switch (resp) {
			case 1:
				System.out.println("Olá");
				break;
			case 2:
				System.out.println("Tchau");
				break;
			case 3:
				System.out.println("Encerrando");
				controller = false;
				break;
			default:
				System.out.println("Valor inválido");
				break;
			} 
			
		}
		sc.close();
	}
}
