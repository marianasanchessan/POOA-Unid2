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
		
		
		//IDEIA DE COMO FAZER
		
		/*Float precoBaseObra = 100.0f;

		// 1. Strategy calcula o novo valor da obra com desconto
		Float precoComDesconto = desconto.calcularRetornandoValor(precoBaseObra); // Ex: R$ 80,00

		// 2. Decorator adiciona os serviços extras sobre o valor já com desconto
		PrecosAddOns pedidoFinal = new PrecosAddConcretos(precoComDesconto);
		pedidoFinal = new FreteDecorator(pedidoFinal);     // + R$ 15,00
		pedidoFinal = new ImportacaoDecorator(pedidoFinal); // + R$ 10,00

		Float totalPagar = pedidoFinal.getPreco();    // Resultado final: R$ 105,00*/

	}

}
