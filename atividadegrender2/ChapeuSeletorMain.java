import java.util.Locale;
import java.util.Scanner;

public class ChapeuSeletorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String continuar;

        do {
            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Coragem: ");
            double coragem = scanner.nextDouble();

            System.out.print("Inteligencia: ");
            double inteligencia = scanner.nextDouble();

            System.out.print("Ambicao: ");
            double ambicao = scanner.nextDouble();

            System.out.print("Lealdade: ");
            double lealdade = scanner.nextDouble();

            System.out.print("Estrategia: ");
            double estrategia = scanner.nextDouble();

            System.out.print("Criatividade: ");
            double criatividade = scanner.nextDouble();
            scanner.nextLine(); // consome a quebra de linha pendente

            Aluno aluno = new Aluno(
                    nome, idade, coragem, inteligencia,
                    ambicao, lealdade, estrategia, criatividade);

            aluno.calcularCasa();
            aluno.exibirInformacoes();

            System.out.print("Deseja classificar outro aluno? (s/n): ");
            continuar = scanner.nextLine().trim().toLowerCase();
            System.out.println();
        } while (continuar.equals("s") || continuar.equals("sim"));

        System.out.println("Selecao encerrada. Ate a proxima!");
        scanner.close();
    }
}