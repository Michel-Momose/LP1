package com.example.controller;

import com.example.model.Mercadoria;
import com.example.service.MercadoriaService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MercadoriaController {

    @FXML
    private ListView<Mercadoria> listaMercadoria;

    private MercadoriaService mercadoriaService;

    private ObservableList<Mercadoria> mercadorias;

    @FXML
    public void initialize() {
        this.mercadoriaService = MercadoriaService.getInstancia();
        this.mercadorias = FXCollections.observableArrayList(mercadoriaService.getMercadorias());
        listaMercadoria.setItems(mercadorias);
        listaMercadoria.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        System.out.println("Mercadorias: " + mercadoriaService.getMercadorias());
    }

}