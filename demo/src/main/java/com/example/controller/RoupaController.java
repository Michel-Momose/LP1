package com.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import com.example.model.Roupa;
import com.example.service.MercadoriaService;


public class RoupaController {
    @FXML
    private Button btnCadastroCamisa;

    private MercadoriaService mercadoriaService = new MercadoriaService();

    @FXML
    public void cadastrarCamisa(ActionEvent event) {
        // Obter os dados dos campos de texto e etiquetas
        String nome = TextAreaNomeRoupa.getText();
        String marca = TextAreaMarcaRoupa.getText();
        String cor = TextAreaCorRoupa.getText();
        String tamanho = TextAreaTamanhoRoupa.getText();
        double preco = Double.parseDouble(TextAreaPrecoRoupa.getText());

        // Criar um objeto Camisa
        Roupa roupa = new Roupa(nome, preco, marca, "", cor, tamanho);

        // Adicionar a camisa ao ProdutoService
        // ProdutoService.getInstancia().adicionarProduto(camisa);
        mercadoriaService.adicionarMercadoria(roupa);

        // Exibir uma mensagem de sucesso
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Cadastro realizado");
        alert.setHeaderText(null);
        alert.setContentText("Produto cadastrado com sucesso!\nNome: " + roupa.getNome() + "\nMarca: " + roupa.getMarca() + "\nCor: " + roupa.getCor() + "\nTamanho: " + roupa.getTamanho() + "\nPreço: " + roupa.getPreco());

        alert.showAndWait();

        // Limpar os campos de texto
        TextAreaNomeRoupa.clear();
        TextAreaMarcaRoupa.clear();
        TextAreaCorRoupa.clear();
        TextAreaTamanhoRoupa.clear();
        TextAreaPrecoRoupa.clear();
    }

    @FXML
    private TextArea TextAreaPrecoRoupa;

    @FXML
    private Label lblCorRoupa;

    @FXML
    private Label lblNomeRoupa;

    @FXML
    private TextArea TextAreaCorRoupa;

    @FXML
    private Label lblTamanhoRoupa;

    @FXML
    private TextArea TextAreaMarcaRoupa;

    @FXML
    private TextArea TextAreaTamanhoRoupa;

    @FXML
    private TextArea TextAreaNomeRoupa;

    @FXML
    private ImageView imgBicicleta;

    @FXML
    private Label lblMarcaRoupa;

    @FXML
    private Label lblPrecoRoupa;

    // @FXML
    // void cadastrarBicicleta(ActionEvent event) {

    // }
}
