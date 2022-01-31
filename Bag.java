package com.xworkz.oops.Encapsulation;

public class Bag {
	private String Brand;
	private int price;
	private int numzip;
	private String type;
	private int numleaves;
	private int warranty;
	private String colour;
	private String quality;
	private int rating;
	private boolean buy;
	
	public Bag() {
		
	}
	public void SetBrand( String Brand){
		this.Brand=Brand;
	}
	public String getBrand() {
		return Brand;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setnumzip(int numzip) {
		this.numzip=numzip;
	}
	public int getnumzip() {
		return numzip;
	}
	public void settype(String type) {
		this.type=type;
	}
	public String gettype() {
		return type;
	}
	public void setnumleaves(int numleaves) {
		this.numleaves=numleaves;
	}
	public int getnumleaves() {
		return numleaves;
	}
	public void setwarranty(int warranty) {
		this.warranty=warranty;
	}
	public int getwarranty() {
		return warranty;
	}
	public void setcolour(String colour) {
		this.colour=colour;
	}
	public String getcolour() {
		return colour;
	}
	public void setquality(String quality) {
		this.quality=quality;
	}
	public String getquality() {
		return quality;
	}
	public void setrating(int rating) {
		this.rating=rating;
	}
	public int getrating() {
		return rating;
	}
	public void setbuy(boolean buy) {
		this.buy=buy;
	}
	public boolean getbuy() {
		return buy;
	}
	
}
