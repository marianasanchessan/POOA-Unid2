package strategy;

public class DescontoCupom implements EstrategiaDesconto {

	private static final Float TAXA_DESCONTO = 0.80f;

	@Override
	public void calcular(Float valor) {
		Float valorDesc = valor * TAXA_DESCONTO;
		System.out.println("Desconto de cupom (20%): R$" + String.format("%.2f", valorDesc));

	}

}
