import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip[] georgia = new BusinessTrip[5];
        georgia[0] = new BusinessTrip(200, 120, 4, "Timur Verhkovodko");
        georgia[1] = new BusinessTrip(1220, 11, 4, "Taras Rybin");
        georgia[2] = null;
        georgia[3] = new BusinessTrip(10, 0, 4, "Daniil Rybin");
        georgia[4] = new BusinessTrip();


        int temp = 0;
        for (int i = 1; i < georgia.length; i++) {
            if (georgia[i] == null) {
                continue;
            }
            if (georgia[temp].getTotal() <= georgia[i].getTotal()) {
                temp = i;
            }
        }
        georgia[temp].show();

        georgia[4].setTransport(8);
        System.out.println("days=" + georgia[0].getDays() + georgia[1].getDays());

        System.out.println(Arrays.toString(georgia));
    }
}
