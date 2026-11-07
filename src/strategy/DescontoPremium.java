package strategy;

public class DescontoPremium implements EstrategiaDesconto {
	
	private static final Float TAXA_DESCONTO = 0.50f;

	@Override
	public void calcular(Float valor) {
		Float valorDesc = valor * TAXA_DESCONTO;
		System.out.println("Desconto premium (50%): R$" + valorDesc );
		
	}
}
