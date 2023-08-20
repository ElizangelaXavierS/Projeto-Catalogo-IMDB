public class Diretor extends Pessoa {

    private int quantidadeDeFilmesDirigidos;


    public Diretor (String nome, String sobrenome, int idade)
    {
        this(nome, sobrenome, idade, 0);
    }

    public Diretor(String nome, String sobrenome, int idade, int quantidadeDeFilmesDirigidos)
    {
        super(nome, sobrenome, idade);
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }

    public int getQuantidadeDeFilmesDirigidos()
    {
        return quantidadeDeFilmesDirigidos;
    }

    public void setQuantidadeDeFilmesDirigidos(int quantidadeDeFilmesDirigidos)
    {
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }


    @Override
    public String toString() {
        return super.toString() + "Quantidade de filmes dirigidos: " + quantidadeDeFilmesDirigidos;

    }
}
