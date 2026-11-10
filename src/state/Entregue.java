package state;

import amainha.Pedido;

public class Entregue implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("Não há mais passos seguintes.");
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Ação impossível.");
	}

	@Override
	public String getEtapa() {
		return "Entregue";
	}

}
