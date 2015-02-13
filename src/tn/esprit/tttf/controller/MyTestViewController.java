package tn.esprit.tttf.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import tn.esprit.tttf.utils.ControlledScreen;
import tn.esprit.tttf.utils.ScreensController;

public class MyTestViewController implements Initializable,ControlledScreen {

	ScreensController screen;
	@Override
	public void SetScreenParent(ScreensController screenpage) {
		screen = screenpage;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

	 @FXML
	    private Button btn_id;

	    @FXML
	    void btn_action(ActionEvent event) {
	    	System.out.println("jjjeehe");
	    }

	
}
