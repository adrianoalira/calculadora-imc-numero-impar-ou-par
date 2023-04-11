package Class;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// CRIANDO UM OBJETO (objetoPessoa)
		// neste caso, temos uma classe (sem o método main) com o nome Pessoa
		
		Pessoa objetoPessoa = new Pessoa();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu peso: ");
		objetoPessoa.setPeso(entrada.nextFloat());

		System.out.println("Digite sua altura: ");
		objetoPessoa.setAltura(entrada.nextFloat());

		System.out.println("Seu IMC é: " + objetoPessoa.calcularIMC());

		entrada.close();

	}

}
