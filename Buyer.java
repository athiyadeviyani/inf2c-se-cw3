package auctionhouse;

public class Buyer extends User {
    
    public String bankAuthCode;
    
    public Buyer(String name, String address, String bankAccount, String bankAuthCode) {
        super(name, address, bankAccount);
        this.bankAuthCode = bankAuthCode;
    }

    public String getAuthCode() {
        return bankAuthCode;
    }
    

}
