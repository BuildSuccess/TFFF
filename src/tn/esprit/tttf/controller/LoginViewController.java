package tn.esprit.tttf.controller;

import java.net.URL;
import java.util.ResourceBundle;

import tn.esprit.tttf.delegate.ClerckDelegate;
import tn.esprit.tttf.main.Main;
import tn.esprit.tttf.utils.ControlledScreen;
import tn.esprit.tttf.utils.ScreensController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class LoginViewController implements Initializable,ControlledScreen {
	@FXML
	private Button btn_login;
	@FXML
	private TextField txt_username;
	@FXML
	private TextField txt_password;

	ScreensController screen;
	
	// Event Listener on Button[#btn_login].onAction
	@FXML
	public void loginAction(ActionEvent event) {
		System.out.println(txt_username.getText());
		//System.out.println(ClerckDelegate.findPlayerById());
		Main.mainContainer.loadscreen(Main.testId, Main.testFile);
		Main.mainContainer.setScreen(Main.testId);
	}

	public void SetScreenParent(ScreensController screenpage) {
		screen = screenpage;
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
}
