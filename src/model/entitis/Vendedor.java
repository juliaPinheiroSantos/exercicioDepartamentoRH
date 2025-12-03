package model.entitis;

import exceptions.DadosInvalidosException;

public class Vendedor extends Empregado{
	private double valorVendas;
	private int comissao;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double valorVendas, int comissao) throws DadosInvalidosException {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		setValorVendas(valorVendas);
		setComissao(comissao);
	}
	
	public double getValorVendas() {
		return this.valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		if(valorVendas >= 0.00) {
			this.valorVendas = valorVendas;
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
		double comissao = this.getValorVendas() + (this.getComissao()/100);
		return salarioEmpregado + comissao;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nValor Vendas: " + getValorVendas() + "\nComissao: " + getComissao();
	}
}
