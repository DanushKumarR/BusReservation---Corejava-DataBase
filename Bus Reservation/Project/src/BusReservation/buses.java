package BusReservation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class buses {
       void bu() {
    	   Scanner sc=new Scanner(System.in);

             
             int busno = 0;
		   
	       try {
	           
	           Class.forName("com.mysql.jdbc.Driver");
	  	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busproject","root","@Root123");
	  	       Statement stmt=con.createStatement();
	  	       System.out.println("ENTER AC/NON-AC (YES/NO)");
		       String ac=sc.next(); 
		       System.out.println("ENTER FROM CITY");
		       String fromcity=sc.next();
		       System.out.println("ENTER TO CITY");
		       String tocity=sc.next();
		       String sq= ("insert into bus values('"+busno+"','"+ac+"','"+20+"','"+fromcity+"','"+tocity+"')");
		      stmt.execute(sq);
		       
		      System.out.println("BUS ADDED SUCCESSFULLY");
	       } catch (Exception e) {
	           e.printStackTrace();
	        }
       }}
	


