package Iphone;

import POO_Desafio.AparelhoEletronico;
import POO_Desafio.NavegadorNaInternet;
import POO_Desafio.ReprodutorMusical;

public class Sistema implements AparelhoEletronico, NavegadorNaInternet, ReprodutorMusical {
    	
	   public String ligar() {
			// TODO Auto-generated method stub
		   AparelhoEletronico.ligar();
		   return "Aparelho ligado";
		}
	   
	   public void atender() {
		// TODO Auto-generated method stub
		   
		AparelhoEletronico.atender();

	}

	   public void iniciarcorreioVoz() {
		// TODO Auto-generated method stub
		AparelhoEletronico.iniciarcorreioVoz();
		  
	}
	   
	   public void exiberPagina() {
		// TODO Auto-generated method stub
		   
		NavegadorNaInternet.exiberPagina();

	}
	   
	   public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		   NavegadorNaInternet.adicionarNovaAba();

	}
	   
	   public void atualizarPagina() {
		// TODO Auto-generated method stub
		   NavegadorNaInternet.atualizarPagina();

	}
	   
	   public void tocar() {
		// TODO Auto-generated method stub
		   ReprodutorMusical.tocar();
	}
	   
		  
		public void pausar() {
			// TODO Auto-generated method stub
			ReprodutorMusical.pausar();
		}
		
		public void selecionarMusica() {
			// TODO Auto-generated method stub
			ReprodutorMusical.selecionarMusica();

		}
	   
}
