package model.entitis;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		
	}
	
	public Pessoa(String nome, String telefone) {
		this.setNome(nome);
		this.setTelefone(telefone);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.equals("")) 
			throw new IllegalArgumentException("Nome está vazio!");
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		if(endereco == null || endereco.equals(""))
			throw new IllegalArgumentException("Endereço está vazio!");
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		if(telefone == null || telefone.equals(""))
			throw new IllegalArgumentException("Telefone está vazio");
	}
	
	@Override
	public String toString(){
		return "Nome: " + getNome() + "\nEndereço: " + getEndereco() + "\nTelefone: " + getTelefone();
	}

}
