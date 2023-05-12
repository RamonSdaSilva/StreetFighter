package modelo;

public class Player {
    private String nome;
    private Fighter lutador;

    public Player(String nome, Fighter lutador) {
        this.nome = nome;
        this.lutador = lutador;
    }

    public String getNome() {
        return nome;
    }

    public Fighter getLutador() {
        return lutador;
    }

    public void setLutador(Fighter lutador) {
        this.lutador = lutador;
    }
}