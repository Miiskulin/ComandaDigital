package models;

public class ItemProduto {
    private int Codigo;
    private String Nome;
    private float Valor;
    private String Descricao;


    public ItemProduto() {
    }

    public ItemProduto(int codigo, String nome, float valor, String descricao) {
        Codigo = codigo;
        Nome = nome;
        Valor = valor;
        Descricao = descricao;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float valor) {
        Valor = valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nInformações do produto: \n");
        sb.append("Código: ");
        sb.append(Codigo + "\n");
        sb.append("Nome: ");
        sb.append(Nome + "\n");
        sb.append("Valor: R$");
        sb.append(Valor + "\n");
        sb.append("Descrição: ");
        sb.append(Descricao + "\n");
        return sb.toString();
    }
}
