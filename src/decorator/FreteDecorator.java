package decorator;

public class FreteDecorator extends AdicionaDecorator {

	private static final Float VALOR_FRETE = 5.30f;

	public FreteDecorator(PrecosAddOns addOnDeco) {
		super(addOnDeco);
	}

	@Override
	public Float getPreco() {
		return super.getPreco() + VALOR_FRETE;
	}

	@Override
	public String getExtrato() {
		return super.getExtrato() + " + Frete " + VALOR_FRETE;
	}
}
