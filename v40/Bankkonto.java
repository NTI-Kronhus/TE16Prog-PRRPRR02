
public class Bankkonto {

	private static int COUNTER = 0;
	private static double WITHDRAW_FEE = 1.01;

	private int kontonummer;
	private double saldo;
	private int kod;
	private String ägare;

	public Bankkonto(String ägare, int kod) {
		Bankkonto.COUNTER++;
		this.kontonummer = Bankkonto.COUNTER;
		this.ägare = ägare;
		this.kod = kod;
		this.saldo = 0;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int deposit(double summa) {
		if (summa < 0) {
			return 2;
		}

		this.saldo += summa;
		return 1;
	}

	public int withdraw(double summa, int kod) {
		if (this.kod != kod) {
			return 3;
		}
		if (summa < 0) {
			return 2;
		}
		if (this.saldo - WITHDRAW_FEE * summa < 0) {
			return 4;
		}

		this.saldo -= WITHDRAW_FEE * summa;
		return 1;
	}

}
