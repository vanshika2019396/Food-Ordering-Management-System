package Assignment2.src;

import java.util.ArrayList;
import java.util.Scanner;

class Restaurant implements User {
    final String address;
	final String name;
	final String category;
	 protected int numOfOrders;
	 protected int rewardpoint;
	 int discount=0;
	
	public Restaurant(String name,String category,String address) {
		this.name=name;
		this.address=address;
		this.category=category;
		
	}
	public String getStatus() {
		return "";
	}

	public String getName() {
		return this.name;	
	}
	public String getCategory() {
		return this.category;	
	}
	@Override
	public void setRewardPoints(int n) {
		this.rewardpoint=n;
	}
	@Override
	public int getRewardPoints() {
		return this.rewardpoint;
	}
	public void setDiscount(int n) {
		this.discount=n;
		
	}
	public int getDiscount() {
		return this.discount;
	}
	public String getAddress() {
		return this.address;
	}
	public void setOrders(int n) {
		// TODO Auto-generated method stub
		this.numOfOrders=n;
	}
	public int getOrders() {
		return this.numOfOrders;
	}
	@Override
	public void login() {

		System.out.println("1) Add item");
		System.out.println("2) Edit item");
		System.out.println("3) Print Rewards");
		System.out.println("4) Discount on bill value");
		System.out.println("5) Exit");
	}
	
}
class Customer implements User{
	final String name;
	final String category;
	private int deliveryCharges;
	private float cost;
	protected int rewardpoint;
	final String address;
	ArrayList<cart> bag=new ArrayList<cart>();
	public Customer(String n, String c,String address) {
		this.name=n;
		this.category=c;
		this.address=address;
	}
	@Override
	public void login() {
		System.out.println("Customer Menu");
		System.out.println("1) Select Restaurant");
		System.out.println("2) checkout cart");
		System.out.println("3) Reward won");
		System.out.println("4) print the recent orders");
		System.out.println("5) Exit");
	}
	public String getAddress() {
		return this.address;
	}
	public 	String getName() {
		return this.name;	
	}
	public String getCategory() {
		return this.category;
	}
	public void setDeliveryCharges(int n) {
		this.deliveryCharges=n;
		
	}
	public int getDeliveryCharges() {
		return this.deliveryCharges;
	}
	public void setCost(float n) {
		cost=n;
	}
	public float getCost() {
		return cost;
	}
	@Override
	public void setRewardPoints(int n) {
		this.rewardpoint=n;
	}@Override
	public int getRewardPoints() {
		return this.rewardpoint;
	}
}


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r =0;
		int p=0;
		float bill = 0;
		int f=0;
		ArrayList<ArrayList<Food>> item=new ArrayList<ArrayList<Food>>();
		item.add(new ArrayList<Food>());
		item.add(new ArrayList<Food>());
		item.add(new ArrayList<Food>());
		item.add(new ArrayList<Food>());
		item.add(new ArrayList<Food>());
		ArrayList<cart> bag=new ArrayList<cart>();
		int count=0;
		Scanner scn= new Scanner(System.in);
		ArrayList<Restaurant> rlist=new ArrayList<>();
		Restaurant r1=new Authentic("Shah","Authentic","Vasant Kunj");
		rlist.add(r1);
		Restaurant r2=new Restaurant("Ravi's","","Govind Puri");
		rlist.add(r2);
		Restaurant r3=new Authentic("The Chinese","Authentic","CP");
		rlist.add(r3);
		Restaurant r4=new FastFood("Wang's","FastFood","Karol Bagh");
		rlist.add(r4);
		Restaurant r5=new Restaurant("Paradise","","Model Town");
		rlist.add(r5);
		
		ArrayList<Customer> clist=new ArrayList<>();
		Customer c1=new Customer("Ram","elite","Pune");
		clist.add(c1);
		Customer c2= new Customer("Sam","elite","Delhi");
		clist.add(c2);
		Customer c3= new Customer("Tim","special","Mumbai");
		clist.add(c3);
		Customer c4= new Customer("Kim","","Goa");
		clist.add(c4);
		Customer c5= new Customer("Jim","","Nagpur");
		clist.add(c5);
		
			
			while(true) {
				System.out.println("Welcome to Zotato:");
				System.out.println("1) Enter as Restaurant Owner");
				System.out.println("2) Enter as Customer");
				System.out.println("3) Check User Details");
				System.out.println("4) Company Account details");
				System.out.println("5) Exit");
				System.out.println();
				int n =scn.nextInt();
				
			if(n==1) {
				System.out.println("Choose Restaurant");
				for(int i=0;i<rlist.size();i++) {
			System.out.println();
					System.out.print(i+1 +") ");
					System.out.print(rlist.get(i).getName());
					System.out.print("(");
					System.out.print(rlist.get(i).getCategory());
					System.out.print(")");
					System.out.println();
				}
				System.out.println();
				 p=scn.nextInt();
				
				while(p==1||p==2||p==3||p==4 || p==5) {	
					
				System.out.println("Welcome "+rlist.get(p-1).getName());
				System.out.println();
				
				System.out.println("1) Add item");
				System.out.println("2) Edit item");
				System.out.println("3) Print Rewards");
				System.out.println("4) Discount on bill value");
				System.out.println("5) Exit");
				
				int g=scn.nextInt();
				
				
				if(g==1) {
					
					count++;
					Food f1=new Food();
					item.get(p-1).add(f1);
					f1.q1();
					f1.printf();
					System.out.println();
				}
				if(g==2) {
					System.out.println("Choose item by code");
					for(int i=0;i<item.get(p-1).size();i++) {
					  System.out.print(i+1);
					  System.out.print(rlist.get(p-1).getName() +" - ");
					  System.out.print(item.get(p-1).get(i).getName()+" ");
					  System.out.print(item.get(p-1).get(i).getPrice()+ " ");
					  System.out.print(item.get(p-1).get(i).getQuantity()+ " ");
					  System.out.print(item.get(p-1).get(i).getOffer()+"% off"+ " ");
					  System.out.println(item.get(p-1).get(i).getCategory());
					}
					int l=scn.nextInt();
					
					System.out.println("Choose an attribute to edit:");
					System.out.println("1) Name");
					System.out.println("2) Price");
					System.out.println("3) Quantity");
					System.out.println("4) Category");
					System.out.println("5) Offer");
					int i = scn.nextInt();
					if(i==1) {
						
						item.get(p-1).get(l-1).setName();
					}
					if(i==2) {
						
						item.get(p-1).get(l-1).setPrice();
					}
					if(i==3) {
						
						item.get(p-1).get(l-1).setQuantity();
					}
					if(i==4) {
						
						item.get(p-1).get(l-1).setCategory();
					}
					if(i==5) {
						System.out.println("enter new discount:");
						item.get(p-1).get(l-1).setOffer();
					}
					  System.out.print(l);
					  System.out.print(rlist.get(p-1).getName() +" - ");
					  System.out.print(item.get(p-1).get(l-1).getName()+" ");
					  System.out.print(item.get(p-1).get(l-1).getPrice()+ " ");
					  System.out.print(item.get(p-1).get(l-1).getQuantity()+ " ");
					  System.out.print(item.get(p-1).get(l-1).getOffer()+"% off"+ " ");
					  System.out.println(item.get(p-1).get(l-1).getCategory());
					  System.out.println();
					
				}
				if(g==3) {
					System.out.println("Reward Points:");
					System.out.println(clist.get(p-1).getRewardPoints());
					
					
				}
				if(g==4) {
					if(!rlist.get(p-1).getStatus().equals("")) {
					System.out.println("Enter discount on bill value-");
					int x= scn.nextInt();
					
					rlist.get(p-1).setDiscount(x);
					
					}
					else {
						System.out.println("you cannot change discount for this restaurant");
					}
				}
				if(g==5) {
					break;
					
				}
				
				
				}
				
			}if(n==2) {
				for(int i=0;i<clist.size();i++) {
					System.out.println();
							System.out.print(i+1 +") ");
							System.out.print(clist.get(i).getName());
							System.out.print(" (");
							System.out.print(clist.get(i).getCategory());
							System.out.print(")");
							System.out.println();
						}
						System.out.println();
						p=scn.nextInt();
						int quan=0;
						f=0;
						while(p==1||p==2||p==3||p==4 && p!=5) {	
						System.out.println("Welcome " +clist.get(p-1).getName());
						System.out.println("Customer Menu");
						System.out.println("1) Select Restaurant");
						System.out.println("2) checkout cart");
						System.out.println("3) Reward won");
						System.out.println("4) print the recent orders");
						System.out.println("5) Exit");
						int l=scn.nextInt();
						
						if (l==1) {
							System.out.println("Choose Restaurant");
							for(int i=0;i<rlist.size();i++) {
						System.out.println();
								System.out.print(i+1 +") ");
								System.out.print(rlist.get(i).getName());
								System.out.print("(");
								System.out.print(rlist.get(i).getCategory());
								System.out.print(")");
								System.out.println();
							}
							System.out.println();
							 r =scn.nextInt();
							
							System.out.println("Choose item by code");
							for(int i=0;i<item.get(r-1).size();i++) {
							  System.out.print(i+1);
							  System.out.print(rlist.get(r-1).getName() +" - ");
							  System.out.print(item.get(r-1).get(i).getName()+" ");
							  System.out.print(item.get(r-1).get(i).getPrice()+ " ");
							  System.out.print(item.get(r-1).get(i).getQuantity()+ " ");
							  System.out.print(item.get(r-1).get(i).getOffer()+"% off"+ " ");
							  System.out.println(item.get(r-1).get(i).getCategory());
							}
							
							 f= scn.nextInt();
							
							System.out.println("Enter item quantity -");
							quan= scn.nextInt();
							//bag.get(f-1).setQuantity(quan);
							clist.get(p-1).bag.add(new cart(item.get(r-1).get(f-1),rlist.get(r-1),clist.get(p-1),quan));
						//	clist.get(p-1).bag.get(clist.get(p-1).bag.size()-1).setQuantity(quan);
							System.out.println("Items added to cart");
							
									
						}
						
						float finalcost=0;
						if(l==2) {
							
							System.out.println("items in cart:-");
							System.out.print(quan);
							rlist.get(r-1).setOrders(quan);
							System.out.print(rlist.get(r-1).getName() +" - ");
							
//							 System.out.println(bag.get(f-1).getName());
//							 System.out.println(bag.get(f-1).getPrice());
//							 System.out.println(bag.get(f-1).getQuantity());
//							 System.out.println(bag.get(f-1).getOffer());
							 cart temp;
							for(int i=0;i<clist.get(p-1).bag.size();i++) {
								System.out.print(clist.get(p-1).bag.get(i).getID()+" - ");
								System.out.print(clist.get(p-1).bag.get(i).getName()+ " - ");
								System.out.print(clist.get(p-1).bag.get(i).getPrice()+" - ");
								System.out.print(clist.get(p-1).bag.get(i).getQuantity()+ " - ");
								System.out.println(clist.get(p-1).bag.get(i).getOffer()+ "% off ");
								if(clist.get(p-1).bag.get(i).getID()==f) {
									temp=clist.get(p-1).bag.get(i);
									
								}
							}
							int dc=0;
							for(int i=0;i<clist.get(p-1).bag.size();i++) {
							float cost=clist.get(p-1).bag.get(i).getfood().getPrice() * clist.get(p-1).bag.get(i).getQuantity();
							float o1=clist.get(p-1).bag.get(i).getfood().getOffer();
							cost=cost-(cost*o1/100);
							
							
							finalcost+=cost;
							}
							int o2=rlist.get(r-1).getDiscount();
							finalcost=finalcost-(finalcost*o2/100);
							if(finalcost>100  && rlist.get(r-1).getCategory().equals("Authentic")) {
								finalcost=finalcost-50;
							}
							
							
							
							
							
							if(clist.get(p-1).getCategory().equals("elite")) {
								clist.get(p-1).setDeliveryCharges(0);
								dc=clist.get(p-1).getDeliveryCharges();
								System.out.println("delivery charges: "+clist.get(p-1).getDeliveryCharges());
								if(finalcost>200) {
									finalcost=finalcost-50;
									
								}
							}
							else if(clist.get(p-1).getCategory().equals("special")) {
								clist.get(p-1).setDeliveryCharges(20);
								dc=clist.get(p-1).getDeliveryCharges();
								System.out.println("delivery charges: "+clist.get(p-1).getDeliveryCharges());
								
								if(finalcost>200) {
									finalcost=finalcost-25;
									
								}
							}
							else if(clist.get(p-1).getCategory().equals("")) {
								clist.get(p-1).setDeliveryCharges(40);
								dc=clist.get(p-1).getDeliveryCharges();
								System.out.println("delivery charges: "+clist.get(p-1).getDeliveryCharges());
								
							}
							finalcost=finalcost+dc;
							bill=finalcost;
							clist.get(p-1).setCost(finalcost);
							System.out.println("Total order value - INR"+ finalcost +"/-");
							System.out.println("1) Proceed to checkout");
							int checkout=scn.nextInt();
							if(checkout==1) {
								System.out.println(quan+"items successfully bought for INR "+finalcost+"/-");
								
								 int rewards=0;
									if (rlist.get(r-1).getCategory().equals("Authentic")) {
										float c =clist.get(p-1).getCost();
										rewards=rewards+(int)(c/200)*25;
									}
									else if(rlist.get(r-1).getCategory().equals("FastFood")) {
										float c =clist.get(p-1).getCost();
										rewards=rewards+(int)(c/150)*10;
									}
									else if(rlist.get(r-1).getCategory().equals("")) {
										float c =clist.get(p-1).getCost();
										rewards=rewards+(int)(c/100)*5;
									}
									
									rlist.get(r-1).setRewardPoints(rewards);
									clist.get(p-1).setRewardPoints(rewards);
							}
							
							
						}
						if(l==3) {
							System.out.println();
							System.out.println("Reward Points:");
							System.out.println(clist.get(p-1).getRewardPoints());
							
						}
						if(l==4) {
							
							cart temp;
							for(int i=0;i<clist.get(p-1).bag.size();i++) {
								System.out.print("Item bought:  ");
								System.out.print(clist.get(p-1).bag.get(i).getName()+" ");
								System.out.print(",quantity:  ");
								System.out.print(clist.get(p-1).bag.get(i).getQuantity()+ " ");
								System.out.print("for Rs  ");
								System.out.print(clist.get(p-1).bag.get(i).getPrice()+ " ");
								System.out.print(" from ");
								System.out.print(rlist.get(r-1).getName());
								System.out.print(" and Delivery Charge:  ");
								System.out.println(clist.get(p-1).getDeliveryCharges());
						
								if(clist.get(p-1).bag.get(i).getID()==f) {
									temp=clist.get(p-1).bag.get(i);
									
								}
							}
					
						}
						if(l==5) {
							break;
						}
						
			}
			
			}
			if(n==3) {
				System.out.println("1) Customer List");
				System.out.println("2) Restaurant List");
				int t= scn.nextInt();
				if(t==1) {
					for(int i=0;i<clist.size();i++) {
						System.out.println();
								System.out.print(i+1 +". ");
								System.out.print(clist.get(i).getName());
//								System.out.print(" (");
//								System.out.print(clist.get(i).getCategory());
//								System.out.print(")");
								System.out.println();
							}
					int c=scn.nextInt();
					
					System.out.print(clist.get(c-1).getName());
					System.out.print(" (");
					System.out.print(clist.get(c-1).getCategory());
					System.out.print(")");
					System.out.print(", ");
					System.out.print(clist.get(c-1).getAddress());
					System.out.println(" ,"+(1000-bill)+"/- ");
				}
				else if(t==2) {
					for(int i=0;i<rlist.size();i++) {
						System.out.println();
								System.out.print(i+1 +". ");
								System.out.print(rlist.get(i).getName());
								System.out.print(" (");
								System.out.print(rlist.get(i).getCategory());
								System.out.println(")");
								
							}
					int c=scn.nextInt();
					System.out.println("name:");
					System.out.print(rlist.get(c-1).getName());
					System.out.println("address:");
					System.out.print(", "+ rlist.get(c-1).getAddress());
					System.out.println("number of orders ");
					System.out.print(rlist.get(c-1).getOrders());
				}
				
			}
			if(n==4) {
				System.out.print("Total Company Balance- INR ");
				System.out.println(clist.get(p-1).getCost()*1/100);
				System.out.println("Total delivery charges collected - INR"+clist.get(r-1).getDeliveryCharges()+"/-");
			}
			if(n==5) {
				break;
			}
			}	
	}
}
