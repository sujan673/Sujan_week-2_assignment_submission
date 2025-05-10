class VoteEligibilityChecker {
     String name;
     int age;
     boolean isCitizen;

    public VoteEligibilityChecker(String name, int age, boolean isCitizen) {
        this.name = name;
        this.age = age;
        this.isCitizen = isCitizen;
    }

    public boolean isEligibleToVote() {
        // Using logical AND (&&) operator
        return age >= 18 && isCitizen;
    }

    public void displayEligibility() {
        System.out.println("Name: " + name);
        if (isEligibleToVote()) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        // Create some person objects
        VoteEligibilityChecker p1 = new   VoteEligibilityChecker("Ram", 20, true);
        VoteEligibilityChecker p2 = new   VoteEligibilityChecker("Elina", 16, true);
        VoteEligibilityChecker p3 = new   VoteEligibilityChecker("Ravi", 25, false);

        // Check eligibility
        p1.displayEligibility();
        System.out.println();

        p2.displayEligibility();
        System.out.println();

        p3.displayEligibility();
    }
}
