import java.util.ArrayList;

public class Cadastro {

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
            System.out.println(filme.toString());
        }
    }



}


