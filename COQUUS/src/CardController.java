
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import model.Recipe;

public class CardController {
    private static int i=0;
    @FXML
    private ImageView CardImg;

    @FXML
    private Label ChefName;

    @FXML
    private Label RecipeDescription;

    @FXML
    private Label RecipeName;

    @FXML
    private HBox box;

    private String[] colors = {"B9E5FF","BDB2FE","FF5856","eef"};


    public void setData(Recipe recipe) throws IOException{
        Image image = new Image(getClass().getResourceAsStream(recipe.getImgscr()));
        CardImg.setImage(image);
        
        ChefName.setText(recipe.getChef());
        RecipeDescription.setText(recipe.getDescription());
        RecipeName.setText(recipe.getName());
        if(i==colors.length){
            i=0;
        }
        box.setStyle("-fx-background-color: #"+colors[i]+";"
        +"-fx-background-radius: 15;"
        +"-fx-effect: dropShadow(three-pass-box, rgba(0,0,0,0.2), 10, 0, 0, 10);");
        i++;
    }

}
