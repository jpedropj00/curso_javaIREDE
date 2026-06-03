package lista_01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		System.out.println("Tabuada: ");
		for (int i = 0; i < 11; i++) {
			System.out.println(num + " x " + i + " = "+ num*i);
		}
	sc.close();	
	}
}
