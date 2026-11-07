package adapter;

public class AdapterPayPal  implements ProcessadorPagamento{

	@Override
	public void pagamentoFeliz(double valor) {
		PaypalPay pag = new PaypalPay();
		pag.sendPagamento("Chave", valor);
	}

}
