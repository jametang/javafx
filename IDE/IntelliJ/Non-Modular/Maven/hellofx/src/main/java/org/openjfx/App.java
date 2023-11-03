package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());


    @Override
    public void start(Stage stage) throws IOException {
        //设置应用程序图标
        String IconPath = App.class.getResource("logo.png").toExternalForm();
        LOGGER.log(Level.INFO, "IconPath = " + IconPath);
        Image icon = new Image(IconPath);
        stage.getIcons().add(icon);
        scene = new Scene(loadFXML("primary"));
        String StylePath = App.class.getResource("styles.css").toExternalForm();
        LOGGER.log(Level.INFO, "StylePath = " + StylePath);
        scene.getStylesheets().add(StylePath);
        scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
        stage.setTitle("YMCalc");
        stage.setScene(scene);
        stage.show();

        double Width =  stage.getWidth();
        double Height = stage.getHeight();
        stage.setMinWidth(Width);
        stage.setMinHeight(Height);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}