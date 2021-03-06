package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	
//Para gerar construtores automaticamente
//	 Bot�o direito -> Source -> Generate Constructor using Fields
	


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

	

	
	
	//Para gerar get e set automaicamente
//	� Bot�o direito -> Source -> Generate Getters and Setters

	
	//	M�todo para setar o nome 
	public void setName(String name) {
		this.name = name;
	}
	
//	M�todo para pegar o nome
	public String getName() {
		return name;
	}
	
//	M�todo para setar o price
	public double getPrice() {
		return price;
		
	}
	
//	M�todo para pegar o price
	public void setPrice(double price) {
		this.price = price;
	}
	
//	M�todo para setar o quantity.N�o faz o set para nao ter acesso ao quantity
//	e alterar o valor. A qtd s� pode mudar pelas opera��es entrada e sa�da do estoque
	public double getQuantity() {
		return quantity;
		
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