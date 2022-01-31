package com.xworkz.oops.Encapsulation;

public class Tablefan {

				private String Brand;
				private int price;
				private int feet;
				private String type;
				private int rpm;
				private int warranty;
				private String colour;
				private String quality;
				private int rating;
				private boolean buy;
				
				public Tablefan() {
					
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
				public void setfeet(int feet) {
					this.feet=feet;
				}
				public int getfeet() {
					return feet;
				}
				public void settype(String type) {
					this.type=type;
				}
				public String gettype() {
					return type;
				}
				public void setrpm(int rpm) {
					this.rpm=rpm;
				}
				public int getrpm() {
					return rpm;
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

