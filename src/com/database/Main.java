package com.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/dbBooks";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void main(String[] args){
        Connection conn = null;
        Statement statement = null;
        ResultSet result = null;

        try{
            // Load the driver class
            Class.forName(DRIVER);

            // Establish connection
            conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

            // Create statement for quering the database
            statement = conn.createStatement();
            result = statement.executeQuery("SELECT * FROM tblBooks");

            while(result.next()){
                String author = (String) result.getObject(2);
                String title = (String) result.getObject(3);
                System.out.println(author + ": " + title);
            }
        }catch (ClassNotFoundException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }catch (SQLException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
