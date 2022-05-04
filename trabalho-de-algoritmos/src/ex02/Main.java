package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int N, E = 1, i, j, num, fatorial;

		System.out.println("digite um numero inteiro e positivo");
		N = entrada.nextInt();
		
		
		if (N < 0) {
			System.out.println("O Número digitado não é positivo");
			return;
		}

		for (i = 1; i <= N; ++i) {

			num = (int) (1.0 / i);

			fatorial = 1;

			for (j = num; j > 0; --j) {

				fatorial *= num;

			}

			E += fatorial;

		}

		System.out.println("Valor de 'E': " + E);

	}
}
