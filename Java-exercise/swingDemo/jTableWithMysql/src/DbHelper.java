import java.sql.*;

public class DbHelper {
    private String userName = "root";
    private String password = "12345";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";
    
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void shorErrorMessage(SQLException exception){
        System.out.println("Erorr Message: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }
}
