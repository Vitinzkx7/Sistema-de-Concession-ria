package org.example;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String modelo, String marca, int ano, double preco, int cilindradas) {
        super(modelo, marca, ano, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes da Moto ---");
        System.out.println(this.toString());
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }
}

