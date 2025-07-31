package myassignment;


public class Assignment27 {

    // Define an enum for paper currencies
    enum Currency {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {

        // Loop through enum values and use switch
        for (Currency note : Currency.values()) {
            System.out.println("Currency: " + note);

            switch (note) {
                case ONE:
                    System.out.println("→ ₹1 note is rarely used and is mostly a coin now.");
                    break;
                case FIVE:
                    System.out.println("→ ₹5 note is small and green-colored.");
                    break;
                case TEN:
                    System.out.println("→ ₹10 note is commonly used and light brown.");
                    break;
                case TWENTY:
                    System.out.println("→ ₹20 note is yellowish and compact.");
                    break;
                case FIFTY:
                    System.out.println("→ ₹50 note is purple and used frequently.");
                    break;
                case HUNDRED:
                    System.out.println("→ ₹100 note is blue and widely accepted.");
                    break;
                default:
                    System.out.println("→ Unknown currency.");
            }

            System.out.println(); // for spacing
        }
    }
}
/*
Currency: ONE
→ ₹1 note is rarely used and is mostly a coin now.

Currency: FIVE
→ ₹5 note is small and green-colored.

Currency: TEN
→ ₹10 note is commonly used and light brown.

Currency: TWENTY
→ ₹20 note is yellowish and compact.

Currency: FIFTY
→ ₹50 note is purple and used frequently.

Currency: HUNDRED
→ ₹100 note is blue and widely accepted.

*/