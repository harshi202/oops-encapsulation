package com.xworkz.oops.Encapsulation;

public class Bagtester {
	public static void main(String []arsg) {
		Bag Bags=new Bag();
		Bags.SetBrand("american tourister");
		Bags.setprice(1200);
		Bags.setnumzip(5);
		Bags.settype("backpacks");
		Bags.setnumleaves(5);
		Bags.setwarranty(4);
		Bags.setcolour("black");
		Bags.setquality("superb");
		Bags.setrating(5);
		Bags.setbuy(true);
		
		String Brand=Bags.getBrand();
		int price=Bags.getprice();
		int numzip=Bags.getnumzip();
		String type=Bags.gettype();
		int numleaves=Bags.getnumleaves();
		int  warranty=Bags.getwarranty();
		String colour=Bags.getcolour();
		String quality=Bags.getquality();
		int rating=Bags.getrating();
		boolean buy=Bags.getbuy();
		
		System.out.println(Brand);
		System.out.println(price);
		System.out.println(numzip);
		System.out.println(type);
		System.out.println(numleaves);
		System.out.println(warranty);
		System.out.println(colour);
		System.out.println(quality);
		System.out.println(rating);
		System.out.println(buy);
	}

}
