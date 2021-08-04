package AulaRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int idade=1, contador=0, contador2=0;
		
		while (idade!=99) {
			System.out.println("Digite a idade: ");
			idade=in.nextInt();
		
		
		if (idade<=21) {
			    
			     contador++;
			}
			
			else if (idade>=50 && idade<=99) {
				contador2++;
				}
		}
			
		System.out.println("você possui: "+contador + "com menos de 21 anos");
		System.out.println("você possui: "+contador2 + "com mais de 50 anos");
				
		
				in.close();
		
		
		

	

}
}
