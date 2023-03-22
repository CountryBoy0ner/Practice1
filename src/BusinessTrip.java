import java.util.ArrayList;
import java.util.List;

public class BusinessTrip {

    private final static int rate = 3070;
    private int transport;
    private int days;
    private String account;


    public BusinessTrip( int transport, int days, String account) {
        this.transport = transport;
        this.days = days;
        this.account = account;
    }

    public BusinessTrip() {
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
        return this.transport + this.days * rate;
    }

    public void show() {
        System.out.println("rate =" + separateMoney(rate) + "\n" + "account =" + getAccount() + "\n" + "transport =" + separateMoney(getTransport()) + "\n" + "days =" + getDays() + "\n" + "total =" + separateMoney(getTotal()));
    }

    public String toString() {
        return String.format("%s; %s; %d; %s", account, separateMoney(transport),days,separateMoney(getTotal()));
    }


    public String separateMoney(int number) {
        int euros = number / 100;
        int cents = number-euros*100;
        if (cents<10){
            return String.format("%s.%s%s", euros, 0, cents);
        }
        return String.format("%s.%s", euros, cents);
    }
}
