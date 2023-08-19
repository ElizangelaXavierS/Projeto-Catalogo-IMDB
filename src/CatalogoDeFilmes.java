import java.util.ArrayList;
import java.util.Arrays;

public class CatalogoDeFilmes {

    private ArrayList<Ator> atores = new ArrayList<>();

    private ArrayList<Diretor> diretores = new ArrayList<>();

    private ArrayList<Filme> filmes = new ArrayList<>();

    public void cadastrarAtor(Ator ator) {
        atores.add(ator);
        System.out.println("Ator cadastrado com sucesso!");
    }

   public void exibirAtore() {
        for (Ator ator : atores) {
            System.out.println(ator.toString());
        }
    }

    public void cadastrarDiretor(Diretor diretor) {
        diretores.add(diretor);
        System.out.println("Diretor cadastrado com sucesso! ");
    }

    public void exibirDiretore() {
        for (Diretor diretor : diretores) {
            System.out.println(diretor.toString());
        }
    }

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso! ");
    }

    public void exibirFilmes() {
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }

    public void associarFilmeComAtorEDiretor(Filme filme, Diretor diretor, ArrayList<Ator> atores){
        filme.setDiretor(diretor);
        for(Ator ator : atores){
            filme.adicionarAtor(ator);
        }
    }

    public Filme pesquisarFilmePorNome(String nome){
        for(Filme filme : filmes){
            if (filme.getNome().equalsIgnoreCase(nome)){
                return filme;
            }
        }
    return null;

    }
}


