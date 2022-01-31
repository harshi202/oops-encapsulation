package com.xworkz.oops.Encapsulation;

public class car {
		private String Brand;
		private int price;
		private int wheelsize;
		private String type;
		private int numofseat;
		private int enginwarranty;
		private String colour;
		private String quality;
		private int rating;
		private boolean buy;
		
		public car() {
			
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
		public void setwheelsize(int wheelsize) {
			this.wheelsize=wheelsize;
		}
		public int getwheelsize() {
			return wheelsize;
		}
		public void settype(String type) {
			this.type=type;
		}
		public String gettype() {
			return type;
		}
		public void setnumofseat(int numofseat) {
			this.numofseat=numofseat;
		}
		public int getnumofseat() {
			return numofseat;
		}
		public void setenginwarranty(int enginwarranty) {
			this.enginwarranty=enginwarranty;
		}
		public int getenginwarranty() {
			return enginwarranty;
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



