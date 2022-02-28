import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SignupPageController {

    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username1;

    @FXML
    void SignUp(MouseEvent event) {
        //todo: sql logic
    }

    @FXML
    void backToLogin(MouseEvent event) throws IOException {
        SceneController toMain = new SceneController();
        toMain.switchToLoginPage(event);
    }

}
