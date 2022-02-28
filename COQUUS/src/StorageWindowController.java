import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import model.Storage;


public class StorageWindowController implements Initializable {
    private List<Storage> vegetables = new ArrayList<>(vegetables());
    private List<Storage> peppers = new ArrayList<>(peppers());
    @FXML
    private HBox VegetableBox;

    @FXML
    private HBox PepperBox;

    @FXML
    private Button BackBtn;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
       try {
            for (int i = 0; i < vegetables.size(); i++) {
                FXMLLoader fxmlloader = new FXMLLoader();
                fxmlloader.setLocation(getClass().getResource("StorageCard.fxml"));
                HBox cardBox;    
                cardBox = fxmlloader.load();
                StorageCardController cardController = fxmlloader.getController();
                cardController.setVegetablesData(vegetables.get(i));
                VegetableBox.getChildren().add(cardBox);

            }
            for (int i = 0; i < peppers.size(); i++) {
                FXMLLoader fxmlloader = new FXMLLoader();
                fxmlloader.setLocation(getClass().getResource("StorageCard.fxml"));
                HBox cardBox;
                cardBox = fxmlloader.load();
                StorageCardController cardController = fxmlloader.getController();
                cardController.setPeppersData(peppers.get(i));
                PepperBox.getChildren().add(cardBox);
            } 
        }catch (IOException e) {
                e.printStackTrace();
            }

        
    }
    
    public List<Storage> peppers(){
        List<Storage> ls = new ArrayList<>();
        Storage Storage = new Storage();

        Storage.setImgscr("img/peppers/blackPepper.png");
        Storage.setName("Carrot");
        Storage.setQuantity(5);
        ls.add(Storage);

        Storage = new Storage();
        Storage.setImgscr("img/Vegetables/cucumber.png");
        Storage.setName("Cucumber");
        Storage.setQuantity(7);
        ls.add(Storage);

        Storage = new Storage();
        Storage.setImgscr("img/Vegetables/lettus.png");
        Storage.setName("Lettus");
        Storage.setQuantity(4);
        ls.add(Storage);

        Storage = new Storage();
        Storage.setImgscr("img/Vegetables/onion.png");
        Storage.setName("Onion");
        Storage.setQuantity(10);
        ls.add(Storage);

        Storage = new Storage();
        Storage.setImgscr("img/Vegetables/tomato.png");
        Storage.setName("Tomato");
        Storage.setQuantity(14);
        ls.add(Storage);

        return ls;

    }

    public List<Storage> vegetables(){
        List<Storage> ls = new ArrayList<>();
        Storage Storage = new Storage();

        Storage.setImgscr("img/Vegetables/carrot.png");
        Storage.setName("Carrot");
        Storage.setQuantity(5);
        ls.add(Storage);

        Storage = new Storage();
        Storage.setImgscr("img/Vegetables/cucumber.png");
        Storage.setName("Cucumber");
        Storage.setQuantity(7);
        ls.add(Storage);

        Storage = new Storage();
        Storage.setImgscr("img/Vegetables/lettus.png");
        Storage.setName("Lettus");
        Storage.setQuantity(4);
        ls.add(Storage);

        Storage = new Storage();
        Storage.setImgscr("img/Vegetables/onion.png");
        Storage.setName("Onion");
        Storage.setQuantity(10);
        ls.add(Storage);

        Storage = new Storage();
        Storage.setImgscr("img/Vegetables/tomato.png");
        Storage.setName("Tomato");
        Storage.setQuantity(14);
        ls.add(Storage);

        return ls;

    }

    @FXML
    public void goBack(MouseEvent event) throws IOException{
        SceneController toR = new SceneController();
        toR.switchToMainScene(event);
    }
}
