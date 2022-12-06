import java.util.Date;

import user.UserBase;
import user.domain.User;
import user.features.Tweet;

public class App {
    public static void main(String[] args) throws Exception {

        UserBase db = new UserBase();
        Date date = new Date();
        User jp = db.addUser("João Paulo Moura");
        User mf = db.addVerifiedUser("Matheus Fiurin Ribeiro", date);

        Tweet tjp = new Tweet("Bom dia, o dia amanheceu ensolarado hoje!");
        Tweet tmf = new Tweet("Hoje vou pro jiu animado!!!");

        jp.addTweet(tjp);
        mf.addTweet(tmf);

        System.out.println("A porcentaagem de usuários verificados é  de " + db.verifiedUsersPercentage() + "%");
        System.out.println("A média de tamanho de tweets nesta base de dados é de " + db.tweetsMediumSize() + " caracteres");
    }
}
