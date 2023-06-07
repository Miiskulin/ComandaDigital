package models;

public class Garcom {
    private int Id;
    private String Nome;

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
    
    public void AplicarTaxaServico(int numeroComanda) {
        
    }
}
