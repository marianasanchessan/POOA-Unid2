package state;

import amainha.Pedido;

public class EmPreparo implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("Produto embalado. Prepadado para: Enviado.");
		pedido.setEstado(new SaiuEntrega());
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Pedido cancelado.");
	}

	@Override
	public String getEtapa() {
		return "Em Preparo";
	}

}
