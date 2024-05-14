package com.example.simulado;

public class Aviao {
    // Atributos
    private String modelo;
    private int capacidadePassageiros;
    private int autonomiaVoo; // em quilômetros
    
    // Construtor
    public Aviao(String modelo, int capacidadePassageiros, int autonomiaVoo) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.autonomiaVoo = autonomiaVoo;
    }
    
    // Métodos de acesso
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
    
    public int getAutonomiaVoo() {
        return autonomiaVoo;
    }
    
    public void setAutonomiaVoo(int autonomiaVoo) {
        this.autonomiaVoo = autonomiaVoo;
    }
    
    // Métodos de classe
    public double calcularConsumoCombustivel(double distancia) {
        // Simplesmente para ilustrar, um cálculo fictício
        return distancia * 0.1; // assumindo um consumo de 0.1 litros/km
    }
    
    public boolean isAviaoComercial() {
        // Simplesmente para ilustrar, um critério fictício
        return capacidadePassageiros > 100;
    }
    
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade de passageiros: " + capacidadePassageiros);
        System.out.println("Autonomia de voo: " + autonomiaVoo + " km");
        if (isAviaoComercial()) {
            System.out.println("Este avião é comercial.");
        } else {
            System.out.println("Este avião é particular.");
        }
    }
    
    // Método main para teste
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao("Boeing 747", 416, 13650);
        Aviao aviao2 = new Aviao("Airbus A320", 195, 6150);
        Aviao aviao3 = new Aviao("Cessna 172", 4, 1265);
        
        System.out.println("Informações do avião 1:");
        aviao1.exibirInformacoes();
        System.out.println();
        
        System.out.println("Informações do avião 2:");
        aviao2.exibirInformacoes();
        System.out.println();
        
        System.out.println("Informações do avião 3:");
        aviao3.exibirInformacoes();
        System.out.println();
    }
}
