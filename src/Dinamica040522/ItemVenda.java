package Dinamica040522;

public class ItemVenda {

    private int codigo;
    private Venda venda;
    private Produto produto;
    private int quantidade;
    private Double valorUnitario;

    public ItemVenda() {
        this.codigo = 0;
        this.produto = new Produto();
        this.quantidade = 0;
        this.valorUnitario = 0.0;
    }
    public ItemVenda(int codigo) {
        this.codigo = codigo;
        this.produto = new Produto();
        this.quantidade = 0;
        this.valorUnitario = 0.0;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Venda getVenda() {
        return venda;
    }
    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if (quantidade <= produto.getQuantidade()) {
            this.quantidade = quantidade;
        }
    }
    public Double getValorUnitario() {
        return produto.getPrecoVenda();
    }
}