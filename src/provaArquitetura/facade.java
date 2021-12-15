package provaArquitetura;

public class facade {

	private Item [] item;
	private FactoryMetodo factory;
	private InteratorMetodo interator;
	
	public facade(Item [] item, FactoryMetodo factory, InteratorMetodo interator) {
		this.item = item;
		this.factory = factory;
		this.interator = interator;
	}
	public void estoque() {
		item[0] = (Item) factory.getItem("Marca da Vitória");
		item[1] = (Item) factory.getItem("Ponto de Impacto");
		item[2] = (Item) factory.getItem("O Fantasma da ópera");
		item[3] = (Item) factory.getItem("Drácula");
		item[4] = (Item) factory.getItem("Frankstein");
		
		while(interator.hasprox()) {
			Item item = (Item)interator.prox();
			System.out.println(item.titulo);
		}
	}
}
