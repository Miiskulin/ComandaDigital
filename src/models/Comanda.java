package models;

import java.util.List;

public class Comanda {
    private int Numero;
    private float ValorTotal;

    private List<ItemComanda> ItensComanda;

    public Comanda(){

    }

    public Comanda(int numero, float valorTotal){
        Numero = numero;
        ValorTotal = valorTotal;
    }


    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float valorTotal) {
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

    public void CalcularValorTotal(){

    }

}
