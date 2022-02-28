import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import model.Recipe;

public class RecipeVerticalCardController {
    
    private static int i=0;
    @FXML
    private VBox VBoxCard;
    
    @FXML
    private Label VCardChefName;

    @FXML
    private ImageView VCardImg;

    @FXML
    private Label VCardRecipeName;

    private String[] colors = {"B9E5FF","BDB2FE","FF5856","eef"};

    public void setData(Recipe recipe){
        Image image = new Image(getClass().getResourceAsStream(recipe.getImgscr()));
        VCardImg.setImage(image);

        VCardChefName.setText(recipe.getChef());
        VCardRecipeName.setText(recipe.getName());
        
        if(i==colors.length){
            i=0;
        }
        VBoxCard.setStyle("-fx-background-color: #"+colors[i]+";"
        +"-fx-background-radius: 15;"
        +"-fx-effect: dropShadow(three-pass-box, rgba(0,0,0,0.2), 10, 0, 0, 10);");
        i++;
    }

}
