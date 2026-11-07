package builder;

public class Obra {

	private String titulo;
	private String autor;
	private String genero;

	private Obra(ObraBuilder builder) {
		this.titulo = builder.nome;
		this.autor = builder.autor;
		this.genero = builder.genero;
	}

	// Apenas Getters
	public String getNome() {
		return titulo;

	}

	public String getAutor() {
		return autor;
	}

	public String getGenero() {
		return genero;
	}

	public static class ObraBuilder {
		private String nome;
		private String autor;
		private String genero;
		
		
		public Obra build() {
			return new Obra(this);
		}
		

		public ObraBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public ObraBuilder autor(String autor) {
			this.autor = autor;
			return this;
		}

		public ObraBuilder genero(String genero) {
			this.genero = genero;
			return this;
		}

	}
}