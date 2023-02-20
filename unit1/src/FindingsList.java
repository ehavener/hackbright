import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("\n Trip complete!");
        ArrayList<String> findings = new ArrayList<>();
        System.out.println("Finding list updated with rock data.");
        findings.add("rock");
        findings.add("shiny rock");
        findings.add("light rock");
        findings.add("not rock");
        System.out.println(findings);
        System.out.println("Removing non-rock item...");
        findings.remove("not rock");
        System.out.println(findings);

        System.out.println("Updating findings list with fossil data. Please wait...");
        Thread.sleep(1000);
        HashMap<String, String> fossilFindings = new HashMap<>();
        fossilFindings.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilFindings.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilFindings.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Which fossil would you like to examine?");
        System.out.println("Bird Fossil, Fish Fossil, or Tooth Fossil?");
        Scanner scanner = new Scanner(System.in);
        String fossil = scanner.nextLine();
        if (fossil.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossil + "\nDescription: " + fossilFindings.get("Bird Fossil"));
        } else if (fossil.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossil + "\nDescription: " + fossilFindings.get("Fish Fossil"));
        } else if (fossil.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossil + "\nDescription: " + fossilFindings.get("Tooth Fossil"));
        }

        System.out.println("Updating special supplies list. Please wait...");
        Thread.sleep(700);
        HashSet<String> specialFindings = new HashSet<>();
        specialFindings.add("First-aid Kit");
        specialFindings.add("Water bottle");
        specialFindings.add("Tablet");
        System.out.println("Supplies before expedition: ");
        Iterator itr = specialFindings.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        specialFindings.remove("Water bottle");
        System.out.println("Supplies after expedition: ");
        itr = specialFindings.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Findings report complete. Exiting application. Goodbye!");
    }
}
