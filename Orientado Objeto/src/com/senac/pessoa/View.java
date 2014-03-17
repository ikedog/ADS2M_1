package com.senac.pessoa;
import java.util.Random;
import java.util.Scanner;

public class View{
 
 Pessoa[] pessoa = new Pessoa[5];
 
 public String sorteiaNome(){
  Random r = new Random();
  String snome[] ={"alonso","bernardo","claudio","deverson","evenilson"};
  return snome[r.nextInt(5)];
 }
 
 public String sorteiaSobrenome(){
	  Random r = new Random();
	  String snome[] ={"silva","leite","souza","kila","oliveira"};
	  return snome[r.nextInt(5)];
	 }
	 
 
 public String sorteiaEndereco(){
  Random r = new Random();
  String endereco[] ={"rua","avenida","travessa","beco","lote"};
  return endereco[r.nextInt(5)];
 }
 
 public View(){
  String nome;
  String endereco;
  String snome;
  Scanner entrada=new Scanner(System.in);
  
  
  for(int i=0; i < 5;i++){
   Telefone telefone=new Telefone();
   pessoa[i]=new Pessoa();
   nome = sorteiaNome();
   snome = sorteiaSobrenome();
   endereco = sorteiaEndereco();
   pessoa[i].setNome(nome);
   pessoa[i].setSnome(snome);
   pessoa[i].setEndereco(endereco);
   System.out.println("Digite o telefone");
   telefone.setNumero(entrada.next());
   System.out.println("Digite o tipo: 1- Casa/n2- Trabalho/n3- Celular");
   telefone.setTipo(entrada.next());
   pessoa[i].setTelefone(telefone);
  }
 }

 public String toString() {
  String saida="Agenda\n";
  for(int i=0; i < 5;i++){
   saida=saida+pessoa[i].toString()+"\n";
  }
  return saida;
    
 }
 
}