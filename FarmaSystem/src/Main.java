import Model.*;
import Service.*;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static ClienteService clienteService = new ClienteService();
    static FornecedorService fornecedorService = new FornecedorService();
    static FuncionarioService funcionarioService = new FuncionarioService();
    static UsuarioService usuarioService = new UsuarioService();
    static VendaService vendaService = new VendaService();
    static MedicamentosService medicamentoService = new MedicamentosService();

    public static void main(String[] args) {

        usuarioService.cadastrar(new Usuario("admin", "123", "ADMIN"));

        boolean loginSucesso = realizarLogin();

        if (!loginSucesso) {
            System.out.println("Encerrando sistema...");
            return;
        }

        int opcao;

        do {
            System.out.println("\n FARMSYSTEM");
            System.out.println("1 - Cliente");
            System.out.println("2 - Fornecedor");
            System.out.println("3 - Funcionário");
            System.out.println("4 - Usuário");
            System.out.println("5 - Venda");
            System.out.println("6 - Medicamento");
            System.out.println("7 - Relatórios");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> menuCliente();
                case 2 -> menuFornecedor();
                case 3 -> menuFuncionario();
                case 4 -> menuUsuario();
                case 5 -> menuVenda();
                case 6 -> menuMedicamento();
                case 7 -> menuRelatorios();
                case 0 -> System.out.println("Sistema encerrado.");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    public static void menuRelatorios() {
        int op;

        do {
            System.out.println("\n RELATÓRIOS ");
            System.out.println("1 - Estoque");
            System.out.println("2 - Vendas");
            System.out.println("3 - Produtos vencidos");
            System.out.println("4 - Lucro mensal");
            System.out.println("0 - Voltar");

            op = scanner.nextInt();

            switch (op) {
                case 1 -> medicamentoService.relatorioEstoque();
                case 2 -> vendaService.relatorioVendas();
                case 3 -> medicamentoService.produtosVencidos();
                case 4 -> vendaService.lucroMensal();
            }

        } while (op != 0);
    }

    public static boolean realizarLogin() {
        System.out.println(" LOGIN ");

        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (usuarioService.login(login, senha)) {
            System.out.println("Login realizado com sucesso!");
            return true;
        }

        System.out.println("Login inválido.");
        return false;
    }

    // ================= CLIENTE =================
    public static void menuCliente() {
        int op;
        do {
            System.out.println("\n CLIENTE ");
            System.out.println("1-Cadastrar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    clienteService.cadastrar(new Cliente(id, nome, cpf));
                }
                case 2 -> clienteService.listar();
                case 3 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Novo CPF: ");
                    String cpf = scanner.nextLine();

                    clienteService.atualizar(id, nome, cpf);
                }
                case 4 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    clienteService.excluir(id);
                }
            }
        } while (op != 0);
    }

    public static void menuFornecedor() {
        int op;
        do {
            System.out.println("\n FORNECEDOR ");
            System.out.println("1-Cadastrar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();

                    fornecedorService.cadastrar(new Fornecedor(id, nome, cnpj));
                }
                case 2 -> fornecedorService.listar();
                case 3 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Novo CNPJ: ");
                    String cnpj = scanner.nextLine();

                    fornecedorService.atualizar(id, nome, cnpj);
                }
                case 4 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    fornecedorService.excluir(id);
                }
            }
        } while (op != 0);
    }


    public static void menuFuncionario() {
        int op;
        do {
            System.out.println("\n FUNCIONÁRIO ");
            System.out.println("1-Cadastrar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();

                    funcionarioService.cadastrar(new Funcionario(id, nome, cargo));
                }
                case 2 -> funcionarioService.listar();
                case 3 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Novo cargo: ");
                    String cargo = scanner.nextLine();

                    funcionarioService.atualizar(id, nome, cargo);
                }
                case 4 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    funcionarioService.excluir(id);
                }
            }
        } while (op != 0);
    }

    public static void menuUsuario() {
        int op;
        do {
            System.out.println("\n USUÁRIO ");
            System.out.println("1-Cadastrar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    System.out.print("Nível: ");
                    String nivel = scanner.nextLine();

                    usuarioService.cadastrar(new Usuario(login, senha, nivel));
                }
                case 2 -> usuarioService.listar();
                case 3 -> {
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    System.out.print("Nova senha: ");
                    String senha = scanner.nextLine();
                    System.out.print("Novo nível: ");
                    String nivel = scanner.nextLine();

                    usuarioService.atualizar(login, senha, nivel);
                }
                case 4 -> {
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    usuarioService.excluir(login);
                }
            }
        } while (op != 0);
    }


    public static void menuVenda() {
        int op;
        do {
            System.out.println("\n VENDA ");
            System.out.println("1-Cadastrar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Produto: ");
                    String produto = scanner.nextLine();
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();

                    vendaService.cadastrar(new Venda(id, produto, valor));
                }
                case 2 -> vendaService.listar();
                case 3 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo produto: ");
                    String produto = scanner.nextLine();
                    System.out.print("Novo valor: ");
                    double valor = scanner.nextDouble();

                    vendaService.atualizar(id, produto, valor);
                }
                case 4 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    vendaService.excluir(id);
                }
            }
        } while (op != 0);
    }


    public static void menuMedicamento() {
        int op;
        do {
            System.out.println("\n- MEDICAMENTO ");
            System.out.println("1-Cadastrar 2-Listar 3-Excluir 0-Voltar");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Validade: ");
                    String validade = scanner.nextLine();

                    medicamentoService.cadastrar(
                            new Medicamento(id, nome, preco, quantidade, validade)
                    );
                }
                case 2 -> medicamentoService.listar();
                case 3 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    medicamentoService.excluir(id);
                }
            }
        } while (op != 0);
    }
}