package com.example.dockertestserver.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnector {

    static Connection con;

    public static void main(String[] args) {

    }
    public Connection ConnectDB(){
    if(con != null){
        return con;
    }
    try(InputStream propertiesFile = new FileInputStream("src/main/resources/application.properties")) {
        Properties props = new Properties();
        props.load(propertiesFile);

        String url = props.getProperty("db.url");
        String username = props.getProperty("db.username");
        String password = props.getProperty("db.password");

        con = (Connection) DriverManager.getConnection(url, username, password);
    }
    catch (SQLException | IOException e){
        System.out.println("Connection Failed");
        e.printStackTrace();
    }
        return con;

    }

    public Connection ConnectDBv2() {
        System.out.println("Connecting to the database");
        try {
            String url = "jdbc:mysql://20.223.213.36/Docker";
            String user = "root";
            String password = "mypassword";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("URL: " + url);
            System.out.println("Connection: " + con);

        } catch (Exception e) {
            System.out.println("ERROR");
        }

        return con;
    }
}
