import java.util.ArrayList;
import java.util.Arrays;

public class CatalogoDeFilmes {

    private ArrayList<Ator> atores = new ArrayList<>();

    private ArrayList<Diretor> diretores = new ArrayList<>();

    private ArrayList<Filme> filmes = new ArrayList<>();

    public void cadastrarAtor(Ator ator) {
        atores.add(ator);
    }

   public void exibirAtore() {
        for (Ator ator : atores) {
            System.out.println(ator.toString());
        }
    }

    public void cadastrarDiretore(Diretor diretor) {
        diretores.add(diretor);
    }

    public void exibirDiretore() {
        for (Diretor diretor : diretores) {
            System.out.println(diretor.toString());
        }
    }

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void exibirFilmes() {
        for (Filme filme : filmes) {
            System.out.println(filmes);
        }
    }

    public void associarFilmeComAtorEDiretor(Filme filme, Diretor diretor, ArrayList<Ator> atores){
        filme.setDiretor(diretor);
        for(Ator ator : atores){
            filme.adicionarAtor(ator);
        }
    }

    @Override
    public String toString() {
        return "CatalogoDeFilmes{" +
                "atores=" + atores +
                ", diretores=" + diretores +
                ", filmes=" + filmes +
                '}';
    }
}


