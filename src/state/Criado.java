package state;

import amainha.Pedido;

public class Criado implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("Pagamento confirmado. Alterando pedido para: Em Preparo.");
		pedido.setEstado(new EmPreparo());
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Pedido cancelado com sucesso antes do preparo.");
	}

	@Override
	public String getEtapa() {
		return "Criado";
	}

}
