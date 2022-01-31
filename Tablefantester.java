package com.xworkz.oops.Encapsulation;

public class Tablefantester {
	


				public static void main(String []arsg) {
					Tablefan fan=new Tablefan();
					 fan.SetBrand("vgaurd");
					 fan.setprice(2500);
					 fan.setfeet(6);
					 fan.settype("standing");
					 fan.setrpm(3000);
					 fan.setwarranty(2);
					 fan.setcolour("white");
					 fan.setquality("excellant");
					 fan.setrating(5);
					 fan.setbuy(true);
					
					String Brand=fan.getBrand();
					int price=fan.getprice();
					int feet=fan.getfeet();
					String type=fan.gettype();
					int rpm=fan.getrpm();
					int warranty=fan.getwarranty();
					String colour=fan.getcolour();
					String quality=fan.getquality();
					int rating=fan.getrating();
					boolean buy=fan.getbuy();
					
					System.out.println(Brand);
					System.out.println(price);
					System.out.println(feet);
					System.out.println(type);
					System.out.println(rpm);
					System.out.println(warranty);
					System.out.println(colour);
					System.out.println(quality);
					System.out.println(rating);
					System.out.println(buy);
				}

			}

