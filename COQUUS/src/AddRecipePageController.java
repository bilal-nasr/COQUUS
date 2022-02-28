import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class AddRecipePageController {

    @FXML
    void goBack(MouseEvent event) throws IOException {
        SceneController toR = new SceneController();
        toR.switchToUserPage(event);
    }

}
