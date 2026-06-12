

public class Jogo {
    
    /*int ilha0[] = new int[15];
    int ilha1[] = new int[15];
    int ilha2[] = new int[15];
    int ilha3[] = new int[15];
    int ilha4[] = new int[15];
    int ilha5[] = new int[15];
    int ilha6[] = new int[15];
    int ilha7[] = new int[15];
    int ilha8[] = new int[15];
    int ilha9[] = new int[15];
    int ilha10[] = new int[15];
    int ilha11[] = new int[15];
    int ilha12[] = new int[15];
    int ilha13[] = new int[15];
    int ilha014[] = new int[15];*/
    
    /*
     * Item encontrado Tipo Pontuação
     * "OURO" Tesouro +10 pontos
     * "DIAMANTE" Tesouro +20 pontos
     * "RUBI" Tesouro +15 pontos
     * 
     * "BURACO" Armadilha -5 pontos
     * "COBRA" Armadilha -10 pontos
     * "ESPINHOS" Armadilha -7 pontos
     * 
     * "VAZIO" Nenhum 0 pontos
     */

    public Jogo() {
        int ilha[] = new int[15];

        instrucoes();
        mostrarMapa(ilha);

    }
    
    
    void instrucoes(){
     System.out.println(" Bem-vindo ao Island Pirates! \r\n" + //
                  "\r\n" + //
                  "Explore as ilhas em busca de tesouros, mas cuidado com as armadilhas!\r\n" + //
                  "\r\n" + //
                  "Você possui 8 tentativas e deve terminar o jogo com pontuação positiva.\r\n" + //
                  "\r\n" + //
                  " Tesouros:\r\n" + //
                  " OURO -> +10 pontos\r\n" + //
                  " RUBI -> +15 pontos\r\n" + //
                  " DIAMANTE -> +20 pontos\r\n" + //
                  "\r\n" + //
                  " Armadilhas:\r\n" + //
                  " BURACO -> -5 pontos\r\n" + //
                  " ESPINHOS -> -7 pontos\r\n" + //
                  " COBRA -> -10 pontos\r\n" + //
                  "\r\n" + //
                  " VAZIO -> 0 pontos\r\n" + //
                  "\r\n" + //
                  "Boa sorte, pirata! \r\n" + //
                  "");   
    }
    

    // Contar de 0 a 14
    private void mostrarMapa(int[] ilha) {
        for (int i = 0; i < ilha.length; i++) {
            System.out.println( ilha + " ? ");

        }
    }
    
    private void jogando(){
        
    }
    
    private void mostrarStatus(){
        
    }
    
    
    
    

    
}

