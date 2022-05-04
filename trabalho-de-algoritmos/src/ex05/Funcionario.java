package ex05;

public class Funcionario {
	public int cod;
	public double numeroHorasMes;
	public char turno;
	public char categoria;
	public double valorHora;

	public Funcionario(int cod, double numeroHorasMes, char turno, char categoria) {
		this.cod = cod;
		this.numeroHorasMes = numeroHorasMes;
		this.turno = turno;
		this.categoria = categoria;
		valorHora = calcularValorHora();
	}

	public double calcularValorHora() {
		if (categoria == 'G' && turno == 'N') {
			return 360;
		} else if (categoria == 'G' && turno == 'M' | turno == 'V') {
			return 300;
		} else if (categoria == 'O' && turno == 'N') {
			return 260;
		} else if (categoria == 'O' && turno == 'M' | turno == 'V') {
			return 200;
		} else {
			return 0;
		}
	}

	public double salarioInicial() {
		return valorHora * numeroHorasMes;
	}

	public double auxilioAlimentacao() {
		double salarioInicial = salarioInicial();

		if (salarioInicial <= 3000) {
			return 0.20 * salarioInicial;
		} else if (salarioInicial > 3000 && salarioInicial <= 5000) {
			return 0.15 * salarioInicial;
		} else {
			return 0.10 * salarioInicial;
		}
	}

	public double auxilioTransporte() {
		double salarioInicial = salarioInicial();
		if (salarioInicial <= 3000) {
			return 0.05 * salarioInicial;
		} else if (salarioInicial > 3000 && salarioInicial <= 5000) {
			return 0.04 * salarioInicial;
		} else {
			return 0.02 * salarioInicial;
		}
	}

	public double salarioFinal() {
		return salarioInicial() + auxilioAlimentacao() + auxilioTransporte();
	}

	public String toString() {
		return String.format(
				"C�digo: %d N�mero de horas trabalhadas: %.2f " + "Valor da hora: %.2f Sal�rio Inicial: %.2f "
						+ "Aux�lio Alimenta��o: %.2f Aux�lio Transporte: %.2f " + "Sal�rio Final: %.2f " + "%n",
				cod, numeroHorasMes, valorHora, salarioInicial(), auxilioAlimentacao(), auxilioTransporte(),
				salarioFinal());
	}
}
