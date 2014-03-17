package com.senac.pessoa;

public class Pessoa {
	 private String nome;
	 private String endereco;
	 private String snome;
	 public String getSnome() {
		return snome;
	}
	public void setSnome(String snome) {
		this.snome = snome;
	}
	Telefone telefone = new Telefone();
	 
	 public String getNome() {
	  return nome;
	 }
	 public Telefone getTelefone() {
	  return telefone;
	 }
	 public void setTelefone(Telefone telefone) {
	  this.telefone = telefone;
	 }
	 public void setNome(String nome) {
	  this.nome = nome;
	 }
	 public String getEndereco() {
	  return endereco;
	 }
	 public void setEndereco(String endereco) {
	  this.endereco = endereco;
	 }
	@Override
	public String toString() {
		return "Contato:\n [Nome: "+ nome + " "
				+ snome + ", Endereço:" + endereco + ", tipo= "+telefone.getTipo()+", numero=" + telefone.getNumero()+"]\n";
	}

	 
	 
	}
	
	