package com.example.model;

public class Mercadoria {
    private int id;
    private String nome;
    private double preco;
    private String tipoMercadoria;
    private static int geraId  = 1;
    
    public Mercadoria(String nome, double preco, String tipoProduto) {
        this.id = geraId++;
        this.nome = nome;
        this.preco = preco;
        this.tipoMercadoria = tipoProduto;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipoProduto() {
        return tipoMercadoria;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoMercadoria = tipoProduto;
    }
    
    @Override
    public String toString() {
        return "tipo = " + tipoMercadoria + " id = " + id + ", nome = " + nome + ", preco = " + preco;
    }
}
