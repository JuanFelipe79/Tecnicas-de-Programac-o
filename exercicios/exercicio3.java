import java.util.Scanner;
import java.util.InputMismatchException;

class exercicio3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        try {
            int num = s.nextInt();
            if(num > 0) System.out.println("Positivo");
            else System.out.println("Negativo");
        } catch(InputMismatchException e) {
            System.out.println("Digite um número!");
        } finally {
            System.out.println("Fim");
        }
    }
}