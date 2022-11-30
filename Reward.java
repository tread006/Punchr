import java.text.*;
import java.time.LocalDate;

public class Reward {
    //attributes
    protected boolean available;
    protected LocalDate dateAvailable;
    protected boolean redeemed;
    protected LocalDate dateRedeemedForUse;
    protected boolean used;
    protected LocalDate dateUsed;
    protected boolean expired;
    protected LocalDate dateOfExpiration;
    protected String rewardCode;
    protected int punchesRequired;
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //For use in Driver - Copy/paste when Driver file exists
    SimpleDateFormat formatDate = 
      new SimpleDateFormat ("dd.MM.yyyy");
    //For use in Driver - Copy/paste when Driver file exists
    
    //Constructors
    
    /**
     * Welcome Reward Constructor is initialized as ACTIVE and REDEEMED
     * The Expiration Date is +60 days from the date initialized
     * Reward Code is needed immediately; Reward is give at Acct Creation
     */
    public Reward(String rewardcode)
    {
        this.description = "Welcome Reward -10%\n";

        this.setAvailable(true);
        this.setDateAvailable(LocalDate.now());

        this.setRedeemed(true);
        this.setDateRedeemedForUse(LocalDate.now());

        this.setExpired(false);
        this.setDateOfExpiration(LocalDate.now().plusDays(60));

        this.setUsed(false);
        this.setRewardCode(rewardcode);
        this.setPunchesRequired(0);
    }

    /**
     * Standard Reward Constructor is initialized with all bools=false
     * These rewards will be activated by # of Punches OR date (birthday reward)
     * Reward Code will be set upon Redemption
     */
    public Reward(int punchesrequired, String description)
    {
        this.description = description;
        this.setAvailable(false);
        this.setRedeemed(false);
        this.setExpired(false);
        this.setUsed(false);
        this.setPunchesRequired(punchesrequired);
    }


    //Getters and Setters
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        available = available;
    }
    public LocalDate getDateAvailable() {
        return dateAvailable;
    }
    public void setDateAvailable(LocalDate dateAvailable) {
        dateAvailable = dateAvailable;
    }
    public boolean isRedeemed() {
        return redeemed;
    }
    public void setRedeemed(boolean redeemed) {
        redeemed = redeemed;
    }
    public LocalDate getDateRedeemedForUse() {
        return dateRedeemedForUse;
    }
    public void setDateRedeemedForUse(LocalDate dateRedeemedForUse) {
        dateRedeemedForUse = dateRedeemedForUse;
    }
    public boolean isUsed() {
        return used;
    }
    public void setUsed(boolean used) {
        used = used;
    }
    public LocalDate getDateUsed() {
        return dateUsed;
    }
    public void setDateUsed(LocalDate dateUsed) {
        dateUsed = dateUsed;
    }
    public boolean isExpired() {
        return expired;
    }
    public void setExpired(boolean expired) {
        if (getDateOfExpiration() != null)
            expired = expired;
    }
    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }
    public void setDateOfExpiration(LocalDate dateOfExpiration) {
        dateOfExpiration = dateOfExpiration;
    }
    public String getRewardCode() {
        return rewardCode;
    }
    public void setRewardCode(String rewardCode) {
        rewardCode = rewardCode;
    }
    public int getPunchesRequired() {
        return punchesRequired;
    }
    public void setPunchesRequired(int punchesRequired) {
        punchesRequired = punchesRequired;
    }

    //methods

}


