
public class Conta {
	
	private double valor;
	private String titular;
	private int numeroDaConta;

	public void depositar(double montante) {
		this.valor += montante;
	}

	public void sacar(double montante) {
		this.valor -= montante;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

}
