package adapter;

public class ItauPix {
	
	public boolean pix (String chavePix, double valor) {
		System.out.println("Pagamento Pix: " + valor);
		return true;
	}
	
}
