package AulaRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner (System.in);
		
		int contador=0, contador2=0;
		int num;
		
for (int n1=1; n1<=10; n1++) {
	
	System.out.println("Digite o " +n1+ "� n�mero");
	num=ler.nextInt();
			
			if (num%2==0) {
				
				contador++;
				
			}
			
			else if (num%2!=0) {
				
				contador2++;
			
			}
			
			System.out.println("Foram digitados: " +contador + " n�meros pares");
			System.out.println("Foram digitados: " +contador2 + " n�meros �mpares");
		}

ler.close();

	}

}
