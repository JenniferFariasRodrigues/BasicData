package entities;

public class Product {
//	atributos
	public String name;
	public double price;
	public int quantity;
	
//	cálculo do preço
	public double totalValueInStock() {
		return price * quantity;
	}
	
//	Recebe quantidade como argumento
	public void addProducts(int quantity) {
//		this=>acessar atributo da classe. Não o argumento da função.
//		No caso acessará o public int quantity quando chama this..quantity
//		this.quantity(atributo da clasee) += quantity(argumento-dentro do parentese);
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
//	Retornar as variaveis do programa
	public String toString() {
		return name
				+", $ "
				+ String.format("%.2f", price)
				+", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f",totalValueInStock());
	}

}
