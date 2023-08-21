import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CatalogoDeFilmes catalogoDeFilmes = new CatalogoDeFilmes();

        int opcao = 0;
        while (opcao != 7) {
            System.out.println("----------------------CATÁLOGO IMDB-----------------------");
            System.out.println("-                                                        -");
            System.out.println("-            Selecione uma das opções abaixo:            -");
            System.out.println("-                                                        -");
            System.out.println("-       1 - Cadastrar filme                              -");
            System.out.println("-       2 - Lista filmes                                 -");
            System.out.println("-       3 - Cadastrar atores                             -");
            System.out.println("-       4 - Cadastrar diretores                          -");
            System.out.println("-       5 - Associar filme com seus atores e diretores   -");
            System.out.println("-       6 - Pesquisar filme cadastrado                   -");
            System.out.println("-       7 - SAIR                                         -");
            System.out.println("-                                                        -");
            System.out.println("----------------------------------------------------------");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Qual o nome do filme? ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.println("Qual a data de Lançamento? ");
                    String dataDeLancamento = sc.nextLine();

                    System.out.println("Qual o orçamento deste filme? ");
                    double orcamento = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Qual a descrição do filme? ");
                    String descricao = sc.nextLine();

                    Filme filme = new Filme(nome, dataDeLancamento, orcamento, descricao);
                    catalogoDeFilmes.cadastrarFilme(filme);
                    break;
                }

                case 2: {
                    catalogoDeFilmes.exibirFilmes();
                    break;
                }
                case 3: {
                    sc.nextLine();
                    System.out.println("Digite o nome do ator: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o sobrenome do ator: ");
                    String sobrenome = sc.nextLine();

                    System.out.println("Digite a idade do ator: ");
                    int idade = sc.nextInt();

                    System.out.println("Digite a quantidade de filme do ator: ");
                    int quantidade = sc.nextInt();

                    Ator ator = new Ator(nome, sobrenome, idade, quantidade);
                    System.out.println(ator);
                    catalogoDeFilmes.cadastrarAtor(ator);

                    break;
                }
                case 4: {
                    sc.nextLine();
                    System.out.println("Digite o nome do diretor: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o sobrenome do diretor: ");
                    String sobrenome = sc.nextLine();

                    System.out.println("Digite a idade do diretor: ");
                    int idade = sc.nextInt();

                    System.out.println("Digite a quantidade de filme dirigidos do diretor: ");
                    int quantidade = sc.nextInt();

                    Diretor diretor = new Diretor(nome, sobrenome, idade, quantidade);
                    System.out.println(diretor);
                    catalogoDeFilmes.cadastrarDiretor(diretor);
                    break;
                }
                case 5: {
                    sc.nextLine();
                    boolean continua = true;
                    Filme filme;
                    Diretor diretor;
                    ArrayList<Ator> atores = new ArrayList<>();

                    do {

                        System.out.println("Qual filme voce deseja associar?");
                        String nomeDoFilme = sc.nextLine();

                        filme = catalogoDeFilmes.pesquisarFilmePorNome(nomeDoFilme);

                        if (filme != null) {
                            continua = false;
                            System.out.println(filme);
                        } else {
                            System.out.println("Filme não encontrado! ");
                        }
                    } while (continua);

                    continua = true;


                    do {
                        System.out.println("Qual Diretor você deseja associar?");
                        String nomeDoDiretor = sc.nextLine();

                        diretor = catalogoDeFilmes.pesquisarDiretorPorNome(nomeDoDiretor);

                        if (diretor != null) {
                            continua = false;
                            System.out.println(diretor);
                        } else {
                            System.out.println("Diretor não encontrado! ");
                        }
                    } while (continua);

                    continua = true;


                    do {
                        System.out.println("Qual ator você deseja associar?");
                        String nomeDoAtor = sc.nextLine();

                        Ator ator = catalogoDeFilmes.pesquisarAtorPorNome(nomeDoAtor);

                        if (ator != null) {
                            System.out.println(ator);
                            atores.add(ator);

                            System.out.println("Deseja cadastrar mais atores? [S/N]");
                            String resposta = sc.nextLine();

                            if ("N".equalsIgnoreCase(resposta)) {
                                continua = false;
                            }
                        } else {
                            System.out.println("Diretor não encontrado! ");
                        }

                    } while (continua);

                    catalogoDeFilmes.associarFilmeComAtorEDiretor(filme, diretor, atores);

                    break;
                }
                case 6: {
                    sc.nextLine();
                    System.out.println("Digite o nome do filme que deseja encontrar; ");
                    String nome = sc.nextLine();

                    Filme filme = catalogoDeFilmes.pesquisarFilmePorNome(nome);

                    if (filme != null) {
                        System.out.println(filme);
                    } else {
                        System.out.println("Filme não encontrado!");
                    }

                    break;
                }
                case 7: {
                    System.out.println("Volte sempre!");
                    break;

                }
                default: {
                    System.out.println("Opção inválida!");
                }
            }
        }
    }
}