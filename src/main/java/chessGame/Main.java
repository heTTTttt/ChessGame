package chessGame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/chessGame/Main.fxml")));
            Scene scene = new Scene(root, Color.GRAY);

            stage.getIcons().add(new Image("C:\\Chess\\ChessGame\\images\\gameLogo\\GameIcon.png"));
            stage.setTitle("Stage Demo Program Chess Game");

            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
