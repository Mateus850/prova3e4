package provaArquitetura;

public class InteratorMetodo {

	Item[] itens;
	int pos = 0;
	
	public InteratorMetodo(Item[] itens) {
		this.itens = itens;
	}
	public Object prox(){
		Item item = itens[pos];
		pos++;
		return item;
	}
	public boolean hasprox() {
		if (pos >= itens.length || itens[pos] == null) {
			return false;
		} else {
			return true;
		}
	}
}
