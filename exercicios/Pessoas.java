import java.util.Scanner;
class Pessoas {
    String nome;
    int idade;
    double peso;
    double altura;
    double imc;
    double retorna_imc(){
        return imc = peso/(altura*altura);
    }
    void seta_idade(int i) {
        idade = i;
    }
    double retorna_idade() {
        return idade;
    }
    void seta_peso(double p) {
        peso = p;
    }
    double retorna_peso() {
        return idade;
    }
    void seta_nome(String n) {
        nome = n;
    }
    String retorna_nome() {
        return nome;
    }
    void seta_altura(double a) {
        altura = a;
    }
    double retorna_altura() {
        return altura;
    }
}
