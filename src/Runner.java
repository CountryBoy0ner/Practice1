import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip[] georgia = new BusinessTrip[]{
                new BusinessTrip( 1220, 4, "Timur Verhkovodko"),
                new BusinessTrip( 1050, 4, "Taras Rybin"),
                null,
                new BusinessTrip( 0, 4, "Daniil Rybin"),
                new BusinessTrip()
        };

        int temp = 0;
        for (int i = 0; i < georgia.length; i++) {
            if ((georgia[i] != null) && (georgia[temp].getTotal() <= georgia[i].getTotal())) {
                temp = i;
            }
        }
        georgia[temp].show();

        georgia[4].setTransport(8);
        System.out.println("days=" + georgia[0].getDays() + georgia[1].getDays());

        for (BusinessTrip businessTrip : georgia) {
            System.out.println(businessTrip);
        }
    }
}
