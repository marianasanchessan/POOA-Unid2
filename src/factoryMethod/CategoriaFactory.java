package factoryMethod;

import builder.Obra;

public abstract class CategoriaFactory {

	public abstract Impresso criarImpressoComObra(Obra obra, double preco);

}
