package ex04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DadosGeraisHabitantes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		int quantidade = 0, filho = 0, totalFilhos = 0;
		float salario = 0, totalSalarios = 0, salarioMaior = 0, salarioMenor = 99999, totalSalariosAteMilReais = 0;

		do {
			quantidade += 1;

			System.out.println("Informe o salário: ");
			salario = entrada.nextFloat();

			System.out.println(salario <= -1 ? "" : "Informe o numero de filhos: ");
			filho = salario <= -1 ? 0 : entrada.nextInt();

			totalFilhos += filho;
			totalSalarios += salario;

			if (salarioMenor > salario && salario > -1)
				salarioMenor = salario;
			if (salarioMaior < salario)
				salarioMaior = salario;
			if (salario <= 1000)
				totalSalariosAteMilReais += 1;
		} while (salario > -1);

		if (quantidade == 1) {
			System.out.println(
					"\n" + "============================================================================== \n");
			System.out.println("Dados insuficientes! \n");
			return;
		}

		System.out.println("\n" + "============================================================================== \n");
		System.out.println("Médias gerais da população: \n");
		System.out.println("Salario medio: R$ " + formatador.format(totalSalarios / quantidade) + "\n");
		System.out.println("Maior salário: R$ " + formatador.format(salarioMaior) + "\n");
		System.out.println("Menor salário: R$ " + formatador.format(salarioMenor) + "\n");
		System.out.println("Percentual de pessoas com salário de até 1.000,00: "
				+ (totalSalariosAteMilReais * 100) / quantidade + "%" + "\n");

		System.out.println("Media da quantidade de filhos: " + totalFilhos / quantidade + "\n");
	}

}
