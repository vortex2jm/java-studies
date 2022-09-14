import java.time.LocalDateTime;

public class Partida {
    
    // construtor
    public Partida(Time team1, Time team2, String estadio, Cidade cidade){
        this.team_1 = team1;
        this.team_2 = team2;
        this.estadio = estadio;
        this.cidade = cidade;
    }
    
    private Time team_1;
    private Time team_2;
    private LocalDateTime data;
    private String estadio;
    private int placar1; 
    private int placar2;
    private Cidade cidade;
    
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    // time 1
    public Time getTeam_1() {
        return team_1;
    }
    public void setTeam_1(Time team_1) {
        this.team_1 = team_1;
    }

    // time 2
    public Time getTeam_2() {
        return team_2;
    }
    public void setTeam_2(Time team_2) {
        this.team_2 = team_2;
    }

    // Data e hora
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    // estádio
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    // placar 1
    public int getPlacar1() {
        return placar1;
    }
    public void setPlacar1(int placar1) {
        this.placar1 = placar1;
    }

    // placar 2
    public int getPlacar2() {
        return placar2;
    }
    public void setPlacar2(int placar2) {
        this.placar2 = placar2;
    }

    // função para imprimir o estado atual da partida
    public void print_partida(){
        System.out.printf("%s x %s\n\n", team_1.getNome(), team_2.getNome());
        System.out.printf("Local: %s\n\n", estadio);
        System.out.println(data);
        System.out.printf("====PLACAR====\n\n");
        System.out.printf("%d x %d\n", placar1, placar2);        
    }
}
