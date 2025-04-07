package AtvDeBancoMercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicializar scanner

        List<Eletronico> eletronicos = new ArrayList<>(); // Lista para armazenar produtos eletrônicos
        List<Alimento> alimentos = new ArrayList<>(); // Lista para armazenar alimentos
        List<Roupa> roupas = new ArrayList<>(); // Lista para armazenar roupas

        while (true) { // Inicio do loop while que mantem o programa rodando até o usuário escolher sair

            System.out.println("Que tipo de produto você quer associar ao sistema?");
            System.out.println("(1) Roupa, (2) Alimento, (3) Eletrônico, (4) Sair");
            int escolha = sc.nextInt();
            sc.nextLine(); // Limpar buffer (memória temporária/ram)
            // (É útil para capturar uma entrada que pode conter espaços, como uma frase ou uma linha inteira,
            // sem que o programa a separe em palavras)

            switch (escolha) { // Inicialização de um case para listar as opções que o usuário pode seguir no programa

                case 1: // Caso Roupa
                    int escolha1 = escolhaSwitch(sc); // Chama método para subopções (cadastrar, excluir, editar)
                    if (escolha1 == 1) { // Opção de cadastrar roupa

                        System.out.print("Código do produto: ");
                        String codigo = sc.nextLine();
                        System.out.print("Tipo de roupa: ");
                        String nome = sc.nextLine();
                        System.out.println("Qual o preço?");
                        double preco = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Qual o tamanho da roupa?");
                        String tamanho = sc.nextLine();
                        System.out.println("Qual o material da roupa? (algodão, viscose, etc)");
                        String material = sc.nextLine();
                        roupas.add(new Roupa(codigo, nome, preco, tamanho, material)); // Adiciona nova roupa à lista
                        System.out.println("Roupa cadastrada com sucesso!");

                    } else if (escolha1 == 2) { // Opção de excluir roupa
                        exibirListaRoupas(roupas); // Exibe lista de roupas disponíveis
                        System.out.println("Qual roupa excluir? (Digite o índice: 0, 1, 2...)");
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice >= 0 && indice < roupas.size()) { // Verifica se o índice é válido
                            roupas.remove(indice); // Remove a roupa da lista
                            System.out.println("Roupa excluída com sucesso!");
                        } else { // Caso índice seja inválido
                            System.out.println("Índice inválido!");
                        }
                    } else if (escolha1 == 3) { // Opção de editar roupa
                        exibirListaRoupas(roupas); // Exibe lista de roupas disponíveis
                        System.out.println("Qual roupa editar? (Digite o índice: 0, 1, 2...)"); // Solicita índice
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice >= 0 && indice < roupas.size()) { // Verifica se o índice é válido
                            System.out.print("Novo código: ");
                            String codigo = sc.nextLine();
                            System.out.print("Novo nome: ");
                            String nome = sc.nextLine();
                            System.out.println("Novo preço:");
                            double preco = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Novo tamanho:");
                            String tamanho = sc.nextLine();
                            System.out.println("Novo material:");
                            String material = sc.nextLine();
                            roupas.set(indice, new Roupa(codigo, nome, preco, tamanho, material)); // Atualiza a roupa na lista
                            System.out.println("Roupa editada com sucesso!");
                        } else { // Caso índice seja inválido
                            System.out.println("Índice inválido!");
                        }
                    } else if (escolha1 == 4) { // Exibe lista de roupa
                        if (roupas.isEmpty()) { // Se a lista de roupas estiver vazia
                            System.out.println("A listá está vázia");
                        } else {
                            exibirListaRoupas(roupas); // Função para exibir a lista de roupas
                        }
                    }
                    break;

                case 2: // Caso Alimento
                    int escolha2 = escolhaSwitch(sc); // Chama método para subopções
                    if (escolha2 == 1) { // Opção de cadastrar alimento
                        System.out.print("Código do produto: ");
                        String codigo = sc.nextLine();
                        System.out.print("Nome do alimento: ");
                        String nome = sc.nextLine();
                        System.out.println("Qual o preço?");
                        double preco = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Data de validade: ");
                        String dataValidade = sc.nextLine();
                        System.out.println("Qual a categoria do alimento? (In natura, processado)");
                        String categoria = sc.nextLine();
                        alimentos.add(new Alimento(codigo, nome, preco, dataValidade, categoria)); // Adiciona novo alimento à lista
                        System.out.println("Alimento cadastrado com sucesso!");

                    } else if (escolha2 == 2) { // Opção de excluir alimento
                        exibirListaAlimentos(alimentos); // Exibe lista de alimentos disponíveis
                        System.out.println("Qual alimento excluir? (Digite o índice: 0, 1, 2...)"); // Solicita índice
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice >= 0 && indice < alimentos.size()) { // Verifica se o índice é válido
                            alimentos.remove(indice); // Remove o alimento da lista
                            System.out.println("Alimento excluído com sucesso!");
                        } else { // Caso índice seja inválido
                            System.out.println("Índice inválido!");
                        }
                    } else if (escolha2 == 3) { // Opção de editar alimento
                        exibirListaAlimentos(alimentos); // Exibe lista de alimentos disponíveis
                        System.out.println("Qual alimento editar? (Digite o índice: 0, 1, 2...)"); // Solicita índice
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice >= 0 && indice < alimentos.size()) { // Verifica se o índice é válido
                            System.out.print("Novo código: ");
                            String codigo = sc.nextLine();
                            System.out.print("Novo nome: ");
                            String nome = sc.nextLine();
                            System.out.println("Novo preço:");
                            double preco = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Nova data de validade:");
                            String dataValidade = sc.nextLine();
                            System.out.println("Nova categoria:");
                            String categoria = sc.nextLine();
                            alimentos.set(indice, new Alimento(codigo, nome, preco, dataValidade, categoria)); // Atualiza o alimento na lista
                            System.out.println("Alimento editado com sucesso!");
                        } else { // Caso índice seja inválido
                            System.out.println("Índice inválido!");
                        }
                    } else if (escolha2 == 4) { // Exibe lista de alimentos
                        if (alimentos.isEmpty()) { // Se a lista estiver vazia
                            System.out.println("A listá está vázia");
                        } else {
                            exibirListaAlimentos(alimentos); // Função para exibir a lista de alimentos
                        }
                    }
                    break;

                case 3: // Caso Eletrônico
                    int escolha3 = escolhaSwitch(sc); // Chama método para subopções
                    if (escolha3 == 1) { // Opção de cadastrar eletrônico
                        System.out.print("Código do produto: ");
                        String codigo = sc.nextLine();
                        System.out.print("Nome do eletrônico: ");
                        String nome = sc.nextLine();
                        System.out.println("Qual o preço?");
                        double preco = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Qual a marca?");
                        String marca = sc.nextLine();
                        System.out.println("Quantos meses de garantia?");
                        int garantiaMeses = sc.nextInt();
                        sc.nextLine();
                        eletronicos.add(new Eletronico(codigo, nome, preco, marca, garantiaMeses)); // Adiciona novo eletrônico à lista
                        System.out.println("Eletrônico cadastrado com sucesso!");
                        Eletronico.iniciarEletronico(eletronicos); // Exibe lista atualizada de eletrônicos
                    } else if (escolha3 == 2) { // Opção de excluir eletrônico
                        exibirListaEletronicos(eletronicos); // Exibe lista de eletrônicos disponíveis
                        System.out.println("Qual eletrônico excluir? (Digite o índice: 0, 1, 2...)"); // Solicita índice
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice >= 0 && indice < eletronicos.size()) { // Verifica se o índice é válido
                            eletronicos.remove(indice); // Remove o eletrônico da lista
                            System.out.println("Eletrônico excluído com sucesso!");
                        } else { // Caso índice seja inválido
                            System.out.println("Índice inválido!"); // Mensagem de erro
                        }
                    } else if (escolha3 == 3) { // Opção de editar eletrônico
                        exibirListaEletronicos(eletronicos); // Exibe lista de eletrônicos disponíveis
                        System.out.println("Qual eletrônico editar? (Digite o índice: 0, 1, 2...)"); // Solicita índice
                        int indice = sc.nextInt(); // Lê o índice
                        sc.nextLine(); // Limpar buffer
                        if (indice >= 0 && indice < eletronicos.size()) { // Verifica se o índice é válido
                            System.out.print("Novo código: ");
                            String codigo = sc.nextLine();
                            System.out.print("Novo nome: ");
                            String nome = sc.nextLine();
                            System.out.println("Novo preço:");
                            double preco = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Nova marca:");
                            String marca = sc.nextLine();
                            System.out.println("Nova garantia (meses):");
                            int garantiaMeses = sc.nextInt();
                            sc.nextLine();
                            eletronicos.set(indice, new Eletronico(codigo, nome, preco, marca, garantiaMeses)); // Atualiza o eletrônico na lista
                            System.out.println("Eletrônico editado com sucesso!");
                        } else { // Caso índice seja inválido
                            System.out.println("Índice inválido!");
                        }
                    } else if (escolha3 == 4) { // Exibe lista de eletronicos
                        if (eletronicos.isEmpty()) { // Se a lista estiver vazia
                            System.out.println("A listá está vázia");
                        } else {
                            exibirListaEletronicos(eletronicos); // Função para exibir a lista de alimentos
                        }
                    }

                    break;
                case 4: // Caso o usuário escolha "Sair"
                    System.out.println("Adios Muchacho"); // Tchau tchau prof
                    sc.close(); // Fecha o Scanner
                    return; // Encerra o programa
                default: // Caso a escolha seja inválida
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static int escolhaSwitch(Scanner sc) { // Método para exibir subopções e retornar escolha
        System.out.println("O que você deseja fazer com o produto?");
        System.out.println("(1) Cadastrar  (2) Excluir  (3) Editar  (4) Exibir Lista");
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao; // Retorna a escolha do usuário
    }

    private static void exibirListaRoupas(List<Roupa> roupas) { // Método para exibir lista de roupas
        System.out.println("\nLista de Roupas:");
        for (int i = 0; i < roupas.size(); i++) {
            System.out.println("Índice " + i + ":");
            roupas.get(i).exibirDetalhes(); // Exibe informações da roupa
            System.out.println();
        }
    }

    private static void exibirListaAlimentos(List<Alimento> alimentos) { // Método para exibir lista de alimentos
        System.out.println("\nLista de Alimentos:");
        for (int i = 0; i < alimentos.size(); i++) {
            System.out.println("Índice " + i + ":");
            alimentos.get(i).exibirDetalhes(); // Exibe informações do alimento
            System.out.println();
        }
    }

    private static void exibirListaEletronicos(List<Eletronico> eletronicos) { // Método para exibir lista de eletrônicos
        System.out.println("\nLista de Eletrônicos:");
        for (int i = 0; i < eletronicos.size(); i++) {
            System.out.println("Índice " + i + ":");
            eletronicos.get(i).exibirDetalhes(); // Exibe detalhes do eletronico
        }
    }
}