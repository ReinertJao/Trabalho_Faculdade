


public class Jogo {
    
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
    
    private String ilha[] = new String[15];
    private boolean explorador[] = new boolean[15];
    private int pontuação =0;
    private int tentativas = 8;


    
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
    private void mostrarMapa(int ilha[], boolean explorador[]) {
        for (int i = 0; i < ilha.length; i++) {
            System.out.println( ilha[i] + " ? ");
            
            if (explorador[i]) {
                System.out.println("[" + i + "] Explorado" );
            } else {
                System.out.println("[" + i + "] ? ");
            }
        }
    }
    
    private void jogando(){
        
    }
    
    private void mostrarStatus(int pontuação){
        System.out.println("Status do Jogo: ");
        System.out.println("Pontuação " + pontuação +  " pontos");
        System.out.println("Tentativas restanrtes: ");
        System.out.println("Tesouros encontrados: ");
        System.out.println("Armadilhas encontradas: ");
        System.out.println("Posições vazias exploradas: ");
        
    }
    
    
    
    

    
}

