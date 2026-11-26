import java.util.Locale;
import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Altura (em metros, ex.: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Peso (em kg, ex.: 70.5): ");
        double peso = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
        double imcCalculado = pessoa.CalculaIMC();
        String faixa = pessoa.InformaObesidade();

        System.out.printf("%n%s %s (%d anos)%n", pessoa.getNome(), pessoa.getSobrenome(), pessoa.getIdade());
        System.out.printf("IMC: %.2f%n", imcCalculado);
        System.out.println("Faixa de massa corporal: " + faixa);

        scanner.close();
    }
}