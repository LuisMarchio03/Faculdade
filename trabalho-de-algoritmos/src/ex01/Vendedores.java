package ex01;

import java.util.Scanner;

public class Vendedores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String NV1, NV2; // nome dos vendedores 1 e 2.
		int maior = 0, menor = 0, TV1, TV2;// Total de vendas do vendedor 1 e 2 e maior e menor.
		double media, C1 = 0, C2 = 0;// comissao de vendas do vendedor 1 e 2 e m�dia.

		System.out.println("Digite o nome dos vendedores: ");
		NV1 = entrada.nextLine();
		NV2 = entrada.nextLine();

		System.out.println("Insira o total de vendas do primeiro e segundo vendedor: ");
		TV1 = entrada.nextInt();
		TV2 = entrada.nextInt();

		// Se para o TV1

		if (TV1 > 5000) {
			C1 = TV1 * 0.10;
		}
		if (TV1 >= 3000 && TV1 <= 5000) {
			C1 = TV1 * 0.07;
		} else if (TV1 < 3000) {
			C1 = TV1 * 0.05;
		}

		// Se para o TV2

		if (TV2 > 5000) {
			C2 = TV2 * 0.10;
		}
		if (TV2 >= 3000 && TV2 <= 5000) {
			C2 = TV2 * 0.07;
		} else if (TV2 < 3000) {
			C2 = TV2 * 0.05;
		}

		System.out.printf("A comissao do primeiro vendedor ser� de: %.2f", C1 + TV1);
		System.out.printf("\nA comissao do segundo vendedor ser� de: %.2f", C2 + TV2);

		media = (TV1 + TV2) / 2;
		System.out.println("\nA m�dia de venda de todos os vendedores �: " + media);

		for (int i = 0; i < 2; i++) {
			if (TV1 > TV2) {
				maior = TV1;
			}
			if (TV1 < TV2) {
				menor = TV1;
			}
			if (TV2 > TV1) {
				maior = TV2;
			} else if (TV2 < TV1) {
				menor = TV2;
			}

		}

		System.out.println("A Maior comiss�o ser� do vendendor: " + maior);
		System.out.println("A Menor comiss�o ser� do vendendor: " + menor);

	}

}
