
import java.util.ArrayList;

public class Banco {

	ArrayList<Conta> cars = new ArrayList<Conta>();

	public Conta criarConta(Conta conta) {
		cars.add(conta);
		System.out.print("CONTA CRIADA");
		return conta;
	}

	public void exluir(int numero) {
		
		for (int i = 0; i < cars.size(); i++) {
			if (numero == cars.get(i).getNumeroDaConta()) {
				cars.remove(i);
			}
		}

		System.out.print("removido");

	}

	public Conta buscarContaCriada(int numero) {
		Conta conta = null;
		for (int i = 0; i < cars.size(); i++) {
			if (numero == cars.get(i).getNumeroDaConta()) {
				conta = cars.get(i);

			}

		}
		return conta;
	}
}
