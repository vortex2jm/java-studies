package user.domain;

import java.util.LinkedList;
import java.util.List;

import user.features.Tweet;

public class User {
    
    private List<Tweet> tweets = new LinkedList<>();
    private String twitterID;
    
    public User(String twitterID) {
        this.twitterID = twitterID;
    } 

    public String getTwitterID() {
        return twitterID;
    }

    public void addTweet(Tweet t){
        tweets.add(t);
    }

    public List<Tweet> getTweets(){
        return new LinkedList<>(tweets);
    }
}
