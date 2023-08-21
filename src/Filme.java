import java.util.ArrayList;

public class Filme {

    private String nome;
    private String dataDeLancamento;
    private double orcamento;
    private String descricao;

    private Diretor diretor;
    private ArrayList<Ator> atores = new ArrayList<>();

    public Filme() {

    }

    public Filme(String nome, String dataDeLancamento, double orcamento, String descricao, Diretor diretor, ArrayList<Ator> atores) {
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = atores;
    }

    public Filme(String nome, String dataDeLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public ArrayList<Ator> getListaAtores() {
        return atores;
    }

    public void setListaAtores(ArrayList<Ator> listaAtores) {
        this.atores = listaAtores;
    }

    public void adicionarAtor(Ator ator){
        atores.add(ator);
    }


    @Override
    public String toString() {
        return "Filme [" +
                "Nome: " + nome +
                ", Data De Lançamento:" + dataDeLancamento +
                ", Orçamento: " + orcamento +
                ", Descrição: " + descricao +
                (diretor != null ? ", Diretor: " + diretor.getNome() : "") +
                (atores.size() > 0 ? ", Atores: [" + nomesDeAtores() +"]" : "")
                + "]";
    }

    private String nomesDeAtores(){
        String nomes = "";
        for (Ator ator: atores){
            nomes = nomes.concat(ator.getNome()+ " , ");
        }
        return nomes;
    }
}
