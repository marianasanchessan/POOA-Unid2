package adapter;

public class AdapterPix implements ProcessadorPagamento{

	@Override
	public void pagamentoFeliz(double valor) {
		ItauPix pag = new ItauPix();
		pag.pix("Chave", valor);
	}

}
