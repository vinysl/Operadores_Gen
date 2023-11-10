package OlaMundo;

import java.util.Scanner;

public class LacoRepFor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("\nDigite o primeiro número");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo número");
		num2 = leia.nextInt();
		
		if (num1 < num2) {
			System.out.println("\nNo intervalo entre "+num1+" e "+num2+" \n");
			for (int i = num1; i<= num2; i++) {
				if (i % 3 == 0 && i %5 ==0) {
					System.out.println(i+" é multiplo de 3 e de 5.");
				}
			}
		}else
			System.out.println("\nO primeiro número tem que ser maior do que o segundo...");

	}

}
