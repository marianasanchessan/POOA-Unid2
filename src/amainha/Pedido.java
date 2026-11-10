package amainha;

import decorator.PrecosAddOns;
import strategy.EstrategiaDesconto;
import strategy.SemDesconto;
import state.EstadoPedido;
import state.Criado;

public class Pedido {
    private String id;
    private PrecosAddOns itensComAddOns;       // Decorator
    private EstrategiaDesconto estrategiaDesconto; // Strategy
    private EstadoPedido estadoAtual;               // State

    public Pedido(String id, PrecosAddOns itensComAddOns) {
        this.id = id;
        this.itensComAddOns = itensComAddOns;
        this.estrategiaDesconto = new SemDesconto(); 
        this.estadoAtual = new Criado();             
    }

    public void processarPagamento() {
        Float subtotal = getSubtotal();
        System.out.println(" RECIBO DE COMPRA ");
        System.out.println("Detalhamento: " + getDescricaoDetalhada());
        System.out.println("Subtotal acumulado: R$ " + subtotal);
        System.out.print("Resultado do Desconto: ");
        
        
        this.estrategiaDesconto.calcular(subtotal);
        System.out.println(" ");
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PrecosAddOns getItensComAddOns() {
		return itensComAddOns;
	}

	public void setItensComAddOns(PrecosAddOns itensComAddOns) {
		this.itensComAddOns = itensComAddOns;
	}

	public EstrategiaDesconto getEstrategiaDesconto() {
		return estrategiaDesconto;
	}

	public void setEstrategiaDesconto(EstrategiaDesconto estrategiaDesconto) {
		this.estrategiaDesconto = estrategiaDesconto;
	}

	public EstadoPedido getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoPedido estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
    
    
}