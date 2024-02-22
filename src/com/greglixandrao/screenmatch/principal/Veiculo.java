package com.greglixandrao.screenmatch.principal;

import com.google.gson.Gson;

class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        // Crie uma instância do objeto Veiculo
        Veiculo carro = new Veiculo();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAnoFabricacao(2022);
        carro.setPreco(75000.00);

        Gson gson = new Gson();
        String jsonVeiculo = gson.toJson(carro);

        // Imprima o JSON resultante
        System.out.println("Objeto Veiculo serializado para JSON:");
        System.out.println(jsonVeiculo);
    }
}

