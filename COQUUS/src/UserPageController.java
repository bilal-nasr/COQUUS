import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class UserPageController {

    @FXML
    void goBack(MouseEvent event) throws IOException {
        SceneController toR = new SceneController();
        toR.switchToMainScene(event);
    }

    @FXML
    void goToAddRecipePage(MouseEvent event) throws IOException {
        SceneController toR = new SceneController();
        toR.switchToAddRecipePage(event);
    }


}
