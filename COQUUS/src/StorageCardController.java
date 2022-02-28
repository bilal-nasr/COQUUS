import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import model.Storage;


public class StorageCardController {
    private static int i = 0;
    @FXML
    private ImageView VegetableImage;

    @FXML
    private Label VegetableName;

    @FXML
    private Label VegetableQuantity;

    @FXML
    private HBox StorageCardBox;


    private String[] colors = {"B9E5FF","BDB2FE","FF5856","eef"};
    public void setVegetablesData(Storage vegitable){
        Image image = new Image(getClass().getResourceAsStream(vegitable.getImgscr()));
        VegetableImage.setImage(image);

        VegetableName.setText(vegitable.getName());
        VegetableQuantity.setText(Integer.toString(vegitable.getQuantity()));

        if(i==colors.length){
            i=0;
        }
        StorageCardBox.setStyle("-fx-background-color: #"+colors[i]+";"
        +"-fx-background-radius: 15;"
        +"-fx-effect: dropShadow(three-pass-box, rgba(0,0,0,0.2), 10, 0, 0, 10);");
        i++;
    }
    public void setPeppersData(Storage pepper){
        Image image = new Image(getClass().getResourceAsStream(pepper.getImgscr()));
        VegetableImage.setImage(image);

        VegetableName.setText(pepper.getName());
        VegetableQuantity.setText(Integer.toString(pepper.getQuantity()));

        if(i==colors.length){
            i=0;
        }
        StorageCardBox.setStyle("-fx-background-color: #"+colors[i]+";"
        +"-fx-background-radius: 15;"
        +"-fx-effect: dropShadow(three-pass-box, rgba(0,0,0,0.2), 10, 0, 0, 10);");
        i++;
    }
}
