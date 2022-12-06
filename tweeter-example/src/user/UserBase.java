package user;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import user.domain.User;
import user.domain.VerifiedUser;
import user.features.Tweet;

public class UserBase {
    
    private Map<String, User> userBase = new HashMap<>();

    public User addUser(String twitterId){
        User user = new User(twitterId);
        userBase.put(twitterId, user);
        return user;
    }

    public VerifiedUser addVerifiedUser(String twitterId, Date date){
        VerifiedUser vfUser = new VerifiedUser(twitterId, date);
        userBase.put(twitterId, vfUser);
        return vfUser;
    }

    public double verifiedUsersPercentage(){
        int vfUserAmount = 0;

        for(User u: this.userBase.values()){
            if(u instanceof VerifiedUser)
                vfUserAmount++;
        }
        return ((double)vfUserAmount/this.userBase.size()) * 100;
    }

    public double tweetsMediumSize(){
        int messagesAmount = 0;
        int totalMessageLenght = 0;
        for(User u: this.userBase.values()){
            for(Tweet s: u.getTweets()){
                totalMessageLenght+=s.getMessage().length(); 
                messagesAmount++;
            }
        }
        return (double)totalMessageLenght/(double)messagesAmount;
    }
}
