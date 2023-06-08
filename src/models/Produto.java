package models;

public class Produto {
    private int Codigo;
    private int Quantidade;
    private float Valor;
    private ItemProduto ItemProduto;
    private Comanda Comanda; // Lembrar do exemplo papelzinho

    public Produto(){

    }

    public Produto(int codigo, int quantidade, float valor){
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

    public int getQuantidade(){
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

    public float CalcularValorProduto() {
        return this.Valor * this.Quantidade;
    }
}
