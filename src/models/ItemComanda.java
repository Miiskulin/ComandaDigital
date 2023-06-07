package models;

public class ItemComanda {
    private int Codigo;
    private int Quantidade;
    private float Valor;
    private Produto Produto;

    private Comanda Comanda; // Lembrar do exemplo papelzinho

    public ItemComanda(){

    }

    public ItemComanda(int codigo, int quantidade, float valor){
        this.Codigo = codigo;
        this.Quantidade = quantidade;
        this.Valor = valor;
    }


    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float valor) {
        Valor = valor;
    }

    public void CalcularValorProduto() {

    }

}
