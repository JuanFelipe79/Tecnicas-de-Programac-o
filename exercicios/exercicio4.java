import java.util.Scanner;
public class exercicio4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o raio da circunferência: ");
        double raio = s.nextDouble();
        double diametro = 2 * raio;
        double perimetro = 2 * Math.PI * raio;
        System.out.println("Diâmetro: " + diametro);
        System.out.println("Perímetro: " + perimetro);
    }
}
