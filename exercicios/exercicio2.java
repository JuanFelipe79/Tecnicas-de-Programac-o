import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = s.nextInt();
        
        if (num1 % 2 == 0) {
            System.out.println("O numero é par");
        }
        else {
            System.out.println("O numero é impar");
        }
    }
}
