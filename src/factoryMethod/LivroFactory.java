package factoryMethod;

import builder.Obra;

public class LivroFactory extends CategoriaFactory {

	@Override
	public Impresso criarImpressoComObra(Obra obra, double preco) {
		return new Livro (obra, preco);
	}

}
