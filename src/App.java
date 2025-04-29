import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\tJEstatistics"); // println quebra linha
        //print não quebra a linha.
        //aplicando lógica de programação (Aristóteles e George Boolean)
        Scanner leia = new Scanner(System.in);   
        //variável: é um espaço reservado na mamória do computador.
        //
        //Variável: serve para guardar valores e seu tipo pode ser (Texto, número, lógica...)
        // Ex-1: Crie um algoritmo para o Jstatistics que leia a opção desejada: "Qual o conjunto de dados utilizado: 1- populacional 2- amostral"
        // O valor recebido deve ser um valor inteiro.
        // Que tipo de variável ele deseja mostrar:
        // 1- Quantitativa 2- Qualitativa
        // O menu deve ter as quebras de linhas conforme o texto acima tudo deve ser feita em apenas uma linha System.out.prinln()
        //Mostre a opçao escolhidas (numero lido)
        // use "\n" para quebrar a linha.
        int opcao; //declarei a variável em java.
        JOptionPane.showMessageDialog(null, "O jogo da Estatísticas: JStatistics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o jogo? \n Escolha a estratégia: \n 1- Populacional \n 2- Amostral"));
        //JOptionPane.showInputDialog esse código serve para abrir uma caixa de texto na aba Windows. O JOptionPane é string.
        // "null" centraliza na tela
        JOptionPane.showMessageDialog(null, "Você escolheu:"+opcao, "JStatistics",JOptionPane.DEFAULT_OPTION);
        System.out.println("\t# \t# \t JStatistics \t # \t# \t");
        System.out.println("Qual o conjunto de dados utilizado: \n 1- populacional \n 2- amostral");
        opcao = leia.nextInt();

        String opcaoVariavel = JOptionPane.showInputDialog("Que tipo de variável você deseja cadastrar: \n 1- Quantitativa \n 2- Qualitativa ");
        int opVariavel = Integer.parseInt(opcaoVariavel);
        JOptionPane.showMessageDialog(null,"Sua escolha foi:"+opVariavel);
        System.out.println(opcao);
        //Integer (wrappers)
        
        
    }
}
