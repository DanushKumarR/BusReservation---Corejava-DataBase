package BusReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class busdetails {

	
		void det() {
			
			try {
				 ArrayList<ArrayList<Integer>> outno = new ArrayList<ArrayList<Integer>>();
		         ArrayList<ArrayList<String>> outac = new ArrayList<ArrayList<String>>();
		         ArrayList<ArrayList<Integer>> outcapacity = new ArrayList<ArrayList<Integer>>();
		         ArrayList<ArrayList<String>> outfrom = new ArrayList<ArrayList<String>>();
		         ArrayList<ArrayList<String>> outto = new ArrayList<ArrayList<String>>();
		         Class.forName("com.mysql.jdbc.Driver");
			     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busproject","root","@Root123");
			       Statement stmt=con.createStatement();
			       
			       
			       
			       Scanner vv=new Scanner(System.in);
			       System.out.println("ENTER BUSNO:");
			       int busno=vv.nextInt();
			       
			       String sql= "select *from bus having busno="+busno+"";
			       
			       ResultSet resultSet = stmt.executeQuery(sql);
			       
			        System.out.println("                      SD FLY&SKY AVAILABLE DETAILS");
			        System.out.println("-------------------------------------------------------------------");
					System.out.println("BUS NO |   AC    |CAPACITY    |DESTINATION: FROM ---> TO                   ");
					System.out.println("-------------------------------------------------------------------");
			    
		       
		         while (resultSet.next()) {
		        	 ArrayList<Integer> inno = new ArrayList<Integer>();
		            ArrayList<String> inac = new ArrayList<String>();
		            ArrayList<Integer> incapacity = new ArrayList<Integer>();
		            ArrayList<String> infrom = new ArrayList<String>();
		            ArrayList<String> into = new ArrayList<String>();
		            
		            
		            inno.add(resultSet.getInt("busno"));
		            inac.add(resultSet.getString("ac"));
		            incapacity.add(resultSet.getInt("capacity"));
		            infrom.add(resultSet.getString("fromcity"));
		            into.add(resultSet.getString("tocity"));
		            
		            outno.add(inno);
		            outac.add(inac);
		            outcapacity.add(incapacity);
		            outfrom.add(infrom);
		            outto.add(into);
		            
		            
		         }
		         for (int i = 0; i < outac.size(); i++) {
		        	 
		            System.out.println(outno.get(i)+"    |  "+ outac.get(i)+"  |    "+outcapacity.get(i)+"    |  "+outfrom.get(i)+"  -->  "+outto.get(i));
		            System.out.println("-------------------------------------------------------------------");
		            
		         }
		        
		        } catch (Exception e) {
		         e.printStackTrace();
		      }

	}
	

}
