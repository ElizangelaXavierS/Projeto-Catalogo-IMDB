public class Diretor extends Pessoa implements ExibirDados{

    private int quantidadeDeFilmesDirigitos;

    public Diretor() {

    }

    public Diretor(String nome, String sobrenome, int idade, int quantidadeDeFilmesDirigitos) {
        super(nome, sobrenome, idade);
        this.quantidadeDeFilmesDirigitos = quantidadeDeFilmesDirigitos;
    }

    public int getQuantidadeDeFilmesDirigitos() {
        return quantidadeDeFilmesDirigitos;
    }

    public void setQuantidadeDeFilmesDirigitos(int quantidadeDeFilmesDirigitos) {
        this.quantidadeDeFilmesDirigitos = quantidadeDeFilmesDirigitos;
    }


    @Override
    public String toString() {
        return "Diretor - " +
                " Nome: " + nome +
                ", Sobrenome: " + sobrenome +
                ", Idade: " + idade +
                "Quantidade de filmes dirigidos: " + quantidadeDeFilmesDirigitos
                ;
    }

    @Override
    public void exibir() {
        System.out.println("Diretor - " +
                " Nome: " + nome +
                ", Sobrenome: " + sobrenome +
                ", Idade: " + idade +
                "Quantidade de filmes dirigidos: " + quantidadeDeFilmesDirigitos
        );
    }
}
