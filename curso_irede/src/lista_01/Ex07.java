package lista_01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("número inválido");
		} else {
			System.out.println(factSolve(num));
		}
		sc.close();
		
	}
	public static int factSolve(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		return num * factSolve(num-1);
	}
}
