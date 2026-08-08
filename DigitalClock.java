import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {

    public static void main(String[] args) {

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("===== DIGITAL CLOCK =====");

        while (true) {
            LocalTime time = LocalTime.now();

            System.out.print("\rCurrent Time: " + time.format(format));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\nClock stopped.");
                break;
            }
        }
    }
}
