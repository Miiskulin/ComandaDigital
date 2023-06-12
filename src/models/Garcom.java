package models;

import java.util.ArrayList;
import java.util.List;


public class Garcom {
    private int Id;
    private String Nome;
    private List<Comanda> Comandas = new ArrayList<>();

    public Garcom() {

    }

    public Garcom(int id, String nome){
        this.Id = id;
        this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void NovaComanda(Comanda comanda) {
        this.Comandas.add(comanda);
    }
    
    public void AplicarTaxaServico(int numeroComanda) {
        Comanda comanda = this.Comandas.stream().findAny().filter(x -> x.getNumero() == numeroComanda).get();
        double valor = (comanda.CalcularValorTotal() * 0.10) + comanda.CalcularValorTotal();
        System.out.println("Valor Total: R$ " + valor);
        this.Comandas = new ArrayList<Comanda>();
    }
}
