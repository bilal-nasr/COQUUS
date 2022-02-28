import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.DBdataEntry;

public class AddRecipePageController {
    @FXML
    private TextArea DescriptionText;

    @FXML
    private TextField ImgSrc;

    @FXML
    private Button PostButton;

    @FXML
    private TextField RecipeName;

    @FXML
    private TextField UserId;

    @FXML
    void AddToDB(MouseEvent event) {
        try {
            DBdataEntry addData = new DBdataEntry();
            int Userid = Integer.parseInt(UserId.getText());
            addData.RecipeData(RecipeName.getText(), DescriptionText.getText(), ImgSrc.getText(), Userid);
            RecipeName.setText("");
            ImgSrc.setText("");
            UserId.setText("");
            DescriptionText.setText("");
            System.out.println("Recipe added successfully");
        } catch (Exception e) {}
       
    }
    @FXML
    void goBack(MouseEvent event) throws IOException {
        SceneController toR = new SceneController();
        toR.switchToUserPage(event);
    }

}
