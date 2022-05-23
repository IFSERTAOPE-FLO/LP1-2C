package Dinamica040522;

public class Produto {
    private int codigo;
    private String nome;
    private Double precoVenda;
    private int quantidade;
    public Produto() {
        this.codigo = 0;
        this.nome = "";
        this.precoVenda = 0.0;
        this.quantidade = 0;
    }
    public Produto(int codProduto) {
        this.codigo = codProduto;
        this.nome = "";
        this.precoVenda = 0.0;
        this.quantidade = 0;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}