package kz.stargazer.arkham_horror_client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ArkhamHorrorClientApplication extends Application {
    public static String[] args;

    public static void main(String[] args) {
        ArkhamHorrorClientApplication.args = args;
        Application.launch(ArkhamHorrorClientApplication.class, args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(ArkhamHorrorClientApplication.class.getResource("/views/menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Arkham Horror!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
//        new Thread(() -> {
//            new SpringApplicationBuilder(ArkhamHorrorClientApplication.class).run(args);
//        }, "Spring Thread").start();
    }
}
