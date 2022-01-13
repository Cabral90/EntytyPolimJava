package base.entidades;


public class Pessoal {
    
    private String nome;
    private String apelido;
    private String edade;

    public Pessoal() {
    }

    public Pessoal(String nome, String apelido, String edade) {
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }

    public String getNome() {
      //  System.out.println("AQUIII NON");
       // System.out.println("Nombre: "+nome);
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEdade() {
        return edade;
    }

    public void setEdade(String edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        //return "Pessoal{" + "nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + '}';
        
       return String.format("%s%s%n%s%s%n%s%s%n", "Nome: ", getNome(), "Apelido: ", getApelido(), "Idade: ", getEdade());
    }
    
    

}
