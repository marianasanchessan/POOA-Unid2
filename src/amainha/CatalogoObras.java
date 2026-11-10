package amainha;

import java.util.ArrayList;
import java.util.List;

import builder.Obra;

import factoryMethod.CategoriaFactory;
import factoryMethod.Impresso;
import factoryMethod.LivroFactory;
import factoryMethod.MangaFactory;
import factoryMethod.RevistaFactory;

public class CatalogoObras {

	private final List<Impresso> acervo = new ArrayList<>();

	public void inicializarEstoque() {
		CategoriaFactory livroFactory = new LivroFactory();
		CategoriaFactory mangaFactory = new MangaFactory();
		CategoriaFactory revistaFactory = new RevistaFactory();

		Obra obra1 = new Obra.ObraBuilder().nome("Efeito de Rede Vol. 5").autor("Martha Wells").genero("Sci-fi")
				.build();
		acervo.add(livroFactory.criarImpressoComObra(obra1, 55.30));

		Obra obra2 = new Obra.ObraBuilder().nome("Witch Hat Atelier Vol. 1").autor("Kamome Shirahama").build();
		acervo.add(mangaFactory.criarImpressoComObra(obra2, 32.90));

		Obra obra3 = new Obra.ObraBuilder().nome("SuperInteressante").genero("Periódico").build();
		acervo.add(revistaFactory.criarImpressoComObra(obra3, 19.90));

		Obra obra4 = new Obra.ObraBuilder().nome("Tudo que Deixamos Incabado").autor("Rebecca Yarros").build();
		acervo.add(livroFactory.criarImpressoComObra(obra4, 44.21));

	}

	public List<Impresso> getAcervo() {
		return acervo;
	}

}