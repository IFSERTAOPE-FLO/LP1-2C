package Dinamica040522;

public class Venda {
    private int codigo;
    private Cliente cliente;
    private String dataVenda;
    private Double valorTotal;
    private ItemVenda itens;

    public Venda() {
        this.codigo = 0;
        this.cliente = new Cliente();
        this.dataVenda = "";
        this.valorTotal = 0.0;
        this.itens = new ItemVenda();
    }
    public Venda(int codigo) {
        this.codigo = codigo;
        this.cliente = new Cliente();
        this.dataVenda = "";
        this.itens = new ItemVenda();
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    public Double getValorTotal() {
        double total = (itens.getValorUnitario() * itens.getQuantidade());
        return total;
    }
    public ItemVenda getItens() {
        return itens;
    }
    public void addItem(ItemVenda itemVenda) {
        itens = itemVenda;
    }
}