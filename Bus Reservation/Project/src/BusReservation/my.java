package BusReservation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class my extends busdetails {

	private static final int ss = 0;

	public static void main(String[] args) {
		String us="s";
		String pa="u";
		IntStream intStream = IntStream.range(1, 20);
		
		for(int i=0;i<2;i++) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("ENTER USER NAME");
		   String user=sc.nextLine();
		   System.out.println("ENTER PASSWORD");
		   String password=sc.nextLine();
		 
		   
		    if(user.equals(us) && password.equals(pa)) {
			  
			   
			   for(int j=0;j<20;j++) {
				   System.out.println("                                                   ");
				   System.out.println("--------------------------------------------------");
				   System.out.println("         SD FLY&SKY TEAM BUS SERVICE              ");
				   System.out.println("--------------------------------------------------");
				   System.out.println("CATEGORIES:");
				   System.out.println("--------------------------------------------------");
				   System.out.println("   1.BUS SEAT BOOKING");
				   System.out.println("--------------------------------------------------");
				   System.out.println("   2.BUS ADD INTO SD FLY&SKY LIST");
				   System.out.println("--------------------------------------------------");
				   System.out.println("   3.BOOKING CONFIRMATION & INFORMATION DETAILS");
				   System.out.println("--------------------------------------------------");
				   System.out.println("   4.EXIT");
//				   System.out.println("--------------------------------------------------");
				   System.out.println("**************************************************");
				   System.out.println("                                                   ");
			   System.out.println("      SELECT YOUR CHOICE      ");
			   int s=sc.nextInt();
			   
			   if(s==1) {
				   System.out.println("WELCOME TO SD FLY&SKY-BOOKING ");
				   
				   
				   
				   
				   if(s==1) {
					   
					   buses1 bus=new buses1();
					   bus.es();
					   
					   
					   busdetails sss=new busdetails();
					   sss.det();
					   
					   
						   passenger ppp=new passenger();
						   ppp.pass();
						   
						   pddetail po=new pddetail();
						   po.con();
						  
						   
						   System.out.println("YOUR BOOKING IS CONFIRMED");
						   System.out.println("THANKS FOR BOOKING");
					   
				   }

				   }
			   
			    if(s==2) {
				   System.out.println("WELCOME TO SD FLY&SKY-ADDING");
				   
				   buses sur=new buses();
				   sur.bu();
				   
				   System.out.println("SUCCESSFULLY ADDED");
				   
				   
				   
				   
			   }
			   else  if(s==3) {
				   System.out.println("VIEW PARTICULAR BUS DETIALS");
				   
				   
				   boo sy=new boo();
				   sy.soori();
				   
				   pddetail po=new pddetail();
				   po.con();
				   
				   
			   }
			   else if(s==4) {
				   System.out.println("EXIT");
				   
			   }}
			 }else {
				 System.out.println("INCORRECT PASSWORD");
			 }
		      
       }
		
}
}
