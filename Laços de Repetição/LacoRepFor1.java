package OlaMundo;

import java.util.Scanner;

public class LacoRepFor1 {

	public static void main(String[] args) {
		int num,qntdPar = 0,qntdImpar = 0, cont = 1, soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		for (num = 1; num <=9; cont++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				qntdPar ++;
			}
			else {
				qntdImpar++;
			}
		}
		
		System.out.println("\n O total de números pares é de: "+qntdPar);
		System.out.println("\n O total de números impares é de: "+qntdImpar);

	}

}
