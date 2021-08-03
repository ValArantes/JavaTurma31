package AulaJava2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

        Scanner ler= new Scanner (System.in);
		
		double n1, b;
		
		System.out.println("Digite um número: ");
		n1=ler.nextDouble();
	
		
		if (n1%2==0) {
			
			b = Math.sqrt(n1);
			System.out.println("Seu número é par e sua raiz quadrada é: "+b);
		}
		
		else {
			
			n1= (n1)*(n1);
			System.out.println("Seu número é impar e sua potência é: "+ n1);
		}
		
		ler.close();
		
		
	}

}
