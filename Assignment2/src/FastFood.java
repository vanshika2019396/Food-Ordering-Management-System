package Assignment2.src;


public class FastFood extends Restaurant {

	public FastFood(String name,String category,String address) {
		super(name,category,address);
		
	}
	@Override
	public String getStatus() {
		return "FastFood";
		
	}
}
