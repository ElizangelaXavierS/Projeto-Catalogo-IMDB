public class Ator extends Pessoa {

    private int filmesTrabalhados;

    public Ator() {
    }

    public Ator(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }

    public int getFilmesTrabalhados() {
        return filmesTrabalhados;
    }

    public void setFilmesTrabalhados(int filmesTrabalhados) {
        this.filmesTrabalhados = filmesTrabalhados;
    }



    @Override
    public String toString() {
        return super.toString() + "Ator{" +
                "filmesTrabalhados=" + filmesTrabalhados +
                ", idade=" + idade +
                '}';
    }
}


