public class Diretor extends Pessoa {

    private int filmesDirigidos;

    public Diretor() {

    }

    public Diretor(String nome, String sobrenome, int idade, int filmesDirigidos) {
        super(nome, sobrenome, idade);
        this.filmesDirigidos = filmesDirigidos;
    }

    public int getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void setFilmesDirigidos(int filmesDirigidos) {
        this.filmesDirigidos = filmesDirigidos;
    }

    public void cadastrarDiretores(){

    }

}
