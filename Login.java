import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        int tentativas = 3;
        boolean acesso = false;

        while (tentativas > 0) {

            System.out.println("=== SISTEMA DE LOGIN ===");

            System.out.print("Digite o usuário: ");
            String usuario = input.nextLine();

            System.out.print("Digite a senha: ");
            String senha = input.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login realizado com sucesso!");
                acesso = true;
                break;
            } else {
                tentativas--;
                System.out.println("Usuário ou senha incorretos!");
                System.out.println("Tentativas restantes: " + tentativas);
            }
        }

        if (!acesso) {
            System.out.println("Acesso bloqueado!");
        }
    }
}