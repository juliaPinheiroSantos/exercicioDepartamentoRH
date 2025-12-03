package model.entitis;

import exceptions.DadosInvalidosException;

public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double ajudaDeCusto) throws DadosInvalidosException {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setAjudaDeCusto(ajudaDeCusto);
		
	}
	
	public double getAjudaDeCusto() {
		return this.ajudaDeCusto;
	}
	
	public void setAjudaDeCusto(double ajudaDeCusto) {
		if(ajudaDeCusto > 0.00) {
			this.ajudaDeCusto = ajudaDeCusto;
		}
	}
	
	@Override
	public double calcularSalario() {
		double salarioEmpregado = super.calcularSalario();
		return salarioEmpregado + this.getAjudaDeCusto();
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nAjuda de Custo: " + getAjudaDeCusto(); 
	}
}
