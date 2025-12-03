package model.entitis;

import exceptions.DadosInvalidosException;

public class Operario extends Empregado{
	private double valorProducao;
	private int comissao;
	
	public Operario() {
		super();
	}
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double valorProducao, int comissao) throws DadosInvalidosException {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setValorProducao(valorProducao);
		this.setComissao(comissao);
	}
	
	public double getValorProducao() {
		return this.valorProducao;
	}
	
	public void setValorProducao(double valorProducao) {
		if(valorProducao >= 0.00) {
			this.valorProducao = valorProducao;
		}
	}
	
	public int getComissao() {
		return this.comissao;
	}
	
	public void setComissao(int comissao) {
		if(comissao > 0 && comissao <= 100) {
			this.comissao = comissao;
		}
	}
	
	@Override
	public double calcularSalario() {
		double salarioEmpregado = super.calcularSalario();
		double valorComissao = getValorProducao() *(getComissao()/100);
		return salarioEmpregado + valorComissao;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nValor Produção: " + getValorProducao() + "\nComissão: " + getComissao(); 
	}
}
