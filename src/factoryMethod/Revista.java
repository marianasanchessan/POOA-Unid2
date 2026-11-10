package factoryMethod;

import builder.Obra;

public class Revista implements Impresso {

	private Obra obra;
	private double preco;

	public Revista(Obra obra, double preco) {
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
		System.out.println("Revista: " + obra.getNome());
		System.out.println("Autor: " + obra.getAutor());
		System.out.println("Gênero: " + obra.getGenero());
		System.out.println("Preço: R$ " + preco);

	}

}
