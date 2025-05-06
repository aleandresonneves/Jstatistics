import javax.swing.*;

public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3- Switch e Loops");
        //O switch é uma estrutura de seleção multipla
        //Um if mais organizado
        //Escolha 
          //caso
        //Para resolver listats ou constantes.
        //Ex: menu - opção1; opção2;...
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1-Estatística Descritiva \n 2-Probabilidade \n 3-Modelos probabilísticos \n 4-Sair"));
       // "!=" representa a diferença
        if(op != 4){
            switch(op){
                //estrutura do switch *switch(){}*
                case 1:JOptionPane.showMessageDialog(null,"Estatística Descritiva");break;
    
                case 2:JOptionPane.showMessageDialog(null,"Probabilidade");break;
    
                case 3:JOptionPane.showMessageDialog(null,"Modelos probabilísticos");break;
    
                default:
                JOptionPane.showMessageDialog(null,"Opção inválida!");break;
                 //while(){} faz o teste no inicio.
                 //do{}while() use no final.
            }
        }else{
            JOptionPane.showMessageDialog(null,"Encerrando sistema...");
        }
        
        switch(op){
            //estrutura do switch *switch(){}*
            case 1:JOptionPane.showMessageDialog(null,"Estatística Descritiva");break;

            case 2:JOptionPane.showMessageDialog(null,"Probabilidade");break;

            case 3:JOptionPane.showMessageDialog(null,"Modelos probabilísticos");break;

            default:
            JOptionPane.showMessageDialog(null,"Opção inválida!");break;
             //while(){} faz o teste no inicio.
             //do{}while() use no final.
        }
    } 
    //Como funciona os loops
    //while
    //for
    //do while
    /*
     * início = 1
     * condição <=5
     * incremento/decremento i=i+1
    */
    int contador =1;
    while(contador<5){
        JOptionPane.showMessageDialog(null,"Viva o SENAI!!!");
        contador = contador+1;
    }
    int i = 1;
    while(i<=5){
        System.out.println(i);
        i++;
    }
    for(int=1;cont<=10,cont++){
        System.out.println(contador);
    }
    do{
        //sair = System.out.println("Sair:s ou n");
        sair = JOptionPane.showMessageDialog("Digite s-sim e n-não");
    }while(!sair.equalsIgnoreCase("sim"));
    /*
     * crie um loop (do while) para deixar o menu com opções do usuário escolher uma nova opção ou sair, o usuário que vai decicidir a hora de sair.
    */
    while(){
        System.out.println("Escolha uma opção: \n 1- sair \n 2- Escolher uma nova opção.");
    }
}
