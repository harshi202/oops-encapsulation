package com.xworkz.oops.Encapsulation;

public class cartester {

		public static void main(String []arsg) {
			car cars=new car();
			cars.SetBrand("AUDI A4");
			cars.setprice(5200000);
			cars.setwheelsize(17);
			cars.settype("SADEN");
			cars.setnumofseat(5);
			cars.setenginwarranty(5);
			cars.setcolour("white");
			cars.setquality("amazing");
			cars.setrating(5);
			cars.setbuy(true);
			
			String Brand=cars.getBrand();
			int price=cars.getprice();
			int wheelsize=cars.getwheelsize();
			String type=cars.gettype();
			int numofseat=cars.getnumofseat();
			int enginwarranty=cars.getenginwarranty();
			String colour=cars.getcolour();
			String quality=cars.getquality();
			int rating=cars.getrating();
			boolean buy=cars.getbuy();
			
			System.out.println(Brand);
			System.out.println(price);
			System.out.println(wheelsize);
			System.out.println(type);
			System.out.println(numofseat);
			System.out.println(enginwarranty);
			System.out.println(colour);
			System.out.println(quality);
			System.out.println(rating);
			System.out.println(buy);
		}

	}



