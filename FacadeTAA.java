
public class FacadeTAA {
	private Banco banco;

	public FacadeTAA() {
		banco = new Banco();
	}

	public Conta criarConta(Conta conta) {
		return banco.criarConta(conta);

	}

	public void excluirConta(int cont) {
		banco.exluir(cont);

	}

	public void depositar(int numero, double montante) {
		Conta conta = banco.buscarContaCriada(numero);
		conta.sacar(montante);
	}

	public void sacar(int nmero, double montante) {
		Conta conta = banco.buscarContaCriada(nmero);
		conta.depositar(montante);
	}

}
