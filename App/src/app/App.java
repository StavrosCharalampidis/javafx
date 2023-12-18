package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
    static Stage primaryStage;
    static Scene mainScene, UserScene;
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        
        SceneCreator mainSceneCreator = new MainSceneCreator(650, 300);
        mainScene = mainSceneCreator.createScene();
        
        SceneCreator UserSceneCreator = new UserSceneCreator(650, 300);
        UserScene = UserSceneCreator.createScene();
        
        
        
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("JavaFXApplication1");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
