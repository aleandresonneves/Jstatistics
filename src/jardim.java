
import javax.swing.JOptionPane;

public class jardim {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Alô, Jardim!");
        
        String nomeCliente = JOptionPane.showInputDialog(null, "Digite seu nome:");
            if(nomeCliente == null){
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário");
                return;
            }
        String enderecoCliente = JOptionPane.showInputDialog(null, "Digite o seu endereço:");
            if(enderecoCliente == null){
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
                return;
            }
        JOptionPane.showMessageDialog(null,"Dados do cliente:\nNome:" + nomeCliente + "\nEndereço:" + enderecoCliente);

    }
    
}

