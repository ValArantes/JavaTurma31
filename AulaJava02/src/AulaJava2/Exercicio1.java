package AulaJava2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

Scanner ler= new Scanner (System.in);
		
		int n1, n2,n3;
		
		System.out.println("Digite tr?s n?meros ");
		n1= ler.nextInt();
		n2= ler.nextInt();
		n3= ler.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("O maior n?mero ?: " +n1);
		}
		
		else if (n2>n1 && n2>n3) {
			System.out.println("O maior n?mero ?: " +n2);

		}
		
		else if (n3>n1 && n3>n2) {
			System.out.println("O maior n?mero ?: " +n3);

		}
		
		else {
			System.out.println("N?mero digitado inv?lido ");

		}
		
		ler.close();
		
	}

}
