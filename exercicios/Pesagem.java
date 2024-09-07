import java.util.Scanner;
class Pesagem
{
    public static void main(String arg[]) {
        Scanner t = new Scanner(System.in);
        Pessoas pessoa1 = new Pessoas();
        Pessoas pessoa2 = new Pessoas();
        System.out.println("Qual o seu nome? ");
        String n = t.nextLine();
        pessoa1.seta_nome(n);
        System.out.println("Qual sua idade? ");
        int i = t.nextInt();
        pessoa1.seta_idade(i);
        System.out.println("Qual o seu peso? ");
        float p = t.nextFloat();
        pessoa1.seta_peso(p);
        System.out.println("Qual a sua altura? ");
        double a = t.nextDouble();
        pessoa1.seta_altura(a);
        System.out.println("Nome: " + pessoa1.nome + ", idade: " + pessoa1.idade + ", peso: " + pessoa1.peso + ", altura: " + pessoa1.altura + ", e seu IMC: "+ pessoa1.retorna_imc());
        System.out.println("");
        System.out.println("      Tabela de IMC    ");
        System.out.println("Cálculo IMC | Situação");
        System.out.println("-----------------------");
        System.out.println("Abaixo de 18,5  | Você está abaixo do peso ideal");
        System.out.println("Entre 18,5 e 24,9 | Parabéns — você está em seu peso normal!");
        System.out.println("Entre 25,0 e 29,9 | Você está acima de seu peso (sobrepeso)");
        System.out.println("Entre 30,0 e 34,9 | Obesidade grau I");
        System.out.println("Entre 35,0 e 39,9 | Obesidade grau II");
        System.out.println("40,0 e acima     | Obesidade grau III");
    }
}