import java.time.LocalDateTime;

public class App {
    public static void main( String[] args ){

        Uf uf1 = new Uf("Espírito Santo", "ES");
        Cidade cidade1 = new Cidade("Rio de Janeiro", uf1); 

        Time flu = new Time("Fluminense", cidade1);
        Time fla = new Time("Flamengo", cidade1);
        Partida rodada1 = new Partida(fla, flu, "Maracanã", cidade1);

        rodada1.setData(LocalDateTime.of(2022, 9, 14, 15, 0, 0));
        rodada1.print_partida();
    }   
}
