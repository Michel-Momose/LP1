package com.example.model;

public class Roupa extends Mercadoria{
    private String marca;
    private String cor;
    private String tamanho;

    public Roupa(String nome, double preco, String marca, String modelo, String cor, String tamanho) {
        super(nome, preco, "Roupa");
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }   

    public void setCor(String cor) {
        this.cor = cor;
    }   

    public String getTamanho() {
        return tamanho;
    }   

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }   

    @Override
    public String toString() {
        return "tipo = " + getTipoProduto() + " id = " + getId() + ", nome = " + getNome() + ", preco = " + getPreco() + ", marca = " + marca + ", cor = " + cor + ", tamanho = " + tamanho;
    }

}
