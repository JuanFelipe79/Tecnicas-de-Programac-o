import java.util.Scanner;

public class exercicio2_2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = s.nextInt();
        switch(num % 2) {
            case 0: System.out.println(num + "é par!"); break;
            default: System.out.println(num + "é ímpar!");
        }
    }
}
