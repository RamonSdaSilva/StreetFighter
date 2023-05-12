package modelo;

public class Special {
    private String nome;
    private int valorSpecial;

    public Special(String nome, int valorSpecial) {
        this.nome = nome;
        this.valorSpecial = valorSpecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorSpecial() {
        return valorSpecial;
    }

    public void setValorSpecial(int valorSpecial) {
        this.valorSpecial = valorSpecial;
    }
}