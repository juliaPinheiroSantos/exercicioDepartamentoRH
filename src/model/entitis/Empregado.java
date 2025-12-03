package model.entitis;

import exceptions.DadosInvalidosException;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private int imposto;
	
	public Empregado() {
		super();
	}
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto) throws DadosInvalidosException {
		super(nome, endereco, telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
		
	}
	
	public int getCodigoSetor() {
		return this.codigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor) throws DadosInvalidosException {
		if(codigoSetor < 0)
			throw new DadosInvalidosException("Código não pode ser menor que zero");
		
		this.codigoSetor = codigoSetor;
		
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) throws DadosInvalidosException {
		if(salarioBase < 0.00) 
			throw new DadosInvalidosException("Salário base não pode ser menor que zero");
		
		this.salarioBase = salarioBase;
	}
	
	public int getImposto() {
		return this.imposto;
	}
	
	public void setImposto(int imposto) throws DadosInvalidosException {
		if(imposto < 0 && imposto > 100) 
			throw new DadosInvalidosException("Imposto não pode ser menor que zero ou maior que 100");
		
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		double imposto = (this.imposto/100)*this.salarioBase;
		return this.getSalarioBase() - imposto;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCódigo Setor: " + getCodigoSetor() + "\nSalário Base: " + getSalarioBase() + "\nImposto: " + getImposto();
	}

}
