package com.xworkz.oops.Encapsulation;

public class choppertest {


			public static void main(String []arsg) {
				car cars=new car();
				cars.SetBrand("deccan");
				cars.setprice(1020000000);
				cars.setwheelsize(25);
				cars.settype("vvip");
				cars.setnumofseat(5);
				cars.setenginwarranty(15);
				cars.setcolour("white");
				cars.setquality("tramendous");
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


