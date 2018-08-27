/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConfig;

import static DBConfig.SQLApplication.DB_connection;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ekanayaketw
 */


public class SQLApplication {
    static String DB_Host= "jdbc:mysql://sql12.freesqldatabase.com"
            + ":3306/sql12250987"; 
    static String username="sql12250987";
    static String password="rNhRL9rBbF";
    
    
    public static Connection DB_connection =null;
    public static PreparedStatement DB_PreparedStatement =null;
    public static ResultSet DB_ResultSet =null;
    
    

    // this constructor can be used to change your connection settings
    public SQLApplication(String Database_URL,int Port,String DatabaseName,String Username,String Password) {
        DB_Host="jdbc:mysql://"+Database_URL+":"+Port+"/"+DatabaseName+"";
        System.out.println(DB_Host);
        username=Username;
        password=Password;
    
    }
    
// used to start a connection with the above selected settings
    public void connect()
   {
   try
    {  
        Class.forName("com.mysql.jdbc.Driver");
        DB_connection=(Connection) DriverManager.getConnection(DB_Host,username,password);
        System.out.println("Succesfully connected to "+DB_Host);
    }
   catch(Exception e)
    {
        System.out.println(e);
    }
   } 
    
// Close the DB connection
    public  void close()
    {
        try {
            DB_connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
// this method is used to excute SQL queryies without a return value
// this method will return a boolen value if it is sucessfull and a message in the console 
    public  boolean execute(String SQL_String){
       
        DB_ResultSet =null;
        //System.out.println(SQL_String);
        try {
            DB_PreparedStatement =DB_connection.prepareStatement(SQL_String);
            DB_PreparedStatement.execute();
            System.out.println("***Successfull***Excuted "+SQL_String);
            
            return true;
       
        } catch (SQLException ex) {
            System.out.println("***Fail***Excuted "+SQL_String);
            Logger.getLogger(SQLApplication.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
    }
   
// this method is used to excute SQL queryies with a return value
// this method will return a Resultset  if it is sucessfull Or NULL value if it fails and a message in the console 
    public ResultSet executeQuery(String SQL_String)
    {   
       DB_ResultSet =null;
       System.out.println(SQL_String);
        try {
            DB_PreparedStatement =DB_connection.prepareStatement(SQL_String);
            DB_ResultSet=DB_PreparedStatement.executeQuery();
            System.out.println("***Successfull***Excuted "+SQL_String);
            
            return DB_ResultSet;
            
        } catch (SQLException ex) {
            System.out.println("***Fail***Excuted "+SQL_String);
            Logger.getLogger(SQLApplication.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
    }
  
 
}