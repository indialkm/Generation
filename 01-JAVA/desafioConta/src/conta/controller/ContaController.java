package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub

		var conta = buscarNaCollection(numero);
		System.out.println(conta);

		if (conta != null) {
			conta.visualizar();
		} else {
			System.out.println("\n A conta número" + numero + " não foi encontrado!");
		}
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		for (var conta : listaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		// TODO Auto-generated method stub
		listaContas.add(conta);
		System.out.println("\nA conta número: " + conta.getNumero() + " foi criada com sucesso!");

	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		var buscaConta = buscarNaCollection(conta.getNumero());
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA conta numero: " + conta.getNumero() + " foi atualizado com sucesso");
		} else {
			System.out.println("\nA conta numero: " + conta.getNumero() + " não foi encontrada!");
		}
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("\nA conta numero: " + numero + " foi deletada com sucesso!");

		} else
			System.out.println("\nA Conta numero " + numero + " não foi encontrada");

	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (conta.sacar(valor) == true)
				System.out.println("\nO saque na Conta numero: " + numero + " foi efetuado com sucesso");

		} else
			System.out.println("\nA Conta numero " + numero + " não foi encontrada");

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

		var conta = buscarNaCollection(numero);

		if (conta != null) {
			conta.depositar(valor);
			System.out.println("\nO depósito na conta numero: " + numero + " foi efetuado com sucesso!");
		} else
			System.out.println("\nA Conta numero " + numero + " não foi encontrada");
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);

		if (contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA tranferencia foi efetuada com sucesso!");
			}
		} else
			System.out.println("\nA Conta da Origem e/ou Destino não foram encontradas!");

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}

		return null;
	}

}
