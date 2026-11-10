package decorator;

public class ImportacaoDecorator extends AdicionaDecorator {

	private static final Float TAXA_IMPORT = 10.50f;

	public ImportacaoDecorator(PrecosAddOns addOnDeco) {
		super(addOnDeco);
	}

	@Override
	public Float getPreco() {
		return super.getPreco() + TAXA_IMPORT;
	}

	@Override
	public String getExtrato() {
		return super.getExtrato() + " + Importação " + TAXA_IMPORT;
	}
}
