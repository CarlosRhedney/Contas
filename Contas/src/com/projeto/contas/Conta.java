package com.projeto.contas;

public class Conta {
	/**
	 * @autor Carlos Rhedney
	 */
	private int numeroConta;
	private double saldo = 100;
	
	public void deposito(double valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
	}
	
	public void saque(double valorSaque) {
		this.saldo = this.saldo - valorSaque;
	}
	
	public double saldoConta() {
		return this.saldo;
	}

}
