package modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteGame2 {
    @Test
    public void TestaJogo() {
        // Cria os jogadores e seus lutadores
        Fighter ChunLi = new ChunLi("ChunLi", 100, 1000, new Special("Shoryuken", 200));
        Fighter Blanka = new Blanka("Blanka", 120, 1000, new Special("Hadouken", 150));
        Player player1 = new Player("Player 1", ChunLi);
        Player player2 = new Player("Player 2", Blanka);

        // Cria um objeto de jogo e inicia a partida
        Game jogo = new Game(player1, player2);
        jogo.começarJogo();

        // Checa se a vida dos jogadores é consistente após a partida
        Assertions.assertTrue(player1.getLutador().getVida() > 0);
        Assertions.assertTrue(player2.getLutador().getVida() <= 0);
    }
}





