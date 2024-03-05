package Iphone;

import java.util.Scanner;

public class Iphone {
	
	public static void main(String[] args) {
		
		Sistema iphone = new Sistema();
		
		iphone.ligar();
		
		
		System.out.println("Qual APP voce deseja usar ? ");
		System.out.println("1-Reproducao de musica ou 2- Internet ?");
		Scanner scanner = new Scanner(System.in);
		int numeroAPP = scanner.nextInt();
		
		
		
		switch (numeroAPP) {
		case 1: {
			iphone.selecionarMusica();
			iphone.tocar();
			break;
			
			
		}
		case 2 : {
			iphone.adicionarNovaAba();
			iphone.exiberPagina();
			break;
		}
		default:
			System.out.println("erro tente novamente");
			break;
		}
		
		
	}
}
