package Dinamica040522;

public class Principal {
    public static void main(String[] args) {
        Venda venda = new Venda(1);
        venda.setCodigo(1);

        Cliente cliente1 = new Cliente();
        cliente1.setCodigo(1);
        cliente1.setCpf("12345678912");
        cliente1.setNome("Serafim");
        venda.setCliente(cliente1);

        venda.setDataVenda("04/05/2022");

        ItemVenda itemVenda = new ItemVenda(1);
        itemVenda.setVenda(venda);

        Produto produto = new Produto(1);
        produto.setNome("Feijão");
        produto.setPrecoVenda(10.0);
        produto.setQuantidade(30);
        itemVenda.setProduto(produto);
        itemVenda.setQuantidade(10);

        venda.addItem(itemVenda);

        System.out.println("Bom dia sr. " + venda.getCliente().getNome());
        System.out.println("Iniciando a venda de código " + venda.getCodigo());
        System.out.println("Você comprou: " + venda.getItens().getProduto().getNome());
        System.out.println("Quantidade: " + venda.getItens().getQuantidade());
        System.out.println("Valor Total: " + venda.getValorTotal());

    }
}
