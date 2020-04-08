package com.projeto.contas;

public class ClassePrincipal {
	/**
	 * @autor Carlos Rhedney
	 */

	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println(conta.saldoConta());
		conta.deposito(100);
		System.out.println(conta.saldoConta());
		conta.saque(120);
		System.out.println(conta.saldoConta());

	}

}
