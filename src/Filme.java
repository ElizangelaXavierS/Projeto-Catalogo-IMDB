import java.util.ArrayList;

public class Filme {

    private String nome;
    private String dataDeLancamento;
    private double orcamento;
    private String descricao;

    private Diretor diretor;
    ArrayList<Ator> atores = new ArrayList<>();

    public Filme() {

    }

    public Filme(String nome, String dataDeLancamento, double orcamento, String descricao, Diretor diretor) {
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = atores;
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
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", dataDeLancamento='" + dataDeLancamento + '\'' +
                ", orcamento=" + orcamento +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
