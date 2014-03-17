package com.senac.pessoa;


public class Controller {
	
	public static void main (String args[]){

		View v = new View();
		Pessoa p = new Pessoa();
		Adicional adicional = new Adicional();
		adicional.obtemView();
		adicional.toString();
		System.out.println(adicional);



	}

	
	
}
