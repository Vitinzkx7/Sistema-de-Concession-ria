package org.example;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, String marca, int ano, double preco, int numeroPortas) {
        super(modelo, marca, ano, preco);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Carro ---");
        System.out.println(this.toString());
        System.out.println("Número de Portas: " + numeroPortas);
    }
}


