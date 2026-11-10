package amainha;

import builder.Obra;

import decorator.FreteDecorator;
import decorator.ImportacaoDecorator;
import decorator.PrecosAddConcretos;
import decorator.PrecosAddOns;

import factoryMethod.Impresso;
import factoryMethod.MangaFactory;
import factoryMethod.CategoriaFactory;

public class Mainha {

	public static void main(String[] args) {

		// IDEIA DE COMO FAZER
		/*
		 * public class Main { public static void main(String[] args) {
		 * 
		 * // ------------------------------------------------------------- // PASSO 1:
		 * DECORATOR (Montagem do produto com custos extras) //
		 * ------------------------------------------------------------- // Obra base de
		 * R$ 150,00 PrecosAddOns itemFinal = new PrecosAddConcretos(150.0f,
		 * "Quadro Noite Estrelada");
		 * 
		 * // Encadeia frete e embalagem de presente itemFinal = new
		 * FreteDecorator(itemFinal); // + R$ 15,00 itemFinal = new
		 * PresenteDecorator(itemFinal); // + R$ 5,00 // Subtotal decorado: R$ 170,00
		 * 
		 * // ------------------------------------------------------------- // PASSO 2:
		 * CRIAR O PEDIDO (State inicial: Criado) //
		 * ------------------------------------------------------------- Pedido
		 * meuPedido = new Pedido("PED-1001", itemFinal);
		 * System.out.println("Status Inicial: " + meuPedido.getStatus()); // Criado
		 * 
		 * // ------------------------------------------------------------- // PASSO 3:
		 * STRATEGY (Definir e aplicar desconto) //
		 * ------------------------------------------------------------- // Aplicar
		 * cupão de desconto de 20% meuPedido.setEstrategiaDesconto(new
		 * DescontoCupom());
		 * 
		 * // Processa o pagamento usando o valor gerado pelo Decorator
		 * meuPedido.processarPagamento();
		 * 
		 * // ------------------------------------------------------------- // PASSO 4:
		 * STATE (Transição do ciclo de vida) //
		 * -------------------------------------------------------------
		 * System.out.println("\n--- EVOLUINDO O ESTADO DO PEDIDO ---");
		 * 
		 * meuPedido.avancarEstado(); // Transita para: Em Preparo
		 * System.out.println("Status Atual: " + meuPedido.getStatus());
		 * 
		 * meuPedido.avancarEstado(); // Transita para: Enviado
		 * System.out.println("Status Atual: " + meuPedido.getStatus());
		 * 
		 * // Tentativa de cancelamento inválida (bloqueada pelo State Enviado)
		 * meuPedido.cancelarPedido();
		 * 
		 * meuPedido.avancarEstado(); // Transita para: Entregue
		 * System.out.println("Status Final: " + meuPedido.getStatus()); }
		 */

		/*
		 * Float precoBaseObra = 100.0f;
		 * 
		 * // 1. Strategy calcula o novo valor da obra com desconto Float
		 * precoComDesconto = desconto.calcularRetornandoValor(precoBaseObra); // Ex: R$
		 * 80,00
		 * 
		 * // 2. Decorator adiciona os serviços extras sobre o valor já com desconto
		 * PrecosAddOns pedidoFinal = new PrecosAddConcretos(precoComDesconto);
		 * pedidoFinal = new FreteDecorator(pedidoFinal); // + R$ 15,00 pedidoFinal =
		 * new ImportacaoDecorator(pedidoFinal); // + R$ 10,00
		 * 
		 * Float totalPagar = pedidoFinal.getPreco(); // Resultado final: R$ 105,00
		 */

		/*
		 * Pedido meuPedido = new Pedido(); System.out.println("Status: " +
		 * meuPedido.getStatusAtual()); // Criado
		 * 
		 * meuPedido.avancarEstado(); // Transita para: Em Preparo
		 * meuPedido.avancarEstado(); // Transita para: Enviado
		 * meuPedido.cancelarPedido(); // Imprime: Não é possível cancelar...
		 * meuPedido.avancarEstado(); // Transita para: Entregue
		 */

	}

}
