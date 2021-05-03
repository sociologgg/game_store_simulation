package randomGameBackendSimulation;

public class Game  {
	private int id;
	private String name;
	private String publisher;
	private double price;
	private double priceAfterDiscount;
	
	Campaign campaign;
	
	

	public Game() {
		
		
	}
	
	public Game(int id, String name, String publisher, double price, Campaign campaign) {
		
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.price = price;
		this.campaign = campaign;
		
		
	}
	
	



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	public double getPriceAfterDiscount() {
		return price * (1-(campaign.getDiscountRate()/100));
	}


	
	
	
	
	





	
}
