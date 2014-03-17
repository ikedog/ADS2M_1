package com.senac.pessoa;

public class Adicional {
	
	View view;
	public Adicional(){
		
		view = new View();
		
	}
	
	public View obtemView(){
		
		return this.view;
	}
	
	public String toString(){
		return view.toString();
		
		
	}

}
