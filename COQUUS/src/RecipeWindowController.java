import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.DBConnection;
import model.Recipe;

public class RecipeWindowController implements Initializable{
    
    private List<Recipe> recipes;
     
    @FXML
    private HBox Box;
    public void initialize(URL arg0, ResourceBundle arg1) {

        
        try{ recipes = new ArrayList<>(recipes());
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
    private List<Recipe> recipes() throws SQLException{
        DBConnection myConnection = new DBConnection();
        List<Recipe> ls = new ArrayList<>();
        Statement mystmt;
        Connection conn;
        conn= myConnection.getDbConnection();
        mystmt = conn.createStatement();
        
        ResultSet myResSet = mystmt.executeQuery("select * from recipes");
        while(myResSet.next()){
            Recipe recipe = new Recipe(myResSet.getString("name"),myResSet.getString("description"),myResSet.getString("imgscr"),myResSet.getInt("Uid"));
            ls.add(recipe);
        }
        
        return ls;
        
    }

    @FXML
    public void goBack(MouseEvent event) throws IOException{
        SceneController toR = new SceneController();
        toR.switchToMainScene(event);
    }
}
