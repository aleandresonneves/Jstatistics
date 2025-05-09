import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // classe é um conjunto de objetos
        //Nosso objetivo nesse código é entender a diferença entre método com tipo voi e método com tipo String.
        Mamifero m1 = new Mamifero();
        m1.setnomeCientifico("Bos Taurus");
        JOptionPane.showMessageDialog(null, "Nome Científico: "+m1.getnomeCientifico());
        //Exercício
        /*
         * Considerando a utilizqação de metodos set e get 
         * considerando a aula de hoje
         * anatomia de função e procedimento
         * set - void (procedimento)
         * get - String (função)
         * java = métodos
         * void
         * String, int, boolean
         * 
         * desafio: crie dois objetos para armazenar e mostrar os dados do peixe boi e canguru
        */
        Mamifero m2 = new Mamifero();
        m2.setnomeCientifico("Trichechus");
        JOptionPane.showMessageDialog(null, "Nome Científico:"+m2.getnomeCientifico());

        Mamifero m3 = new Mamifero();
        m3.setnomeCientifico("Macropus rufus");
        JOptionPane.showMessageDialog(null, "Nome Científico:"+m3.getnomeCientifico());
    }
}
