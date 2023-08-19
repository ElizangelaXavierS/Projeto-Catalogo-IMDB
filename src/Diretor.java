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

    public int getQuantidadeDeFilmesDirigitos()
    {
        return quantidadeDeFilmesDirigidos;
    }

    public void setQuantidadeDeFilmesDirigitos(int quantidadeDeFilmesDirigidos)
    {
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }


    @Override
    public String toString() {
        return "Diretor - " +
                " Nome: " + nome +
                ", Sobrenome: " + sobrenome +
                ", Idade: " + idade +
                "Quantidade de filmes dirigidos: " + quantidadeDeFilmesDirigidos
                ;
    }
}
