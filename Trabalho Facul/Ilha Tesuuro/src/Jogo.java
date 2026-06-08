public class Jogo {
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

    public Jogo() {
        String[] tipos = {"VAZIO", "OURO", "DIAMANTE","RUBI", "BURADO", "COBRA", "ESPINHOS"};
        /*tipos[0]= "VAZIO";
        tipos[1] = "OURO";
        tipos[2] = "DIAMANTE";*/

        int posicao = (int)(Math.random() * 7);
        System.out.println(posicao + " " + tipos[posicao]);
        // return posicao;
    

        int ouro = 10;
        int diamente = 20;
        int rubi = 15;
        
        int buraco = -5;
        int cobra = -10;
        int espinho = -7;
        
        int vazio = 0;
        
        
    }
    public static void main(String[] args) {
        new Jogo();
    }
}
