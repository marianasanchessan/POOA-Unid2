package strategy;

public class SemDesconto implements EstrategiaDesconto {
	
	private static final Float TAXA_DESCONTO = 1.0f;

	@Override
	public void calcular(Float valor) {
		Float valorDesc = valor * TAXA_DESCONTO;
		System.out.println("Nenhum desconto aplicado: R$" + valorDesc );
		
	}
}
