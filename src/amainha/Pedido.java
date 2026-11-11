package amainha;

import decorator.PrecosAddOns;
import strategy.EstrategiaDesconto;
import strategy.SemDesconto;
import state.EstadoPedido;
import state.Pago;

public class Pedido {
	private String id;
	private PrecosAddOns itensComAddOns;
	private EstrategiaDesconto estrategiaDesconto;
	private EstadoPedido estadoAtual;
	private double totalFinal;

	public Pedido(String id, PrecosAddOns itensComAddOns) {
		this.id = id;
		this.itensComAddOns = itensComAddOns;
		this.estrategiaDesconto = new SemDesconto();
		this.estadoAtual = new Pago();
		
	}

	public void processarPagamento() {
		Float subtotal = getSubtotal();
		System.out.println("RECIBO DE COMPRA ");
		System.out.println("Detalhamento: " + getDescricaoDetalhada());
		System.out.println("Subtotal acumulado: R$" + String.format("%.2f", subtotal));
		System.out.print("Resultado do Desconto: ");

		if (this.estrategiaDesconto != null) {
       
            this.totalFinal = this.estrategiaDesconto.calcular(subtotal);
        } else {
            this.totalFinal = subtotal;
        }
		System.out.println(" ");
	}

	public double getTotalFinal() {
        return this.totalFinal;
    }
	
	public Float getSubtotal() {
		return this.itensComAddOns.getPreco();
	}

	public String getDescricaoDetalhada() {
		return this.itensComAddOns.getExtrato();
	}

	public void atualizarAddOns(PrecosAddOns novosAddOns) {
		this.itensComAddOns = novosAddOns;
	}

	public void setEstrategiaDesconto(EstrategiaDesconto estrategiaDesconto) {
		this.estrategiaDesconto = estrategiaDesconto;
	}

	public void setEstado(EstadoPedido novoEstado) {
		this.estadoAtual = novoEstado;
	}

	public void avancarEstado() {
		this.estadoAtual.avancar(this);
	}

	public void cancelarPedido() {
		this.estadoAtual.cancelar(this);
	}

	public String getStatus() {
		return this.estadoAtual.getEtapa();
	}

}