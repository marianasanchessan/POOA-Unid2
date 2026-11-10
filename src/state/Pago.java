package state;

import amainha.Pedido;

public class Pago implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("Pagamento confirmado. Seu pedido está: Em Preparo.");
		pedido.setEstado(new EmPreparo());
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Pedido cancelado.");
	}

	@Override
	public String getEtapa() {
		return "Pago";
	}

}
