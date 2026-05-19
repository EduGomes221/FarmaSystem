package Model;

public class Medicamento {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private String validade;

    public Medicamento(int id, String nome, double preco, int quantidade, String validade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", validade='" + validade + '\'' +
                '}';
    }

    public int getId() {
        return 0;
    }

    public void setNome(String novoNome) {
    }

    public String getValidade() {
        return validade;
    }

    public double getPreco() {
        return preco;
    }


}