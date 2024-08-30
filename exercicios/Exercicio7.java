import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 999.999.999: ");
        try {
                int numero = s.nextInt();
                int unidades = numero % 10;
                int dezenas = (numero / 10) % 10;
                int centenas = (numero / 100) % 10;
                
                int u_Milhares = (numero / 1000) % 10;
                int d_Milhares = (numero / 10000) % 10;
                int c_Milhares = (numero / 100000) % 10;

                int u_Milhoes = (numero / 1000000) % 10;
                int d_Milhoes = (numero / 10000000) % 10;
                int c_Milhoes = (numero / 100000000) % 10;
                
                System.out.println("Número digitado: " + numero);
                if (c_Milhoes > 0){
                    System.out.println("Centena de milhão: " + c_Milhoes);
                }
                if (d_Milhoes > 0) {
                    System.out.println("Dezena de milhão: " + d_Milhoes);
                }
                if (u_Milhoes >0) {
                    System.out.println("Unidade de milhão: " + u_Milhoes);
                }
                if (c_Milhares > 0) {
                    System.out.println("Centena de milhar: " + c_Milhares);
                }
                if (d_Milhares > 0) {
                    System.out.println("Dezena de milhar: " + d_Milhares);
                }
                if (u_Milhares > 0) {
                    System.out.println("Unidade de milhar: " + u_Milhares);
                }
                if (centenas > 0){
                    System.out.println("Centena: " + centenas);
                }
                if (dezenas > 0) {
                    System.out.println("Dezena: " + dezenas);
                }
                if (unidades > 0) {
                    System.out.println("Unidade: " + unidades);
                }
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro válido.");
        }
    }
}
