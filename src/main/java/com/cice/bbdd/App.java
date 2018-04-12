package com.cice.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App
{
    public static void main( String[] args ){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/diego","root","root");
            Statement statement = connection.createStatement();
            //String sql ="CREATE TABLE prueba (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(30) NOT NULL, PRIMARY KEY (id))";
            String sql ="INSERT INTO prueba (nombre) VALUES('Test6')";
            //String sql = "SELECT * FROM test";
            statement.executeUpdate(sql);
            // Cerrar recursos
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         catch (SQLException e) {
            e.printStackTrace();
        }




    }
}
