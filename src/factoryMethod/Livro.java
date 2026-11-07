package factoryMethod;

import builder.Obra;

public class Livro implements Impresso {

	private Obra obra;
    private double preco;
	
	public Livro(Obra obra, double preco) {
		super();
		this.obra = obra;
		this.preco = preco;
	}

	@Override
	public String getTitulo() {
		return obra.getNome();
	}

	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Livro: " + obra.getNome());
		System.out.println("Autor: " + obra.getAutor() );
		System.out.println("Gênero: " + obra.getGenero());
		System.out.println("Preço: R$ " + preco);

	}

}