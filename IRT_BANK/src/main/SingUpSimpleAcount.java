package main;
import java.sql.*;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class SingUpSimpleAcount {
	public String tableres(String Account_Number,String First_Name,String Last_Name,String Phone_Number,String Email,String Account_Type,String Country,String Cuty,String Address,String CNIC,String Occupation,
			String D_O_B,String Password,String Amount){
		String Recovery_Password = generateKey();
		try {
		    // Load the JDBC driver
		    Class.forName("com.mysql.jdbc.Driver");

		    // Establish a connection to the database
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/irt_bank", "root", "");

		    // Create a statement
		    Statement stmt = conn.createStatement();

		    // Insert the data into the table
		    String preservation = "INSERT INTO `singupsimpleaccounts` (`Account_Number`, `First_Name`, `Last_Name`, `Phone_Number`, `Email`, `Account_Type`, `Country`, `Cuty`, `Address`, `CNIC`, `Occupation`, `D_O_B`, `Password`, `Recovery_Password`, `Amount`)   VALUES ('"+Account_Number+"','"+First_Name+"', '"+Last_Name+"','"+Phone_Number+"','"+Email+"','"+Account_Type+"', '"+Country+"','"+Cuty+"','"+Address+"','"+CNIC+"','"+Occupation+"' ,'"+D_O_B+"','"+Password+"', '"+Recovery_Password+"','"+Amount+"')";
		    
		    stmt.executeUpdate(preservation);

		    // Close the connection
		    conn.close();
		  } catch (Exception e) {
		    System.out.println(e);
		  }
		return Recovery_Password ;
	}
	 private static final int KEY_LENGTH = 16;
	    private static final String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    
	    public static String generateKey() {
	        Random rng = new Random();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < KEY_LENGTH; i++) {
	            int index = rng.nextInt(CHARSET.length());
	            sb.append(CHARSET.charAt(index));
	        }
	        return sb.toString();
	    }
}










//import java.util.Random;
//public class SingUpSimpleAcount {
//    public static void main(String[] args) {
//        String Account_Number = "";
//        String fname = "";
//        String lname = "";
//        String number = "";
//        String email = "";
//        String Acc_type = "";
//        String country = "";
//        String city = "";
//        String address = "";
//        String CNIC = "";
//        String occupation = "";
//        String D_O_B = "";
//        String password = "";
//        String balance = "";
//        String rec_paswd = generateKey();
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/irt_bank","root","");
//            String sql = "INSERT INTO `singupsimpleaccounts`(`Account_Number`, `First_Name`, `Last_Name`, `Phone_Number`, `Email`, `Account_Type`, `Country`, `Cuty`, `Address`, `CNIC`, `Occupation`, `D_O_B`, `Password`, `Recovery_Password`, `Amount`)  "
//                        + " VALUES ('"+Account_Number+"','"+fname+"', '"+lname+"','"+number+"','"+email+"','"+Acc_type+"', '"+country+"','"+city+"','"+address+"','"+CNIC+"','"+occupation+"' ,'"+D_O_B+"','"+password+"', '"+rec_paswd+"','"+balance+"')";
//            PreparedStatement stmt = con.prepareStatement(sql);
//            System.out.println(sql);
//            stmt.executeUpdate();
//            con.close();
//        } catch(Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    private static final int KEY_LENGTH = 16;
//    private static final String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//    public static String generateKey() {
//        Random rng = new Random();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < KEY_LENGTH; i++) {
//            int index = rng.nextInt(CHARSET.length());
//            sb.append(CHARSET.charAt(index));
//        }
//        return sb.toString();
//    }
//}
//

//	public  void getSimpleAccountDetail() {
//		try{
//			Connection con =
//			DriverManager.getConnection("jdbc:mysql://localhost:3306/irt_bank","root","");
//			Statement stmt=con.createStatement();
//			ResultSet rs=stmt.executeQuery("SELECT * FROM singupsimpleaccounts");
//
//			while(rs.next())
//			{
//			System.out.println("ID: " + rs.getInt(1) + "  Account_Number: " + rs.getString(2) + " First_Name: "
//			+ rs.getString(3)+" Last_Name: "+rs.getString(4)+" Phone_Number: "+rs.getString(5)+" Email: "+rs.getString(6)+" Account_Type: "+rs.getString(7)
//			+" Country: "+rs.getString(8)+" Cuty: "+rs.getString(9)+" Address: "+rs.getString(10));
//			}
//			con.close();
//			} catch(Exception e)
//			{
//				
//			System.out.println(e);
//			}
//	}

