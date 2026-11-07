package amainha;

import java.util.ArrayList;
import java.util.List;

import builder.Obra;

import factoryMethod.CategoriaFactory;
import factoryMethod.Impresso;
import factoryMethod.LivroFactory;
import factoryMethod.MangaFactory;

public class CatalogoObras {

	private final List<Impresso> acervo = new ArrayList<>();

	public void inicializarEstoque() {
		CategoriaFactory livroFactory = new LivroFactory();
		CategoriaFactory mangaFactory = new MangaFactory();

		Obra obra1 = new Obra.ObraBuilder()
				.nome("Efeito de Rede Vol. 1")
				.autor("Martha Wells")
				.genero("Sci-fi")
				.build();
		acervo.add(livroFactory.criarImpressoComObra(obra1, 55.30));

		Obra obra2 = new Obra.ObraBuilder()
				.nome("Witch Hat Atelier Vol. 1")
				.autor("Kamome Shirahama")
				.build();
		acervo.add(mangaFactory.criarImpressoComObra(obra2, 32.90));
		
		Obra obra3 = new Obra.ObraBuilder()
				.nome("Witch Hat Atelier Vol. 1")
				.genero("Periódico")
				.build();
		acervo.add(mangaFactory.criarImpressoComObra(obra2, 19.90));
			
		
	}

	/*public List<Impresso> getAcervo() {
		return acervo;

	}*/
}
