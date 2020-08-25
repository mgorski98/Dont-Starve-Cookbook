package dontstarvecookbook.core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class DontStarveCookbookMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent p = FXMLLoader.load(getClass().getResource(""));
        Scene s = new Scene(p);
        stage.getIcons().add(new Image(getClass().getResource("/dontstarvecookbook/fxml/mainwindow.fxml").toExternalForm()));
        stage.setScene(s);
        stage.setResizable(false);
        stage.setTitle("Don't Starve Cookbook");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
