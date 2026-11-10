package state;

import amainha.Pedido;

public class Entregue implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("O pedido já se encontra entregue. Não há mais estados seguintes.");
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Não é possível cancelar um pedido que já foi entregue ao cliente.");
	}

	@Override
	public String getEtapa() {
		return "Entregue";
	}

}
