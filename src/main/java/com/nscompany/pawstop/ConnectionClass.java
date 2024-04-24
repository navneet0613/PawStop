/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nscompany.pawstop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class ConnectionClass {

    private static ConnectionClass single_instance = null;
    public Connection connection;

    private ConnectionClass() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pawstop", "root", "");

            System.out.println("connection issssss" + connection);
            if (connection != null) {
                System.out.println("connected");

                String statement1 = "CREATE TABLE IF NOT EXISTS user_details(\n" +
                        "  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                        "  name VARCHAR(255),\n" +
                        "  userid VARCHAR(255),\n" +
                        "  phoneno VARCHAR(255),\n" +
                        "  password VARCHAR(255)\n" +
                        ");";

                PreparedStatement preparedStatement1 = connection.prepareStatement(statement1);
                preparedStatement1.execute();


                String statement2 = "CREATE TABLE IF NOT EXISTS petdetails(\n" +
                        "  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                        "  name VARCHAR(255),\n" +
                        "  gender VARCHAR(255),\n" +
                        "  species VARCHAR(350),\n" +
                        "  breed VARCHAR(255),\n" +
                        "  dob VARCHAR(255),\n" +
                        "  premed VARCHAR(255),\n" +
                        "  symp VARCHAR(255),\n" +
                        "  oname VARCHAR(255),\n" +
                        "  phoneno VARCHAR(255),\n" +
                        "  email VARCHAR(255),\n" +
                        "  address VARCHAR(255)\n" +
                        ");";
                PreparedStatement preparedStatement2 = connection.prepareStatement(statement2);
                preparedStatement2.execute();

//                String statement3 = "CREATE TABLE IF NOT EXISTS tbl_taskupdate(\n" +
//                        "  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
//                        "  Task_ID VARCHAR(255),\n" +
//                        "  Assigned_by VARCHAR(255),\n" +
//                        "  Submission_Status VARCHAR(255),\n" +
//                        "  Current_Progress VARCHAR(255),\n" +
//                        "  Updates VARCHAR(255)\n" +
//                        ");";
//                PreparedStatement preparedStatement3 = connection.prepareStatement(statement3);
//                preparedStatement3.execute();

            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ConnectionClass getInstance() {
        if (single_instance == null) {
            single_instance = new ConnectionClass();
        }
        return single_instance;
    }

    static class getInstance extends ConnectionClass {

        public getInstance() {
        }
    }
}
