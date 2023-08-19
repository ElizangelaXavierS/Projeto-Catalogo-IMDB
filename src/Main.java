import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int opcao = 0;

        while (opcao != 7) {

            System.out.println("----------------------CATÁLOGO IMDB-----------------------");
            System.out.println("-                                                        -");
            System.out.println("-       Selecione uma das opções abaixo:                 -");
            System.out.println("-                                                        -");
            System.out.println("-       1 - Cadastrar filme                              -");
            System.out.println("-       2 - Listar filmes                                -");
            System.out.println("-       3 - Cadastrar ator                               -");
            System.out.println("-       4 - Cadastrar diretor                            -");
            System.out.println("-       5 - Associar filme com seus atores e diretores   -");
            System.out.println("-       6 - Pesquisar filme cadastrado                   -");
            System.out.println("-       7 - SAIR                                         -");
            System.out.println("-                                                        -");
            System.out.println("----------------------------------------------------------");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1 -> {

                    System.out.println("Qual o nome do filme? ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.println("Qual a data de lançamento do filme "  + nome + "?");
                    String dataDeLancamento = sc.nextLine();

                    System.out.println("Qual o orçamento deste filme? ");
                    double orcamento = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Qual a descrição do filme? ");
                    String descricao = sc.nextLine();

                    Catalogo.cadastrarFilme(nome, dataDeLancamento, orcamento, descricao);

                }
                case 2 -> {
                    Catalogo.exibirFilmes();
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.println("Digite o nome do ator: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o sobrenome do ator: ");
                    String sobrenome = sc.nextLine();

                    System.out.println("Digite a idade do ator: ");
                    int idade = sc.nextInt();

                    System.out.println("Digite a quantidade de filmes atuados por " + nome);
                    int quantidade = sc.nextInt();

                    Catalogo.cadastrarAtor(nome, sobrenome, idade);

                    System.out.println("Deseja associar o ator a um filme (S/N)? ATENÇÃO: O filme precisa estar cadastrado no sistema!");

                    sc.nextLine();
                    String associar = sc.nextLine();

                     if (associar.equalsIgnoreCase("S")) {

                         System.out.println("Qual o nome do filme que deseja associar?");

                         String nomeDoFilme = sc.nextLine();

                         Filme filme = Catalogo.buscarFilme(nome);

                           if (filme != null)
                           {
                               filme.adicionarAtor(Catalogo.buscarAtor(nome, sobrenome));

                           } else {

                               System.out.println("ATENÇÃO: filme não cadastrado! Cadastre o filme no sistema.");
                           }

                     }
                }

                case 4 -> {
                    sc.nextLine();
                    System.out.println("Digite o nome do diretor: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o sobrenome do diretor: ");
                    String sobrenome = sc.nextLine();

                    System.out.println("Digite a idade do diretor: ");
                    int idade = sc.nextInt();

                    System.out.println("Digite a quantidade de filme dirigidos por " + nome);
                    int quantidade = sc.nextInt();

                   Catalogo.cadastrarDiretor(nome, sobrenome, idade);

                   System.out.println("Deseja associar o diretor a um filme (S/N)? ATENÇÃO: O filme precisa estar cadastrado no sistema!");

                    sc.nextLine();
                    String associar = sc.nextLine();

                    if (associar.equalsIgnoreCase("S")) {

                        System.out.println("Qual o nome do filme que deseja associar?");

                        String nomeDoFilme = sc.nextLine();

                        Filme filme = Catalogo.buscarFilme(nome);

                        if (filme != null)
                        {
                            filme.setDiretor(Catalogo.buscarDiretor(nome, sobrenome));

                        } else {

                            System.out.println("ATENÇÃO: filme não cadastrado! Cadastre o filme no sistema.");
                        }

                    }

                }
                case 5 -> {
                    System.out.println("Associar filme e ator");
                }
                case 6 -> {
                    sc.nextLine();
                    System.out.println("Digite o nome do filme que deseja encontrar; ");
                    String nome = sc.nextLine();

                    Filme filme = Catalogo.buscarFilme(nome);

                    if (filme != null) {
                        System.out.println(filme);
                    } else {
                        System.out.println("Filme não encontrado!");
                    }

                }
                case 7 -> {
                    System.out.println("Volte sempre!");

                }
                default -> {
                    System.out.println("Opção inválida!");
                }
            }
        }

        Catalogo.exibirFilmes();
    }
}