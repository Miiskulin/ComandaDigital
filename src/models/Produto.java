package models;

public class Produto {
    private int Quantidade;
    private String Tipo;
    private ItemProduto ItemProduto;
    
    public Produto() {

    }
    
    public Produto(int quantidade, String tipo, models.ItemProduto itemProduto) {
        Quantidade = quantidade;
        Tipo = tipo;
        ItemProduto = itemProduto;
    }


    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public ItemProduto getItemProduto() {
        return ItemProduto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public void setItemProduto(ItemProduto itemProduto) {
        ItemProduto = itemProduto;
    }

    public float CalcularValorProduto() {
        return this.ItemProduto.getValor() * this.Quantidade;
    }

    @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ItemProduto);
        sb.append("Tipo: ");
        sb.append(Tipo + "\n");
        sb.append("Quantidade: ");
        sb.append(Quantidade + "\n");
        sb.append("Valor Total Produto: R$");
        sb.append(CalcularValorProduto() + "\n");
        return sb.toString();
    }
}