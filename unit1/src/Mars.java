import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class Mars {
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for(int minute = 0; minute < minutesLeft; minute++){
            if (minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep Center");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        // 1. Variables and Data Types
        String colonyName = "New Vegas";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        // 2. Mathematical Operators
        meals = meals - shipPopulation*0.75;
        meals = meals - shipPopulation*0.75;
        System.out.println(meals);
        meals = meals + 0.50*meals;
        shipPopulation = shipPopulation + 5;

        // 3. Conditional Love
        String landingLocation = "The Ocean";
        if (landingLocation.equals("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        // 4. Looping Functions
        landing = landingCheck(6);
    }
}

