package Class;

import java.util.Scanner;

public class NumPar {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int num1 = entrada.nextInt();
		
		System.out.println((num1 % 2 == 0 ? "O número é par" : "O número é ímpar"));
		
		entrada.close();
	}

}
