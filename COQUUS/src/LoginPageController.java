import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginPageController {

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void goToMainScene(MouseEvent event) throws IOException {
        //todo: create sql logic 
        SceneController toMain = new SceneController();
        toMain.switchToMainScene(event);
    }

    @FXML
    void goToSignUpScene(MouseEvent event) throws IOException {
        SceneController toSignup = new SceneController();
        toSignup.switchToSignupPage(event);
    }

}
