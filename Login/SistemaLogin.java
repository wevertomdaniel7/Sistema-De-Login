import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuarioCadastrado = "";
        String senhaCadastrada = "";

        int opcao;

        do {

            System.out.println("\n===== SISTEMA DE LOGIN =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Fazer login");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n--- CADASTRO ---");

                    System.out.print("Digite um usuário: ");
                    usuarioCadastrado = scanner.nextLine();

                    System.out.print("Digite uma senha: ");
                    senhaCadastrada = scanner.nextLine();

                    System.out.println("Usuário cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\n--- LOGIN ---");

                    if (usuarioCadastrado.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                        break;
                    }

                    System.out.print("Usuário: ");
                    String usuario = scanner.nextLine();

                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    if (usuario.equals(usuarioCadastrado)
                            && senha.equals(senhaCadastrada)) {

                        System.out.println("\nLogin realizado com sucesso!");
                        System.out.println("Bem-vindo, " + usuario + "!");

                    } else {

                        System.out.println("\nUsuário ou senha incorretos.");
                    }

                    break;

                case 3:

                    System.out.println("\nSistema encerrado.");
                    break;

                default:

                    System.out.println("\nOpção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }
}