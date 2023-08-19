import java.util.ArrayList;

public class Cadastro {
    public static ArrayList<Ator> atores = new ArrayList<>();

    public static ArrayList<Diretor> diretores = new ArrayList<>();

    public static ArrayList<Filme> filmes = new ArrayList<>();

    public static void adicionarAtores(Ator ator) {
        atores.add(ator);
    }

    public static void exibirAtores() {
        for (Ator ator : atores) {
            System.out.println(ator.toString());
        }
    }

    public static void adicionarDiretores(Diretor diretor) {
        diretores.add(diretor);
    }

    public static void exibirDiretores() {
        for (Diretor diretor : diretores) {
            System.out.println(diretor.toString());
        }
    }

    public static void adicionarFilmes(Filme filme) {
        filmes.add(filme);
    }

    public static void exibirFilmes() {
        for (Filme filme : filmes) {
            System.out.println(filme.toString());
        }
    }

}


