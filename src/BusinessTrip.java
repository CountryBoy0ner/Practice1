public class BusinessTrip {

    private int rate;
    private int transport;
    private int days;
    private String account;



    public BusinessTrip(int rate, int transport, int days, String account) {
        this.rate = rate;
        this.transport = transport;
        this.days = days;
        this.account = account;
    }
    public BusinessTrip() {
    }

    public int getRate() {
        return rate;
    }

    public int getTransport() {
        return transport;
    }

    public int getDays() {
        return days;
    }

    public String getAccount() {
        return account;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTotal() {
        return getTransport() + getDays() * getRate();
    }

    public void show() {
        System.out.println("rate =" + getRate() + "\n" + "account =" + getAccount() + "\n" + "transport =" + getTransport() + "\n" + "days =" + getDays() + "\n" + "total =" + getTotal());
    }

    public String toString() {
        return rate + ";" + transport + ";" + days + ";" + account;

    }
}
