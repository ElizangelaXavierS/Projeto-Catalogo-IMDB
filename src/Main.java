import javax.xml.catalog.Catalog;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CatalogoDeFilmes CatalogoIMDB = new CatalogoDeFilmes();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        CatalogoDeFilmes catalogoDeFilmes = new CatalogoDeFilmes();

        System.out.println("Seleciona uma das opções abaixo: ");

        while (opcao != 6) {

            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Cadastrar Atores");
            System.out.println("3 - Cadastrar Diretores");
            System.out.println("4 - Associar filme com seus atores e diretores");
            System.out.println("5 - Pesquisar filme cadastrado");
            System.out.println("6 - SAIR");
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
                    Filme filme = new Filme(nome, dataDeLancamento, orcamento, descricao, null);
                    System.out.println(filme.toString());
                    break;
                }

                case 2:
                    catalogoDeFilmes.exibirFilmes();
            }
        }
        catalogoDeFilmes.exibirFilmes();
    }
}