import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

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
                case 1:{
                    Filme filme = new Filme();
                    System.out.println("Qual o nome do filme? ");
                    sc.nextLine();
                    filme.setNome(sc.nextLine());
                    System.out.println("Qual a data de Lançamento? ");
                    filme.setDataDeLancamento(sc.nextLine());
                    System.out.println("Qual o orçamento deste filme? ");
                    filme.setOrcamento(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Qual a descrição do filme? ");
                    filme.setDescricao(sc.nextLine());
                    System.out.println(filme.toString());
                    break;}
                case 2:

            }

        }
    }
}