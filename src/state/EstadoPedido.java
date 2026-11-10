package state;

import amainha.Pedido;

public interface EstadoPedido {

	void avancar(Pedido pedido);

	void cancelar(Pedido pedido);

	String getEtapa();

}
