package AulaJava2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade=ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Sua categoria ? infantil");
		}

		else if (idade>=15 && idade<=17) {
			System.out.println("Sua categoria ? Juvenil");
		}
		
		else if (idade>=18 && idade <=25) {
			System.out.println("Sua categoria ? Adulto");
		}
		
		else {
			System.out.println("Maior que 25 anos, categoria n?o registrada");
		}
		
		ler.close();
	}

}
