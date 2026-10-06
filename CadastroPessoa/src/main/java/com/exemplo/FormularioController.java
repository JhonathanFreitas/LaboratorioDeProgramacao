package com.exemplo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FormularioController {
    @FXML private TextField campoCpf;
    @FXML private TextField campoNome;
    @FXML private TextField campoEndereco;
    @FXML private ComboBox<String> comboEstado;
    @FXML private ComboBox<String> comboCargo;
    @FXML private Button botaoImprimir;

    @FXML
    private void initialize() {
        ObservableList<String> estados = FXCollections.observableArrayList(
            "Minas Gerais", "São Paulo", "Rio de Janeiro"
        );
        ObservableList<String> cargos = FXCollections.observableArrayList(
            "Gerente de Marketing", "Analista de Sistemas", "Desenvolvedor",
            "Assistente Administrativo", "Vendedor", "Professor"
        );
        comboEstado.setItems(estados);
        comboCargo.setItems(cargos);

        // Expressão lambda exigida pela atividade.
        botaoImprimir.setOnAction(evento -> {
            String estado = comboEstado.getValue() == null ? "Não selecionado" : comboEstado.getValue();
            String cargo = comboCargo.getValue() == null ? "Não selecionado" : comboCargo.getValue();
            String dados = "CPF: " + campoCpf.getText()
                + "\nNome: " + campoNome.getText()
                + "\nEndereço: " + campoEndereco.getText()
                + "\nEstado: " + estado
                + "\nCargo: " + cargo;
            Alert mensagem = new Alert(Alert.AlertType.INFORMATION);
            mensagem.initOwner(botaoImprimir.getScene().getWindow());
            mensagem.setTitle("Mensagem");
            mensagem.setHeaderText(null);
            mensagem.setContentText(dados);
            mensagem.showAndWait();
        });
    }
}
