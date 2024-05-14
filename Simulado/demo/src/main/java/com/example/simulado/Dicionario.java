package com.example.simulado;

public class Dicionario {
    private String termo;
    private String definicao;
    
    // Construtor
    public Dicionario(String termo, String definicao) {
        this.termo = termo;
        this.definicao = definicao;
    }
    
    // Métodos de acesso
    public String getTermo() {
        return termo;
    }
    
    public void setTermo(String termo) {
        this.termo = termo;
    }
    
    public String getDefinicao() {
        return definicao;
    }
    
    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }
}
