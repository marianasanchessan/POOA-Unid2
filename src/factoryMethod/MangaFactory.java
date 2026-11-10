package factoryMethod;

import builder.Obra;

public class MangaFactory extends CategoriaFactory {

	@Override
	public Impresso criarImpressoComObra(Obra obra, double preco) {
		return new Manga(obra, preco);
	}

}
