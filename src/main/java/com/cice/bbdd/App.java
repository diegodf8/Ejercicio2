package com.cice.bbdd;

import java.sql.*;

public class App
{
    public static void main( String[] args ) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/diego", "root", "root");
            Statement statement = connection.createStatement();
            //String sql ="CREATE TABLE prueba (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(30) NOT NULL, PRIMARY KEY (id))";
            String sql1 = "INSERT INTO prueba (nombre) VALUES('Test10')";
            String sql2 = "SELECT * FROM prueba";
            statement.executeUpdate(sql1);
            ResultSet resultado = statement.executeQuery(sql2);

            while (resultado.next()) {

                String nombre2 = resultado.getString("nombre");
                String id = resultado.getString("id");
                String nombre = resultado.getString("nombre");
                System.out.println(id + "--Record--" + nombre);
            }

            // Cerrar recursos
            resultado.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     private static ResultSet consulta(){

        ResultSet aux = null;

         try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/diego", "root", "root");
             Statement statement = connection.createStatement();
             String sql2 = "SELECT * FROM prueba";
             ResultSet resultado = statement.executeQuery(sql2);

             // Cerrar recursos
             resultado.close();
             statement.close();
             connection.close();

         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
         }

         return aux;

        }


}
