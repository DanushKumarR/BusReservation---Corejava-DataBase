package BusReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class passenger   {
	void pass() {
		Scanner cc=new Scanner(System.in);

		int passengerid=0;
        
		 
      try {
          
           Class.forName("com.mysql.jdbc.Driver");
 	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busproject","root","@Root123");
 	       Statement stm=con.createStatement();
 	    
 	      System.out.println("ENTER CONTACT NUMBER");
	       String contactno=cc.next();
 	       System.out.println("ENTER NAME");
	       String passengername=cc.next(); 
	       System.out.println("ENTER GENDER");
	       String gender =cc.next();
	       System.out.println("ENTER AGE");
	       String age=cc.next();
	     
		  String sqll= ("insert into passenger values('"+passengerid+"','"+contactno+"','"+passengername+"','"+gender +"','"+age+"')");
	       stm.execute(sqll);
	     System.out.println("USER ENTERED DETAILS SUCCESSS");
 	      
      } catch (Exception e) {
          e.printStackTrace();
       }
	    
	}

}
