package jdbc;

import com.connection.DBConnection;
import java.sql.*;
import java.util.Scanner;


public class StatementExample {

    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String sName = sc.nextLine();
        System.out.print("Enter student roll: ");
        int sRoll = sc.nextInt();
        
        try {
            Connection con = DBConnection.getConnection();
            
            // 3. create statement            
            Statement st = con.createStatement();
            
            //4. Excute Query
            String query = "insert into student values('"+sName+"',"+sRoll+")";
            st.execute(query);
            
            // 5. close connection
            con.close();
            System.out.println("Data Inserted Sucessfully");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
