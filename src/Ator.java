public class Ator extends Pessoa implements ExibirDados{

    private int quantidadeDeFilmesTrabalhados;

    public Ator() {
    }

    public Ator(String nome, String sobrenome, int idade, int quantidadeDeFilmesTrabalhados) {
        super(nome, sobrenome, idade);
        this.quantidadeDeFilmesTrabalhados = quantidadeDeFilmesTrabalhados;
    }

    public int getQuantidadeDeFilmesTrabalhados() {
        return quantidadeDeFilmesTrabalhados;
    }

    public void setQuantidadeDeFilmesTrabalhados(int quantidadeDeFilmesTrabalhados) {
        this.quantidadeDeFilmesTrabalhados = quantidadeDeFilmesTrabalhados;
    }

    @Override
    public String toString() {
        return "Ator - " +
                " Nome: " + nome +
                ", Sobrenome:" + sobrenome +
                ", Idade: " + idade +
                ", Quantidade De Filmes Trabalhados:" + quantidadeDeFilmesTrabalhados
                ;
    }

    @Override
    public void exibir() {
        System.out.println( "Ator - " +
                " Nome: " + nome +
                ", Sobrenome:" + sobrenome +
                ", Idade: " + idade +
                ", Quantidade De Filmes Trabalhados:" + quantidadeDeFilmesTrabalhados
        );
    }
}



