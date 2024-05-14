package com.example.service;


import com.example.model.Mercadoria;

import java.util.List;
import java.util.ArrayList;

public class MercadoriaService {
    private static MercadoriaService instancia;
    private List<Mercadoria> mercadorias;

    public MercadoriaService() {
        this.mercadorias = new ArrayList<>();
    }

    public static MercadoriaService getInstancia() {
        if (instancia == null) {
            instancia = new MercadoriaService();
        }
        return instancia;
    }

    public void adicionarMercadoria(Mercadoria mercadoria) {
        this.mercadorias.add(mercadoria);
    }

    public List<Mercadoria> getMercadorias() {
        return this.mercadorias;
    }
}
