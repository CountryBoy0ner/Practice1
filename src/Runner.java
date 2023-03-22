import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip[] businessTrips = new BusinessTrip[]{
                new BusinessTrip(1220, 4, "Timur Verhkovodko"),
                new BusinessTrip(1050, 4, "Taras Rybin"),
                null,
                new BusinessTrip(0, 4, "Daniil Rybin"),
                new BusinessTrip()
        };
        int  maxTotal=0 ;
         BusinessTrip temp = null ;

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null && maxTotal < businessTrip.getTotal()) {
                maxTotal = businessTrip.getTotal();
                temp = businessTrip;
            }
        }

        businessTrips[4].setTransport(8);
        System.out.println("days=" + businessTrips[0].getDays() + businessTrips[1].getDays());

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                businessTrip.show();
            }
        }
    }
}
