/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #03
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private static Database instance = null;
    public String text;
    Connection connection;

    private Database() {
        text = "Hello I am a string part of (Database Singleton) class";
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

    public boolean connectionToDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root"); 
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
