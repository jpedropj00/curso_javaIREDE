package lista_01;
import java.util.Scanner;

public class Ex09 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nameUser = sc.nextLine();
		nameUser = nameUser.trim();
		String[] nameDivided = nameUser.split(" ");
		String firstName = nameDivided[0];
		String lastName = nameDivided[nameDivided.length - 1];
		System.out.println("Primeiro nome: " + firstName);
		System.out.println("Último nome: " + lastName);
		sc.close();
		
	}
}
