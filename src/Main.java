import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int opcao = 0;

        while (opcao != 8) {

            System.out.println("----------------------CATÁLOGO IMDB-----------------------");
            System.out.println("-                                                        -");
            System.out.println("-       Selecione uma das opções abaixo:                 -");
            System.out.println("-                                                        -");
            System.out.println("-       1 - Cadastrar filme                              -");
            System.out.println("-       2 - Listar filmes                                -");
            System.out.println("-       3 - Cadastrar ator                               -");
            System.out.println("-       4 - Cadastrar diretor                            -");
            System.out.println("-       5 - Associar ator a um filme                     -");
            System.out.println("-       6 - Associar diretor a um filme                  -");
            System.out.println("-       7 - Pesquisar filme cadastrado                   -");
            System.out.println("-       8- Sair                                          -");
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

                }
                case 5 ->
                {
                    System.out.println("Certifique-se que o ator e o filme estejam cadastrados no sistema. Deseja continuar (S/N)?");

                     sc.nextLine();
                     String escolha = sc.nextLine();

                        if (escolha.equalsIgnoreCase("S")) {

                             System.out.println("Digite o nome do ator desejado");
                             String nome = sc.nextLine();

                             System.out.println("Digite o sobrenome do ator");
                             String sobrenome = sc.nextLine();

                            System.out.println("Qual o nome do filme em que " + nome + " " + sobrenome + " atuou?");

                            String nomeDoFilme = sc.nextLine();

                            Ator ator = Catalogo.buscarAtor(nome,sobrenome);
                            Filme filme = Catalogo.buscarFilme(nomeDoFilme);

                              if (ator == null || filme == null) {

                                  if (ator == null)
                                      System.out.println("ATENÇÃO: Ator não cadastrado no sistema. Cadastre-o inicialmente.");
                                  if (filme == null)
                                      System.out.println("ATENÇÃO: Filme não cadastrado no sistema. Cadastre-o inicialmente.");

                                  break;
                              } else {
                                  filme.adicionarAtor(ator);

                                  System.out.println();
                                  System.out.println("O ator " + nome + " " + sobrenome + " foi vinculado ao filme com sucesso!");

                              }
                        }
                }
                case 6 -> {

                    System.out.println("Certifique-se que o diretor e o filme estejam cadastrados no sistema. Deseja continuar (S/N)?");

                    sc.nextLine();
                    String escolha = sc.nextLine();

                    if (escolha.equalsIgnoreCase("S")) {

                        System.out.println("Digite o nome do diretor desejado");
                        String nome = sc.nextLine();

                        System.out.println("Digite o sobrenome do diretor");
                        String sobrenome = sc.nextLine();

                        System.out.println("Qual o nome do filme dirigido por " + nome + " " + sobrenome + "?");

                        String nomeDoFilme = sc.nextLine();

                        Diretor diretor = Catalogo.buscarDiretor(nome, sobrenome);
                        Filme filme = Catalogo.buscarFilme(nomeDoFilme);

                        if ( diretor == null || filme == null) {

                            if (diretor == null)
                                System.out.println("ATENÇÃO: Ator não cadastrado no sistema. Cadastre-o inicialmente.");
                            if (filme == null)
                                System.out.println("ATENÇÃO: Filme não cadastrado no sistema. Cadastre-o inicialmente.");
                        } else {

                            filme.setDiretor(diretor);
                            System.out.println();
                            System.out.println("O diretor " + nome + " " + sobrenome + " foi vinculado ao filme com sucesso!");

                        }
                    }
                }

                case 7 -> {

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
                case 8 -> {
                    System.out.println("Volte sempre!");
                }
                default -> {
                    System.out.println("Opção inválida!");

                }
            }
        }
    }
}