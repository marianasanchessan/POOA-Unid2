package state;

import amainha.Pedido;

public class SaiuEntrega implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("Entrega confirmada. Finalmente seu pedido foi: Entregue");
		pedido.setEstado(new Entregue());
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Ação Inválida.");
	}

	@Override
	public String getEtapa() {
		return "Saiu pra entrega";
	}

}
