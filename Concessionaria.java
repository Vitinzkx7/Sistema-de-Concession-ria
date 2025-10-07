package org.example;
import java.util.List;
import java.util.ArrayList;
public class Concessionaria {
    private List<Veiculo> estoque;
    private List<Cliente> clientes;

    public Concessionaria() {
        this.estoque = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    // Métodos para gerenciar veículos
    public void adicionarVeiculo(Veiculo veiculo) {
        estoque.add(veiculo);
        System.out.println("Veículo adicionado ao estoque.");
    }

    public void listarVeiculos() {
        if (estoque.isEmpty()) {
            System.out.println("Nenhum veículo no estoque.");
        } else {
            System.out.println("\n--- Veículos em Estoque ---");
            for (Veiculo v : estoque) {
                v.exibirDetalhes();
                System.out.println("-------------------------");
            }
        }
    }

    // Método para vender um veículo
    public boolean venderVeiculo(String modelo) {
        for (Veiculo v : estoque) {
            if (v.getModelo().equalsIgnoreCase(modelo)) {
                estoque.remove(v);
                System.out.println("Veículo " + v.getModelo() + " vendido com sucesso!");
                return true;
            }
        }
        System.out.println("Veículo com modelo " + modelo + " não encontrado no estoque.");
        return false;
    }

    // Métodos para gerenciar clientes
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso.");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("\n--- Clientes Cadastrados ---");
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }
    }
}

