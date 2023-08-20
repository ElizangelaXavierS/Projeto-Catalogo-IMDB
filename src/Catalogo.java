import java.util.ArrayList;

public class Catalogo {
        private static ArrayList<Ator> catalogoAtores = new ArrayList<>();

        private static ArrayList<Diretor> catalogoDiretores = new ArrayList<>();

        private static ArrayList<Filme> catalogoFilmes = new ArrayList<>();


        public static void cadastrarAtor (String nome, String sobrenome, int idade)
        {
            if (buscarAtor(nome, sobrenome) == null) {

                Ator novoAtor = new Ator(nome, sobrenome, idade);
                catalogoAtores.add(novoAtor);

                System.out.println();
                System.out.println("Novo ator cadastrado com sucesso!");
                System.out.println();

            } else {

                System.out.println("Não foi possível realizar o cadastro, ator já cadastrado no sistema!");
            }

        }

        public static Ator buscarAtor (String nome, String sobrenome)
        {
            for (Ator ator : catalogoAtores)
            {
                if(ator.getNome().equals(nome) && ator.getSobrenome().equals(sobrenome))
                    return ator;
            }

            return null;
        }


        public static void cadastrarDiretor (String nome, String sobrenome, int idade) {

            if (buscarDiretor(nome, sobrenome) == null)
            {
                Diretor novoDiretor = new Diretor(nome, sobrenome, idade);
                catalogoDiretores.add(novoDiretor);

                System.out.println();
                System.out.println("Diretor cadastrado com sucesso! ");
                System.out.println();

            } else {

                System.out.println("Não foi possível realizar o cadastro, diretor já cadastrado no sistema!");
            }

        }

        public static Diretor buscarDiretor (String nome, String sobrenome) {

            for (Diretor diretor : catalogoDiretores)
            {
                if (diretor.getNome().equals(nome) && diretor.getSobrenome().equals(sobrenome))
                    return diretor;
            }
            return null;

        }
        public static void cadastrarFilme (String nome, String dataDeLancamento, double orcamento, String descricao) {

            if (buscarFilme(nome) == null)
            {
                Filme novoFilme = new Filme(nome, dataDeLancamento, orcamento, descricao);
                catalogoFilmes.add(novoFilme);

                System.out.println();
                System.out.println("O filme " + nome + " foi cadastrado com sucesso!");
                System.out.println();

            } else {

                System.out.println("Não foi possível cadastrar o filme no sistema, filme já cadastrado!");
            }

        }

        public static Filme buscarFilme (String nome) {

            for (Filme filme : catalogoFilmes)
            {
                if (filme.getNome().equalsIgnoreCase(nome))
                    return filme;
            }

            return null;
        }

        public static void exibirFilmes() {
            for (Filme filme : catalogoFilmes) {
                System.out.println(filme);
            }
        }
        public void associarFilmeComAtorEDiretor(Filme filme, Diretor diretor)
        {
            filme.setDiretor(diretor);
            for (Ator ator : catalogoAtores) {
                filme.adicionarAtor(ator);
            }
        }
    }

