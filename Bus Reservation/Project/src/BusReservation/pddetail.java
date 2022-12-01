package BusReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class pddetail extends busdetails {

	void con()
	{		try {

	       
	         Class.forName("com.mysql.jdbc.Driver");
		     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busproject","root","@Root123");
		       Statement stmt=con.createStatement();
		       
		       
		       
		       Scanner so=new Scanner(System.in);
		       System.out.println("ENTER UR CONTACT TO GET USER DETAILS:");
		       long no=so.nextLong();
		       

      	       String sqlll= "select * from passenger having contactno="+no+"";
      	       
		        ResultSet rs = stmt.executeQuery(sqlll);
		       
		        
		        while(rs.next())  {
		        int idd=rs.getInt("passengerid");
		        long ag=rs.getLong("contactno");
		        String iddd=rs.getString("passengername");
		        String der=rs.getString("gender");
		        int d=rs.getInt("age");
		        
		        
		        System.out.println("                                                   ");
		        System.out.println("---------------------------------");
		        System.out.println("PASSENGER ID"+"      "+idd);
		        System.out.println("---------------------------------");
		        System.out.println("CONTACT NO"+"        "+ag);
		        System.out.println("---------------------------------");
		        System.out.println("PASSENGER NAME"+"    "+iddd);
		        System.out.println("---------------------------------");
		        System.out.println("GENDER"+"            "+der);
		        System.out.println("---------------------------------");
		        System.out.println("AGE"+"               "+d);
		        System.out.println("---------------------------------");
		        System.out.println("                                                   ");
		       
		        }
		        
		        
		        
	        } catch (Exception e) {
	         e.printStackTrace();
	        }
	
}
}


	


