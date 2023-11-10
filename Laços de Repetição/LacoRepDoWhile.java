package OlaMundo;

import java.util.Scanner;

public class LacoRepDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, soma = 0;
		
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		
		do {
			System.out.println("\nDigite o próximo número ou 0 para encerrar: ");
			
			if (num > 0) {
				soma = soma + num;
			}
			
			num = leia.nextInt();
		
		} while (num != 0);
		System.out.println("\n\tA soma dos numero positivos é de "+soma);
		System.out.println("\n\tPrograma encerrado!!! ");

	}

}
