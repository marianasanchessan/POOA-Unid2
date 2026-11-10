package adapter;

public class AdapterPagSeguro implements ProcessadorPagamento {

	@Override
	public void pagamentoFeliz(double valor) {
		PagSeguro pag = new PagSeguro();
		pag.vaiPagamento("Chave", valor);
	}

}
