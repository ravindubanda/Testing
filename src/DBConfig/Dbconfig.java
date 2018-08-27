/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ekanayaketw
 */
public class Dbconfig {
    public static void main(String[] args) throws Exception {
        //connect to database
        Class.forName("com.mysql.jdbc.Driver");
        String Host = "\"jdbc:mysql://sql12.freesqldatabase.com\"\n" +
"            + \":3306/sql12250987\"; ";
        String portNumber = "3306";
        String username = "sql12250987";
        String password = "rNhRL9rBbF";
        Connection conn = DriverManager.getConnection(Host, username, password);
    }
    
}
