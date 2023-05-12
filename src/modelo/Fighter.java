package modelo;

public abstract class Fighter {
    private String nome;
    private int poder;
    private int vida;
    private Special special;

    public Fighter(String nome, int poder, int vida, Special special) {
        this.nome = nome;
        this.poder = poder;
        this.vida = vida;
        this.special = special;
    }

    public abstract void perdeVida(Fighter lutador);

    public abstract void ataque(Fighter lutador);

    public abstract void usarPoderSpecial(Fighter lutador);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Special getSpecial() {
        return special;
    }

    public void setSpecial(Special special) {
        this.special = special;
    }
}