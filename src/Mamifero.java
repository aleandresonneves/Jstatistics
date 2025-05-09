public class Mamifero {
    //atributos
    private int id;
    private String nomeCientifico;

    public int getId(){
        return this.id;
    }
    public void setnomeCientifico(String nomeCientifico){ //void pois atribui
        this.nomeCientifico = nomeCientifico;
    }
    public String getnomeCientifico(){ //String está retornando o nomeCientifico.
        return this.nomeCientifico;
    }
}
