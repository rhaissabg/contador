package application;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int parametro1, parametro2;

		System.out.print("Digite o 1º parâmetro: ");
		parametro1 = sc.nextInt();

		System.out.print("Digite o 2º parâmetro: ");
		parametro2 = sc.nextInt();

		try {
			contar(parametro1, parametro2);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

	static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

		if (parametro2 > parametro1) {
			int diferenca = parametro2 - parametro1;
			for (int i = 1; i <= diferenca; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		} else {
			throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro!");
		}

	}

}
