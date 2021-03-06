package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
//	Construtor:depois dos atributos, antes dos m�todos
//Construtor obriga a receber nome,pre�o e quantidade
	public Product(String name, double price, int quantity) {
//	this=>Ref. para o pr�prio objeto.Atribuir a vari�vel do construtor name, price e quantity e atribuir para o objeto da classe name, price, quantity

//		this.name= name;
		//	this.name referencia o atributo do objeto. No caso do public String name
//		e o name � referente ao name do construtor(dentro do parentese)
		this.name= name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
//	exemplo sobrecarga. Disponibilizar mais de uma vers�o da mesma opera��o. Diferen�a entre elas s�o os parametors
	public Product(String name, double price) {
			this.name= name;
			this.price = price;
			
		}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}