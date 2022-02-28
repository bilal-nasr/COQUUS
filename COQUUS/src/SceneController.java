import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SceneController {

 private Stage stage;
 private Scene scene;
 private Parent root;
 
 public void switchToRecipeWindow(MouseEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("RecipeWindow.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchToRecipePage(MouseEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("RecipePage.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void switchToStoragePage(MouseEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("StorageWindow.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }

   public void switchToMainScene(MouseEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToUserPage(MouseEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("UserPage.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
   public void switchToAddRecipePage(MouseEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("AddRecipepage.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }
}