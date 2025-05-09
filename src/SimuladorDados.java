import java.util.Random;
import java.util.Scanner;

public class SimuladorDados {
private static final int FACES_DADO = 6; // Número de faces do dado
private static final Random random = new Random(); // Gerador de números aleatórios

// Método para simular o lançamento de um dado
public static int lancarDado() {
    // Gera um número entre 1 e 6 (inclusive)
    return random.nextInt(FACES_DADO) + 1;
}

// Método para realizar múltiplos lançamentos e calcular frequências
public static void simularLancamentos(int numLancamentos) {
    int[] frequencias = new int[FACES_DADO]; // Array para contar ocorrências de cada face

    // Realiza os lançamentos
    for (int i = 0; i < numLancamentos; i++) {
        int resultado = lancarDado();
        frequencias[resultado - 1]++; // Incrementa a contagem da face correspondente
    }

    // Exibe os resultados
    System.out.println("\nResultados dos " + numLancamentos + " lançamentos:");
    System.out.println("Face | Frequência | Frequência Relativa | Probabilidade Teórica");
    System.out.println("-----|------------|--------------------|---------------------");
    for (int i = 0; i < FACES_DADO; i++) {
        double frequenciaRelativa = (double) frequencias[i] / numLancamentos;
        System.out.printf("%4d | %10d | %18.4f | %19.4f%n", 
            (i + 1), frequencias[i], frequenciaRelativa, 1.0 / FACES_DADO);
    }
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int opcao;

    do {
        System.out.println("\n=== Simulador de Lançamento de Dados ===");
        System.out.println("1. Lançar um dado");
        System.out.println("2. Simular múltiplos lançamentos");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                int resultado = lancarDado();
                System.out.println("Resultado do lançamento: " + resultado);
                break;
            case 2:
                System.out.print("Digite o número de lançamentos: ");
                int numLancamentos = scanner.nextInt();
                if (numLancamentos > 0) {
                    simularLancamentos(numLancamentos);
                } else {
                    System.out.println("Número de lançamentos deve ser maior que zero!");
                }
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcao != 3);

    scanner.close();
}
}

