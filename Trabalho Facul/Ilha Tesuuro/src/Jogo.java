public class jogo {
    /*
     * Item encontrado Tipo          Pontuação
     * "OURO"        Tesouro        +10 pontos
     * "DIAMANTE"    Tesouro        +20 pontos
     * "RUBI"        Tesouro        +15 pontos
     * 
     * "BURACO"      Armadilha       -5 pontos
     * "COBRA"       Armadilha      -10 pontos
     * "ESPINHOS"    Armadilha       -7 pontos
     * 
     * "VAZIO"       Nenhum           0 pontos
     */

    public jogo() {
        
        int ouro = 10;
        int diamente = 20;
        int rubi = 15;
        
        int buraco = -5;
        int cobra = -10;
        int espinho = -7;
        
        int vazio = 0;
        
        
    }

    public static void main(String[] args) {
        new jogo();
    }
}
