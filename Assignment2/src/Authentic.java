package Assignment2.src;

public class Authentic extends Restaurant{
	public Authentic(String name,String category,String address) {
		super(name,category,address);
		
	}
	@Override
	public String getStatus() {
		return "Authentic";
		
	}
}
