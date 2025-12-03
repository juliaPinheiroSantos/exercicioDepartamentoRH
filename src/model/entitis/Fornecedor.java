package model.entitis;

import exceptions.DadosInvalidosException;

public class Fornecedor extends Pessoa{
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor() {
		super();
	}
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) throws DadosInvalidosException {
		super(nome, endereco, telefone);
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
		
		
	}
	
	public double getValorCredito() {
		return this.valorCredito;
	}
	
	public void setValorCredito(double valorCredito) throws DadosInvalidosException {
		if(valorCredito < 0.00) 
			throw new DadosInvalidosException("O valor de crédito não pode ser menor que 0.00");
		
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida() {
		return this.valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		if(valorDivida <= this.valorCredito) {
			this.valorDivida = valorDivida;
		}
	}
	
	public double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
	
	
	@Override
	public String toString(){
		return super.toString() + "\nValor Crédito: " + getValorCredito() + "\nValor Dívida: " + getValorDivida();
	}
}
