package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Concessionaria concessionaria = new Concessionaria();
// Dados iniciais para demonstração
        concessionaria.adicionarVeiculo(new Carro("Corolla", "Toyota", 2023, 120000, 4));
        concessionaria.adicionarVeiculo(new Moto("CB 500F", "Honda", 2024, 45000, 471));
        concessionaria.adicionarVeiculo(new Carro("Onix", "Chevrolet", 2022, 85000, 4));

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarVeiculo(concessionaria, scanner);
                    break;
                case 2:
                    concessionaria.listarVeiculos();
                    break;
                case 3:
                    venderVeiculo(concessionaria, scanner);
                    break;
                case 4:
                    adicionarCliente(concessionaria, scanner);
                    break;
                case 5:
                    concessionaria.listarClientes();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- Sistema de Concessionária ---");
        System.out.println("1. Adicionar Veículo");
        System.out.println("2. Listar Veículos em Estoque");
        System.out.println("3. Vender Veículo");
        System.out.println("4. Adicionar Cliente");
        System.out.println("5. Listar Clientes");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarVeiculo(Concessionaria concessionaria, Scanner scanner) {
        System.out.println("Qual tipo de veículo deseja adicionar? (1. Carro / 2. Moto)");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Número de Portas: ");
            int portas = scanner.nextInt();
            concessionaria.adicionarVeiculo(new Carro(modelo, marca, ano, preco, portas));
        } else if (tipo == 2) {
            System.out.print("Cilindradas: ");
            int cilindradas = scanner.nextInt();
            concessionaria.adicionarVeiculo(new Moto(modelo, marca, ano, preco, cilindradas));
        } else {
            System.out.println("Tipo de veículo inválido.");
        }
    }

    private static void venderVeiculo(Concessionaria concessionaria, Scanner scanner) {
        System.out.print("Digite o modelo do veículo que deseja vender: ");
        String modelo = scanner.nextLine();
        concessionaria.venderVeiculo(modelo);
    }

    private static void adicionarCliente(Concessionaria concessionaria, Scanner scanner) {
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();
        concessionaria.adicionarCliente(new Cliente(nome, cpf));
    }
}

