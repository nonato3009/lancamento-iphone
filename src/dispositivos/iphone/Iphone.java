package dispositivos.iphone;

import dispositivos.intenet.Internet;
import dispositivos.ipode.IPode;
import dispositivos.phone.Phone;

public class Iphone implements IPode, Phone, Internet{
	
	public void ReprodutorMusical() {
		System.out.println("TOCANDO MÚSICA VIA IPHONE...");
		
	}
	
	public void AparelhoTelefonico() {
		System.out.println("LIGANDO PARA CONTATO VIA IPHONE...");
	
	}
	
	public void NavegadorInternet() {
		System.out.println("EXIBINDO PÁGINA DE INTERNET VIA IPHONE...");
		
	}
}
