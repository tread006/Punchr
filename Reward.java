import java.text.*;
import java.time.LocalDate;

public class Reward {
    //attributes
    protected boolean Available;
    protected LocalDate DateAvailable;
    protected boolean Redeemed;
    protected LocalDate DateRedeemedForUse;
    protected boolean Used;
    protected LocalDate DateUsed;
    protected boolean Expired;
    protected LocalDate DateOfExpiration;
    protected String RewardCode;
    protected int PunchesRequired;
    protected String description;

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
        return Available;
    }
    public void setAvailable(boolean available) {
        Available = available;
    }
    public LocalDate getDateAvailable() {
        return DateAvailable;
    }
    public void setDateAvailable(LocalDate dateAvailable) {
        DateAvailable = dateAvailable;
    }
    public boolean isRedeemed() {
        return Redeemed;
    }
    public void setRedeemed(boolean redeemed) {
        Redeemed = redeemed;
    }
    public LocalDate getDateRedeemedForUse() {
        return DateRedeemedForUse;
    }
    public void setDateRedeemedForUse(LocalDate dateRedeemedForUse) {
        DateRedeemedForUse = dateRedeemedForUse;
    }
    public boolean isUsed() {
        return Used;
    }
    public void setUsed(boolean used) {
        Used = used;
    }
    public LocalDate getDateUsed() {
        return DateUsed;
    }
    public void setDateUsed(LocalDate dateUsed) {
        DateUsed = dateUsed;
    }
    public boolean isExpired() {
        return Expired;
    }
    public void setExpired(boolean expired) {
        if (getDateOfExpiration() != null)
            Expired = expired;
    }
    public LocalDate getDateOfExpiration() {
        return DateOfExpiration;
    }
    public void setDateOfExpiration(LocalDate dateOfExpiration) {
        DateOfExpiration = dateOfExpiration;
    }
    public String getRewardCode() {
        return RewardCode;
    }
    public void setRewardCode(String rewardCode) {
        RewardCode = rewardCode;
    }
    public int getPunchesRequired() {
        return PunchesRequired;
    }
    public void setPunchesRequired(int punchesRequired) {
        PunchesRequired = punchesRequired;
    }

}


