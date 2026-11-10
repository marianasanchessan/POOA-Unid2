package factoryMethod;

import builder.Obra;

public class RevistaFactory extends CategoriaFactory {

	@Override
	public Impresso criarImpressoComObra(Obra obra, double preco) {
		return new Revista(obra, preco);
	}

}
