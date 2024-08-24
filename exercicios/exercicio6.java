import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe seu nome completo: ");
        String nomeCompleto = s.nextLine();
        String[] partes = nomeCompleto.split(" ");
        System.out.println("Nome: " + partes[0]);
        if (partes.length > 1) {
            System.out.println("Sobrenome(s):");
            for (int i = 1; i < partes.length; i++) {
                System.out.println(partes[i]);
            }
        } else {
            System.out.println("Sobrenome(s): Não informado");
        }
    }
}