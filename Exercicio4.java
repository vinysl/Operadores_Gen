package OlaMundo;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float n1a,n2a,n3a,n4a,difA;
		float n1b,n2b,n3b,n4b,difB;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero da tabela A: ");
		n1a = leia.nextFloat();
		System.out.println("Entre com o segundo  numero da tabela A: ");
		n2a = leia.nextFloat();
		System.out.println("Entre com o terceiro numero da tabela A: ");
		n3a = leia.nextFloat();
		System.out.println("Entre com o quarto numero da tabela A: ");
		n4a = leia.nextFloat();
		
		System.out.println("\nEntre com o primeiro numero da tabela B: ");
		n1b = leia.nextFloat();
		System.out.println("Entre com o segundo  numero da tabela B: ");
		n2b = leia.nextFloat();
		System.out.println("Entre com o terceiro numero da tabela B: ");
		n3b = leia.nextFloat();
		System.out.println("Entre com o quarto numero da tabela B: ");
		n4b = leia.nextFloat();
		
		difA = (n1a*n2a) - (n3a*n4a);
		System.out.println("A diferença é de: " +difA);
		difB = (n1b*n2b) - (n3b*n4b);
		System.out.println("\nA diferença é de: " +difB);

	}

}
