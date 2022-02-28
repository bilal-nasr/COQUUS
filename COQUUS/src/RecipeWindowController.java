import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Recipe;

public class RecipeWindowController implements Initializable{
    
    private List<Recipe> recipes;
     
    @FXML
    private HBox Box;
    public void initialize(URL arg0, ResourceBundle arg1) {
        recipes = new ArrayList<>(recipes());
        
        try{
            for (int i = 0; i < recipes.size(); i++) {
                FXMLLoader fxmlloader = new FXMLLoader();
                fxmlloader.setLocation(getClass().getResource("RecipeVerticalCard.fxml"));
                VBox cardBox = fxmlloader.load();
                RecipeVerticalCardController cardController = fxmlloader.getController();
                cardController.setData(recipes.get(i));

                cardBox.setOnMouseClicked(e -> {
                    SceneController toRecipePage = new SceneController();
                    try {
                        toRecipePage.switchToRecipePage(e);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                });
                Box.getChildren().add(cardBox);
            }
            }catch(Exception e){
            System.out.println(e.getMessage());}
    }
    private List<Recipe> recipes(){
        List<Recipe> ls = new ArrayList<>();

        Recipe recipe = new Recipe("Name","img/Food/SpicyTomatodip.png","Zaynab","Hello");
        ls.add(recipe);
        return ls;
        
    }

    @FXML
    public void goBack(MouseEvent event) throws IOException{
        SceneController toR = new SceneController();
        toR.switchToMainScene(event);
    }
}
