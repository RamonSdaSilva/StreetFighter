package modelo;

public class Blanka extends Fighter {
    public Blanka(String nome, int poder, int vida, Special special) {
        super(nome, poder, vida, special);
    }

    @Override
    public void perdeVida(Fighter lutador) {
        int dano = (int) (getPoder() * 0.2);
        lutador.setVida(lutador.getVida() - dano);
    }

    @Override
    public void ataque(Fighter lutador) {
        int dano = (int) (getPoder() * 0.1);
        lutador.setVida(lutador.getVida() - dano);
    }

    @Override
    public void usarPoderSpecial(Fighter lutador) {
        int dano = getSpecial().getValorSpecial() * 2;
        lutador.setVida(lutador.getVida() - dano);
    }
}