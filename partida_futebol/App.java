import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        Uf uf1 = new Uf("Rio de Janeiro", "RJ");
        Cidade cidade1 = new Cidade("Rio de Janeiro", uf1);

        Time flu = new Time("Fluminense", cidade1);
        Time fla = new Time("Flamengo", cidade1);

        Partida rodada1 = new Partida(fla, flu, "Maracanã", cidade1);
        rodada1.setData(LocalDateTime.of(2022, 9, 15, 15, 0, 0));
        rodada1.setPlacar1(0);
        rodada1.setPlacar2(1);

        System.out.printf("=====RODADA 1=====\n\n");
        System.out.printf("%s x %s\n\n", rodada1.getTeam_1().getNome(), rodada1.getTeam_2().getNome());
        System.out.print("#####Cidade de origem dos times#####\n");
        System.out.printf("%s -> %s - %s\n", rodada1.getTeam_1().getNome(), rodada1.getTeam_1().getCidade().getNome(),
                rodada1.getTeam_1().getCidade().getUf().getSigla());
        System.out.printf("%s -> %s - %s\n\n", rodada1.getTeam_2().getNome(),
                rodada1.getTeam_2().getCidade().getNome(), rodada1.getTeam_1().getCidade().getUf().getSigla());
        System.out.printf("O jogo será sediado no estádio %s que fica no %s - %s\n\n", rodada1.getEstadio(),
                rodada1.getCidade().getNome(), rodada1.getCidade().getUf().getSigla());
        System.out.print("<<<<PLACAR>>>>\n\n");
        System.out.printf("%s %d x %d %s\n", rodada1.getTeam_1().getNome(), rodada1.getPlacar1(), rodada1.getPlacar2(),
                rodada1.getTeam_2().getNome());
    }
}
