package models;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int Numero;
    private double ValorTotal;
    private List<Produto> Produto = new ArrayList<>();
    private Garcom Garcom;

    public Comanda(){

    }

    public Comanda(int numero, double valorTotal){
        Numero = numero;
        ValorTotal = valorTotal;
    }


    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.ValorTotal = valorTotal;
    }

    public void VisualizarComanda(){

    }

    public void AdicionarItem(){

    }

    public void RemoverItem(){

    }

    public void FinalizarComanda(){

    }

    public float CalcularValorTotal(float valor){
        int soma = 0;

        for (Produto produto : Produto) {
            soma += produto.getValor();
        }

        return soma;
    }
}
