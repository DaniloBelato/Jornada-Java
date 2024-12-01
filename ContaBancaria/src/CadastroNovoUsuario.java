import java.util.Random;
import java.util.Scanner;

public class CadastroNovoUsuario {
    public static void main(String[] args) {

        Double deposito = 0.0;

        Random random = new Random();
        int idUsuario = random.nextInt(201) + 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        System.out.println("Digite sua agencia : ");
        String agencia = scanner.nextLine();

        System.out.println("Deseja fazer um deposito ? (s/n) : ");
                if (scanner.nextLine().equalsIgnoreCase("s")) {
                    System.out.println("Digite o valor do deposito : ");
                     deposito = scanner.nextDouble();
                    System.out.println("Deposito realizado com sucesso ! ");
                } else {
                    System.out.println("Deposito nao realizado ! ");
                }

        // You might want to add a confirmation message
        System.out.println("\nUsuário cadastrado com sucesso!");
        System.out.println("ID do Usuário: " + idUsuario);
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Email: " + email);
        System.out.println("agencia: " + agencia);
        System.out.println("Saldo atual : " + deposito);
        scanner.close();
    }
}
