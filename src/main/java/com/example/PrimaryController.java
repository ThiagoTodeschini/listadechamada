package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextArea txtAlunos;
    @FXML TextField txtNome;

    @FXML
    private void adicionar(){
        System.out.println("Adicionar aluno");
        String nome = txtNome.getText();
        txtAlunos.appendText(nome + "\n");
    }

}
