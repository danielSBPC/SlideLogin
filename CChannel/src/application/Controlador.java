package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {

	@FXML
	private void botonCerrar() {
		System.exit(0);
	}

	public void botonLive() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Live.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("¡Welcome to github!");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
