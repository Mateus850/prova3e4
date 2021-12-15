package provaArquitetura;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryMetodo factorymetodo= new FactoryMetodo();
		
		Item[] I = new Item[5];
		
		InteratorMetodo Inte = new InteratorMetodo(I);
		
		facade fac = new facade(I, factorymetodo,Inte);
		
		fac.estoque();
	}

}
