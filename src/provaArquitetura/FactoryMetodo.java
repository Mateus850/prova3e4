package provaArquitetura;

public class FactoryMetodo {

	public Livraria getItem(String titulo) {
		return new Item(titulo);
	}
}
