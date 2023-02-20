import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {
        System.out.println("    #####################");
        System.out.println("   #######################");
        System.out.println("  #########################");
        System.out.println(" ###########################");
        System.out.println("#############################");
        System.out.println("WELCOME TO MARS EXPEDITION!!!");
        System.out.println("#############################");
        System.out.println(" ###########################");
        System.out.println("   #######################");
        System.out.println("    #####################");
        System.out.println("     ###################");

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hi, " + name + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String ready = scanner.nextLine();
        if (ready.equals("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people are in your team?");
        int numPeople = scanner.nextInt();
        if (numPeople > 2) {
            System.out.println("We can send at most 3 people in total.");
            numPeople = 2;
        } else if (numPeople < 2) {
            System.out.println("We want to send 3 people including yourself.");
        } else {
            System.out.println("Acknowledged.");
        }
        scanner.nextLine();

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = scanner.nextLine();
        System.out.println("You have chosen to bring " + snack);

        System.out.println("Select a vehicle for your journey: ");
        System.out.println("A: Mars Rover");
        System.out.println("B: Land Rover");
        System.out.println("C: E-bike with sidecar");

        String vehicleChoice = scanner.nextLine();
        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "Land Rover";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "E-bike with sidecar";
        } else {
            vehicleChoice = "your feet";
        }

        System.out.println("Your journey will begin shortly, " + name + ".");
        System.out.println("You will traveling in a " + vehicleChoice + " with " + numPeople + " other people.");
        System.out.println("You will be bringing " + snack + " with you.");
        System.out.println("Good luck!");
    }


}
