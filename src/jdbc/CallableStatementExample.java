package jdbc;

import com.connection.DBConnection;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.util.Scanner;

public class CallableStatementExample {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String sName = sc.nextLine();
        System.out.print("Enter student roll: ");
        int sRoll = sc.nextInt();
        
        try {
            Connection con = DBConnection.getConnection();
            
            // 3. create statement            
            CallableStatement st = con.prepareCall("{call insertStudent(?, ?)}");
            st.setString(1, sName);
            st.setInt(2, sRoll);
            
            
            //4. Excute Query
            int i = st.executeUpdate();
            System.out.print(i);
            
            // 5. close connection
            con.close();
            System.out.println("Data Inserted Sucessfully");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
