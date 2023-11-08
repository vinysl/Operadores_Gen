package OlaMundo;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salBruto, adNoturno, he, desc, salLiq;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto: ");
		salBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adNoturno = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		he = leia.nextFloat();
		System.out.println("Digite os descontos: ");
		desc = leia.nextFloat();
		
		salLiq = salBruto + adNoturno + (he*5) - desc;
		System.out.println("O salário liquido é de R$: " +salLiq);

	}

}
