package decorator;

public class PresenteDecorator extends AdicionaDecorator {

	private static final Float PAPEL_PRES = 3.50f;

	public PresenteDecorator(PrecosAddOns addOnDeco) {
		super(addOnDeco);
	}

	@Override
	public Float getPreco() {
		return super.getPreco() + PAPEL_PRES;
	}

	@Override
	public String getExtrato() {
		return super.getExtrato() + " + Frete " + PAPEL_PRES;
	}
}
