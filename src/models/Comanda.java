package models;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int Numero;
    private List<Produto> Produtos = new ArrayList<>();

    public Comanda(){

    }

    public Comanda(int numero){
        Numero = numero;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String VisualizarComanda(){
        StringBuilder sb = new StringBuilder();
        sb.append("Informações da Comanda: \n");
        sb.append("Numero da comanda: ");
        sb.append(Numero + "\n");
        sb.append("Produtos: \n");
        for (Produto prod : Produtos) {
            sb.append(prod + "\n");
        }
        sb.append("Valor Total da Comanda: R$");
        sb.append(CalcularValorTotal() + "\n");
        return sb.toString();
    }

    public void AdicionarItem(Produto produto){
        this.Produtos.add(produto);
    }

    public void RemoverItem(Produto produto) {
        this.Produtos.remove(produto);
    }

    public Produto getProduto(Integer codigo) {
        return this.Produtos.stream().filter(x -> x.getItemProduto().getCodigo() == codigo).findFirst().get();
    }

    public String FinalizarComanda(){
        this.Produtos = new ArrayList<Produto>();

        StringBuilder sb = new StringBuilder();
        sb.append("Comanda " + Numero + " finalizada com sucesso! \n");

        return sb.toString();
    }

    public float CalcularValorTotal(){
        float sum = 0;

        for (Produto produto : Produtos) {
            sum += produto.CalcularValorProduto();
        }

        return sum;
    }
}
