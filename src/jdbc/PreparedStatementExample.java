package jdbc;

import com.connection.DBConnection;
import java.sql.*;
import java.util.Scanner;


public class PreparedStatementExample {

    public static void main(String args[]) { 
        try {
            Connection con = DBConnection.getConnection();
            
            // 3. create statement
            String query = "Insert into student values(?, ?)";
            PreparedStatement st = con.prepareStatement(query); // precompilied Query
            st.setString(1, "Ashish");
            st.setInt(2, 8);
            
            
            //4. Excute Query
            int i = st.executeUpdate();
            System.out.println(i);

            // 5. close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
