package decorator;

public abstract class AdicionaDecorator implements PrecosAddOns {

	protected PrecosAddOns addOnDecorado;

	public AdicionaDecorator(PrecosAddOns addOnDeco) {
		this.addOnDecorado = addOnDeco;
	}

	@Override
	public Float getPreco() {
		return addOnDecorado.getPreco();
	}

	@Override
	public String getExtrato() {
		return addOnDecorado.getExtrato();
	}
}
