package com.xworkz.oops.Encapsulation;

public class shiptester {

		


					public static void main(String []arsg) {
						ship destroyer=new ship();
						destroyer.SetBrand("titanic");
						destroyer.setprice(400000000);
						destroyer.setfeet(883);
						destroyer.settype("White Star Liner crusing");
						destroyer.setrpm(75);
						destroyer.setwarranty(14);
						destroyer.setcolour("white");
						destroyer.setquality("excellant");
						destroyer.setrating(5);
						destroyer.setbuy(true);
						
						String Brand=destroyer.getBrand();
						int price=destroyer.getprice();
						int feet=destroyer.getfeet();
						String type=destroyer.gettype();
						int rpm=destroyer.getrpm();
						int warranty=destroyer.getwarranty();
						String colour=destroyer.getcolour();
						String quality=destroyer.getquality();
						int rating=destroyer.getrating();
						boolean buy=destroyer.getbuy();
						
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

