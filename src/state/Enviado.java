package state;

import amainha.Pedido;

public class Enviado implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("Entrega confirmada! Alterando pedido para: Entregue.");
		pedido.setEtapa(new Entregue());
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Não é possível cancelar um pedido que já foi enviado!");
	}

	@Override
	public String getEtapa() {
		return "Enviado";
	}

}
