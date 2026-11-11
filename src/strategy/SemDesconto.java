package strategy;

public class SemDesconto implements EstrategiaDesconto {

	private static final Float TAXA_DESCONTO = 1.0f;

	@Override
	public Float calcular(Float valor) {
		Float valorDesc = valor * TAXA_DESCONTO;
		System.out.println("Nenhum desconto aplicado: R$" + String.format("%.2f", valorDesc));
		return valorDesc;

	}
}
