package ecommerce;

public class BillingDetails {

    private String account;
    private String bankName;
    private User user;

    public BillingDetails(String account, String bankName, User user) {
        this.account = account;
        this.bankName = bankName;
        this.user = user;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
