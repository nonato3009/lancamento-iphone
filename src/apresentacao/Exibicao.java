package apresentacao;

import dispositivos.intenet.AtualizarPagina;
import dispositivos.intenet.ExibirPagina;
import dispositivos.intenet.NovaAba;
import dispositivos.iphone.Iphone;
import dispositivos.ipode.Pausar;
import dispositivos.ipode.Selecionar;
import dispositivos.ipode.Tocar;
import dispositivos.phone.Atender;
import dispositivos.phone.CorreioDeVoz;
import dispositivos.phone.Ligar;

public class Exibicao {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		Tocar ipodeTocar = new Tocar();
		Pausar ipodePausar = new Pausar();
		Selecionar ipodeSelecionar = new Selecionar();
		
		Ligar phoneLigar = new Ligar();
		Atender phoneAtender = new Atender();
		CorreioDeVoz phoneCorreioDeVoz = new CorreioDeVoz();
		
		ExibirPagina internetExibirPagina = new ExibirPagina();
		NovaAba internetNovaAba = new NovaAba();
		AtualizarPagina internetAtualizarPagina = new AtualizarPagina();
		
		System.out.println("<< OPERAÇÕES NO IPODE >>");
		ipodeTocar.ReprodutorMusical();
		ipodePausar.ReprodutorMusical();
		ipodeSelecionar.ReprodutorMusical();
		System.out.println();
		
		System.out.println("<< OPERAÇÕES NO TELEFONE >>");
		phoneLigar.AparelhoTelefonico();
		phoneAtender.AparelhoTelefonico();;
		phoneCorreioDeVoz.AparelhoTelefonico();
		System.out.println();
		
		System.out.println("<< OPERAÇÕES NO NAVEGADOR DE INTERNET >>");
		internetExibirPagina.NavegadorInternet();
		internetNovaAba.NavegadorInternet();
		internetAtualizarPagina.NavegadorInternet();
		System.out.println();
		
		System.out.println("<< TRÊS OPERAÇÕES EM UM DISPOSITVO IPHONE >>");
		iphone.ReprodutorMusical();
		iphone.AparelhoTelefonico(); 
		iphone.NavegadorInternet();
	}
}
