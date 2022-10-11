public class App {
  
  public static void main( String[] args ){

    Book osTresPorquinhos= new Book("Os três porquinhos", 50.00, "Desconhecido");
    Book aVoltaDosQueNaoForam =new Book("A volta dos que não foram", 76.90, "Não sei");
    BoardGames batalhaNaval = new BoardGames("Batalha Naval", 120.00, 12);
    BoardGames jogoDaVida = new BoardGames("Jogo da vida", 100.86, 12);
    BoardGames bancoImobiliario = new BoardGames("Banco Imobiliário", 148.90, 14);

    Product[] listaDeProdutos = new Product[5]; 
    
    listaDeProdutos[0] = osTresPorquinhos;
    listaDeProdutos[1] = aVoltaDosQueNaoForam;
    listaDeProdutos[2] = batalhaNaval;
    listaDeProdutos[3] = jogoDaVida;
    listaDeProdutos[4] = bancoImobiliario;

    for(Product p: listaDeProdutos){
      System.out.println(p);
    }
  }
}
