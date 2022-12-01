package BusReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class boo {

	
	void soori() {
		try {

	        
	           Class.forName("com.mysql.jdbc.Driver");
		       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busproject","root","@Root123");
		       Statement stmt=con.createStatement();
		       
		       Scanner so=new Scanner(System.in);
		       System.out.println("ENTER BUS NO");
		       int bno=so.nextInt();
		       

   	       String sqllll= "select * from bus having busno="+bno+"";
   	       
		        ResultSet rs = stmt.executeQuery(sqllll);
		       
		        
		        while(rs.next())  {
		        int bd=rs.getInt("busno");
		        String ac=rs.getString("ac");
		        int cap=rs.getInt("capacity");
		        String der=rs.getString("fromcity");
		        String d=rs.getString("tocity");
		        
		        
		        
		        System.out.println("---------------------------------");
		        System.out.println("BUS NO"+"      "+bd);
		        System.out.println("---------------------------------");
		        System.out.println("AC"+"          "+ac);
		        System.out.println("---------------------------------");
		        System.out.println("CAPACITY"+"    "+cap);
		        System.out.println("---------------------------------");
		        System.out.println("FROMCITY"+"    "+der);
		        System.out.println("---------------------------------");
		        System.out.println("TOCITY"+"      "+d);
		        System.out.println("---------------------------------");
		        }
		       
		       
		       }catch (Exception e) {
     e.printStackTrace();
    }

	}

}
