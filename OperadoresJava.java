package OlaMundo;

import java.util.Scanner;

public class OperadoresJava {

	public static void main(String[] args) {
		
		float n1,n2,n3,media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1=leia.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		n2=leia.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		n3=leia.nextFloat();
		
		media = (n1*2+n2*3+n3*5)/10;
		System.out.println("A média ponderada é de: " +media);

	}

}
