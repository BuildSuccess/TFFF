package tn.esprit.tttf.main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tn.esprit.tttf.utils.ScreensController;

public class Main  extends Application {

	public static String loginViewId = "login";
    public static String loginViewFile = "/tn/esprit/tttf/view/LoginView.fxml";
    public static String acceuilId = "acceuil";
    public static String acceuilFile = "/tn/esprit/tttf/view/Acceuil.fxml";
    public static String testId = "test";
    public static String testFile = "/tn/esprit/tttf/view/MyTestView.fxml";
    public static ScreensController  mainContainer;
	@Override
	public void start(Stage primaryStage) throws Exception {
		mainContainer = new ScreensController();

        mainContainer.loadscreen(loginViewId, loginViewFile);
	    mainContainer.setScreen(Main.loginViewId);
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
