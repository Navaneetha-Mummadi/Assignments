package myassignment;

public class Assignment10 {
    public static void main(String[] args) {
        // Check if user gave input
        if (args.length != 1) {
            System.out.println("Please provide the number of eggs as a command-line argument.");
            return;
        }

        // Parse the input
        int totalEggs = Integer.parseInt(args[0]);

        // 1 gross = 144 eggs
        int gross = totalEggs / 144;
        int remainingAfterGross = totalEggs % 144;

        // 1 dozen = 12 eggs
        int dozen = remainingAfterGross / 12;
        int leftover = remainingAfterGross % 12;

        // Display the result
        System.out.println("Your number of eggs is " + gross + " gross, " +
                           dozen + " dozen, and " + leftover);
    }
}


//Your number of eggs is 9 gross, 3 dozen, and 10

