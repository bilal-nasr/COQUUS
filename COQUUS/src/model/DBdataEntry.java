package model;

import java.sql.Connection;
import java.sql.Statement;

public class DBdataEntry {
    private DBConnection dbConnection;

    // Statement mystmt;
        
    // mystmt = myConnection.createStatement();
    // ResultSet myResSet = mystmt.executeQuery("select * from users");
    // while(myResSet.next()){
    //     System.out.println(myResSet.getString("Uid"));
    //     System.out.println(myResSet.getString("Name"));
    //     System.out.println(myResSet.getString("Email"));
    // }
    public void userData(String name,String email,String pass){
        dbConnection = new DBConnection();
        Connection myConnection = dbConnection.getDbConnection();
        Statement mystmt;
        try{
            mystmt = myConnection.createStatement();
            mystmt.executeUpdate("INSERT INTO users (name,email,pass) VALUES ('"+name+"','"+email+"','"+pass+"')");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
        public void RecipeData(String name,String description,String imgsrc,int Uid){
            dbConnection = new DBConnection();
            Connection myConnection = dbConnection.getDbConnection();
            Statement mystmt;
            try{
                mystmt = myConnection.createStatement();
                mystmt.executeUpdate("INSERT INTO recipes (name,description,imgscr,Uid) VALUES ('"+name+"','"+description+"','"+imgsrc+"',"+Uid+")");
            }
            catch (Exception e){
                System.out.println(e);
            }
    }

}
