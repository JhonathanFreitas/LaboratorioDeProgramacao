package com.exemplo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormularioCadastro extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/exemplo/formulario.fxml"));
        GridPane formulario = loader.load();
        Scene scene = new Scene(formulario, 470, 310);
        scene.getStylesheets().add(getClass().getResource("/com/exemplo/estilo.css").toExternalForm());
        stage.setTitle("Formulário para cadastro de Pessoa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
