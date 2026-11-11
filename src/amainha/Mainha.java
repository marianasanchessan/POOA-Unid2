package amainha;

import adapter.AdapterPagSeguro;
import adapter.AdapterPayPal;
import adapter.AdapterPix;
import adapter.ProcessadorPagamento;
import decorator.FreteDecorator;
import decorator.ImportacaoDecorator;
import decorator.PrecosAddConcretos;
import decorator.PrecosAddOns;
import decorator.PresenteDecorator;
import factoryMethod.Impresso;
import strategy.DescontoCupom;
import strategy.DescontoPremium;
import strategy.EstrategiaDesconto;
import strategy.SemDesconto;

public class Mainha {

	public static void main(String[] args) {

		CatalogoObras catalogo = new CatalogoObras();
		catalogo.inicializarEstoque();

		Impresso itemCatalogo = catalogo.getAcervo().get(0);
		System.out.println("ITEM SELECIONADO: ");
		System.out.println(itemCatalogo.getTitulo());
		itemCatalogo.exibirDetalhes();

		System.out.println(" ");

		PrecosAddOns carrinho = new PrecosAddConcretos((float) itemCatalogo.getPreco(), itemCatalogo.getTitulo());

		int[] opcoesEscolhidas = { 1, 2, 3 };

		for (int opcao : opcoesEscolhidas) {
			switch (opcao) {
			case 1:
				carrinho = new FreteDecorator(carrinho);
				break;
			case 2:
				carrinho = new PresenteDecorator(carrinho);
				break;
			case 3:
				carrinho = new ImportacaoDecorator(carrinho);
				break;
			default:
				System.out.println("Nenhum adicional aplicado.");
				break;
			}
		}

		Pedido pedido = new Pedido("PEDIDO ALEATÓRIO-2026", carrinho);

		int tipoDescontoCliente = 1;
		EstrategiaDesconto desconto = null;

		switch (tipoDescontoCliente) {
		case 1:
			desconto = new DescontoCupom();
			break;
		case 2:
			desconto = new DescontoPremium();
			break;
		case 0:
		default:
			desconto = new SemDesconto();
			break;
		}

		pedido.setEstrategiaDesconto(desconto);
		
		pedido.processarPagamento(); 

		double valorTotal = pedido.getTotalFinal();

		int bancoOuGateway = 0;
		ProcessadorPagamento processador = null;

		switch (bancoOuGateway) {
		case 0:
			processador = new AdapterPix();
			break;
		case 1:
			processador = new AdapterPayPal();
			break;
		case 2:
			processador = new AdapterPagSeguro();
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

		if (processador != null) {
			processador.pagamentoFeliz(valorTotal);
		}

		System.out.println(" ");
		
		System.out.println("Estado Inicial: " + pedido.getStatus());

		System.out.println(" ");

		System.out.println("Avançando estado:");
		pedido.avancarEstado();
		System.out.println("Estado Atual: " + pedido.getStatus());

		System.out.println(" ");

		System.out.println("Avançando estado:");
		pedido.avancarEstado();
		System.out.println("Estado Atual: " + pedido.getStatus());

		System.out.println(" ");

		System.out.println("Avançando estado:");
		pedido.avancarEstado();
		System.out.println("Estado Atual: " + pedido.getStatus());
	}
}