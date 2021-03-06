public class NestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            System.out.println()
            // * You will add a line of code here.
        }

        System.out.println("\n");

    }
}
// The n Variable changes Faster
// Variable b actually prints following alphabetic order from A to E and c stays
// at 1 for each outer loop round.
// Prints like the initial Nested loop for CN
// Prints in a pair of three while creating space in between the pairs.