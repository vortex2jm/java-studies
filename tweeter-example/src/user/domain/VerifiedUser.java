package user.domain;

import java.util.Date;

public class VerifiedUser extends User{

    private Date date;
    
    public VerifiedUser(String twitterID, Date date) {
        super(twitterID);
        this.date = date;
    }
    
    public Date getDate() {
        return date;
    }    
}
