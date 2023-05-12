package modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteGame1 {
    @Test
    public void testStartGame_KenVsRyu() {
        // Cria os jogadores e seus lutadores
        Fighter ken = new Ken("Ken", 100, 1000, new Special("Shoryuken", 200));
        Fighter ryu = new Ryu("Ryu", 120, 1000, new Special("Hadouken", 150));
        Player player1 = new Player("Player 1", ken);
        Player player2 = new Player("Player 2", ryu);

        // Cria um objeto de jogo e inicia a partida
        Game game = new Game(player1, player2);
        game.começarJogo();

        // Checa se a vida dos jogadores é consistente após a partida
        Assertions.assertTrue(player1.getLutador().getVida() > 0);
        Assertions.assertTrue(player2.getLutador().getVida() <= 0);
    }
}





