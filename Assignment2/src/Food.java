package Assignment2.src;

import java.util.Scanner;

public class Food  {
	   private int ID;
	private   String name;
		protected int price;
		protected   int quantity;
		protected  int disc;
		static int  total=1;
		 private String category;
		Scanner scn= new Scanner(System.in);
		
		public void q1() {
			ID=total++;
			System.out.println("Enter food item details");
			System.out.println("Food name:");
			String n= scn.next();
			this.name=n;
			System.out.println("item price:");
			int p=scn.nextInt();
			this.price=p;
			System.out.println("item quantity:");
			int q= scn.nextInt();
			this.quantity=q;
			System.out.println("item category:");
			String c=scn.next();
			this.category=c;
			System.out.println("Offer:");
			int o= scn.nextInt();
			this.disc=o;
			}
		
		public void printf() {
			System.out.print(this.ID+" ");
			System.out.print(this.name+" ");
			System.out.print(this.price+" ");
			System.out.print(this.quantity +" ");
			System.out.print(this.disc+"% off ");
			System.out.print(this.category+" ");
		}
		    
		public void q2() {
			System.out.println("Choose an attribute to edit:");
			System.out.println("1) Name");
			System.out.println("2) Price");
			System.out.println("3) Quantity");
			System.out.println("4) Category");
			System.out.println("5) Offer");
			int n = scn.nextInt();
			if(n==1) {
				setName();
			}
			if(n==2) {
				setPrice();
			}
			if(n==3) {
				setQuantity();
			}
			if(n==4) {
				setCategory();
			}
			if(n==5) {
				setOffer();
			}
			}
		public int getID() {
			return this.ID;
		}
		public void setName() {
			System.out.print("Enter the new name:");
			String n=scn.next();
			this.name=n;
		}
		public void setPrice() {
			System.out.print("Enter the new price:");
			int n=scn.nextInt();
			this.price=n;
		}
		public void setQuantity() {
			System.out.print("Enter the new quantity:");
			int n=scn.nextInt();
			this.quantity=n;
		}
		public void setCategory() {
			System.out.print("Enter the new category:");
			String n=scn.next();
			this.category=n;
		}
		public void setOffer() {
			System.out.print("Enter the new offer:");
			int n=scn.nextInt();
			this.disc=n;
		}
		public String getName() {
			return this.name;		
		}
		public int getPrice() {
			return this.price;
		}
		public int getQuantity() {
			return this.quantity;
		}
		public int getOffer() {
			return this.disc;	
		}public String getCategory() {
			return this.category;		
		}
}
