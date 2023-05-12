package modelo;

class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void começarJogo() {
        System.out.println("Começando partida!");
        System.out.println(player1.getNome() + " - " + player1.getLutador().getNome() +
                " VS " + player2.getNome() + " - " + player2.getLutador().getNome());

        Player JogadorAtual = player1;
        Player Inimigo = player2;
        int contadorDeAtaque = 0;

        while (true) {
            // Ataque do jogador atual no oponente
            if (contadorDeAtaque % 3 == 0) {
                JogadorAtual.getLutador().usarPoderSpecial(Inimigo.getLutador());
                System.out.println(JogadorAtual.getNome() + " usou o ataque especial " +
                        JogadorAtual.getLutador().getSpecial().getNome() + " em " + Inimigo.getNome() +
                        " e causou " + JogadorAtual.getLutador().getSpecial().getValorSpecial() +
                        " de dano!");
            } else {
                JogadorAtual.getLutador().ataque(Inimigo.getLutador());
                System.out.println(JogadorAtual.getNome() + " atacou " + Inimigo.getNome() +
                        " com " + JogadorAtual.getLutador().getNome() + " e causou " +
                        JogadorAtual.getLutador().getPoder() + " de dano!");
            }

            contadorDeAtaque++;

            // Checa se o oponente zerou a vida
            if (Inimigo.getLutador().getVida() <= 0) {
                System.out.println("Fim de Jogo!");
                System.out.println(JogadorAtual.getNome() + " e seu personagem " +
                        JogadorAtual.getLutador().getNome() + " venceram!");
                System.out.println(Inimigo.getNome() + " e seu personagem " +
                        Inimigo.getLutador().getNome() + " perderam!");
                System.out.println("Vida restante de " + JogadorAtual.getLutador().getNome() +
                        ": " + JogadorAtual.getLutador().getVida());
                System.out.println("Vida restante de " + Inimigo.getLutador().getNome() +
                        ": " + Inimigo.getLutador().getVida());
                break;
            }

            // Troca o jogador atual com o oponente
            Player tempo = JogadorAtual;
            JogadorAtual = Inimigo;
            Inimigo = tempo;
        }
    }
}