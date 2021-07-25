package Assignment2.src;


public class cart extends Food {
    private Restaurant r;
     private Customer c;
	 private int quantity;
	 private Food f;
	 public cart(
			 Food food,
			 Restaurant r,
			 Customer c,
			 int quantity
	){
		this.f=food;
		this.r=r;
		this.c=c;
		this.quantity=quantity;
		
		 
	 }
	
	public void setQuantity(int n ) {
		this.quantity=n;
	}
	public int getQuantity() {
		return this.quantity;
		
	}
	public Food getfood() {
		return this.f;
		
	}
	public String getName() {
		return this.f.getName();
	}
	public int getID() {
		return this.f.getID();
	}
	public int getPrice() {
		return this.f.getPrice();
		
	}
	public int getOffer() {
		return this.f.getOffer();
	}
	

	
}
