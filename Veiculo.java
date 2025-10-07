package org.example;

public abstract  class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    public Veiculo(String modelo, String marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    // Getters para os atributos
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    // Método abstrato para exibir detalhes específicos de cada tipo de veículo
    public abstract void exibirDetalhes();

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Preço: " + preco;
    }
}

