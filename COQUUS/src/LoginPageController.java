import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.DBConnection;

public class LoginPageController {

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
    private String uname,pass;
    @FXML
    void goToMainScene(MouseEvent event) throws IOException {
        //todo: create sql logic 
        uname = username.getText();
        pass = password.getText();
        try{
            DBConnection dbConnection = new DBConnection();
            Connection myConnection = dbConnection.getDbConnection();
            Statement mystmt;
                
            mystmt = myConnection.createStatement();
            ResultSet UsernameResult = mystmt.executeQuery("select Name,Pass from users WHERE Name='"+uname+"'");
            UsernameResult.next();
            if(UsernameResult.getString("Pass").equals(pass)){
                System.out.println("Access Granted");
                SceneController toMain = new SceneController();
                toMain.switchToMainScene(event);
            }
            else{
                System.out.println("Access Denied");
            }
           
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    @FXML
    void goToSignUpScene(MouseEvent event) throws IOException {
        SceneController toSignup = new SceneController();
        toSignup.switchToSignupPage(event);
    }

}
