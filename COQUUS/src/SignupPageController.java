import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.DBConnection;

public class SignupPageController {

    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username1;

    private String uname,pass,Uemail;
    @FXML
    void SignUp(MouseEvent event) {
        //todo: sql logic
        Uemail = email.getText();
        pass = password.getText();
        uname = username1.getText();
        DBConnection dbConnection = new DBConnection();
        Connection myConnection = dbConnection.getDbConnection();
        Statement mystmt;
        try{
        mystmt = myConnection.createStatement();
        ResultSet UsernameResult = mystmt.executeQuery("select Name,Email from users WHERE Name='"+uname+"' OR Email='"+Uemail+"'");
        UsernameResult.next();
        if(UsernameResult.getString("Name").equals(uname) || UsernameResult.getString("Email").equals(Uemail)){
            System.out.println("User Already exist");

        }
    }catch(Exception e){
        try{
            mystmt = myConnection.createStatement();
            mystmt.executeUpdate("INSERT INTO users (name,email,pass) VALUES ('"+uname+"','"+Uemail+"','"+pass+"')");
            System.out.println("Added Successfully");
            SceneController tologin = new SceneController();
            tologin.switchToLoginPage(event);
        }
        catch (Exception e1){
            System.out.println(e1);
        }
    }
}


    @FXML
    void backToLogin(MouseEvent event) throws IOException {
        SceneController toMain = new SceneController();
        toMain.switchToLoginPage(event);
    }

}
