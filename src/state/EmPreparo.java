package state;

import amainha.Pedido;

public class EmPreparo implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("Produto embalado! Alterando pedido para: Enviado.");
		pedido.setEstado(new Enviado());
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Preparo interrompido. Pedido cancelado.");
	}

	@Override
	public String getEtapa() {
		return "Em Preparo";
	}

}
