package factory;

import exceptions.DadosInvalidosException;
import model.entitis.Administrador;
import model.entitis.Empregado;
import model.entitis.Fornecedor;
import model.entitis.Operario;
import model.entitis.Pessoa;
import model.entitis.Vendedor;

public class Factory {
	
	public static Pessoa getPessoa(String nome, String endereco, String telefone) {
		return new Pessoa(nome, endereco, telefone);
	}
	
	public static Fornecedor getFornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) throws DadosInvalidosException {
		return new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);
	}
	
	public static Empregado getEmpregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto) throws DadosInvalidosException {
		return new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
	}
	
	public static Administrador getAdministrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double ajudaDeCusto) throws DadosInvalidosException {
		return new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);
	}
	
	public static Operario getOperario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double valorProducao, int comissao) throws DadosInvalidosException {
		return new Operario(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorProducao, comissao);
	}
	
	public static Vendedor getVendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double valorVendas, int comissao) throws DadosInvalidosException {
		return new Vendedor(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorVendas, comissao);
	}
		
}
