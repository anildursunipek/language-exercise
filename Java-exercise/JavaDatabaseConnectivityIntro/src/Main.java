import jdk.dynalink.beans.StaticClass;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        // SQL Statment
        PreparedStatement statment = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            System.out.println("Connection created...");
            statment = connection.prepareStatement(
                    "insert into city (Name,CountryCode, District, Populatiom) values ('Duzce', 'TUR','Duzce', 50000'");
            int result = statment.executeUpdate();
        } catch (SQLException exception) {
            dbHelper.showErrorMessages(exception);
        } finally {
            statment.close();
            connection.close();
        }
        selectDemo();
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        // SQL Statment
        Statement statment = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            System.out.println("Connection created...");
            statment = connection.createStatement(); // Birden fazla database olabilir. Buasamada hangi veritabanina sorgu yazdigimizi belirtiyoruz
            resultSet = statment.executeQuery("select Name, Continent, Region, Population from world.country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while(resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region"),
                        resultSet.getString("Population")
                ));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            dbHelper.showErrorMessages(exception);
        } finally {
            connection.close();
        }
    }
}