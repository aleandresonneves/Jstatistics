import javax.swing.JOptionPane; // classe importada para fazer a interface gráfica.
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Alô Git!"); linha desconsiderada para executar esse arquivo.
        //if = representa se.
        //if else
        //switch
        //ternário ? :
        
        int opc= Integer.parseInt(JOptionPane.showInputDialog("Qual é o resultado de uma população? \n 1- Parâmetro \n 2- Estatística"));
        if(opc == 1){
            JOptionPane.showMessageDialog(null, 
            "Certa resposta!");
        }else{
            JOptionPane.showMessageDialog(null, "Resposta errada!","JStatistics",JOptionPane.ERROR_MESSAGE);
        }
        
 git 
        //Exercícios: (para cada pergunta crie um if) 
        /*Considerando os números 30,50,80,90 Digite o valor da média aritmética simples?*/
        //gabarito 62,5
        /*Considerando os valores 10, 40, 50, 80, 10 qual é a moda?*/
        //moda 10
        /*Qual a medida de tendencia central que mostra o centro da amostra? R:mediana*/
        int op= Integer.parseInt(JOptionPane.showInputDialog(null, "Considerando os números 30,50,80,90. Digite o valor da média aritmética simples? \n 1- 62,5 \n 2- 65 \n 3- 67"));
        if(op == 1){
            JOptionPane.showMessageDialog(null,"Certa resposta!");
        }else{
            JOptionPane.showMessageDialog(null, "Resposta errada!", "JStatistics",JOptionPane.ERROR_MESSAGE);
        }
        
        int op1= Integer.parseInt(JOptionPane.showInputDialog(null, "Considerando os valores 10,40,50,80,10. \n Qual é a moda? \n 1- 40 \n 2- 10 \n 3- 80 \n 4- 50"));
        if (op1 == 2) {
            JOptionPane.showMessageDialog(null,"Certa Resposta!");
        }else{
            JOptionPane.showMessageDialog(null, "Resposta errada!");
        }
        int op2= Integer.parseInt(JOptionPane.showInputDialog(null,"Qual é a medida de tendência central que mostra o centro da amostra? \n 1- Moda \n 2- Média \n 3- Mediana"));
        if (op2 == 3) {
            JOptionPane.showMessageDialog(null,"Certa resposta!");
        }else{
            JOptionPane.showMessageDialog(null,"Resposta errada!");
        }
    
            
        
    }
}
