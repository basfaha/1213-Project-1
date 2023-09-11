import java.util.Scanner;

/**
 * This class provides a simple text-based user interface for the BookStore
 * class.
 * The user can make purchases, register for membership, pay the membership fee,
 * and exit the program.
 */
public class TestHarness {

    /**
     * The main method that runs the test harness and provides the user interface.
     * 
     * @param args An array of command-line arguments for the program
     */
    public static void main(String[] args) {
        // Creates a scanner object
        boolean didExit = false;
        Scanner sc = new Scanner(System.in);
        BookStore store = new BookStore();
        System.out.println("*****************************************************************************");
        System.out.println("_______________________________ WELCOME TO BOOK-LAND ___________________________");
        System.out.println("Hello! How can I help you today?" +
                " Choose one of the following options: ");
        while (!didExit) {
            System.out.println("Select from the following options:");
            System.out.println("    1. Make a Purchase");
            System.out.println("    2. Membership Registration");
            System.out.println("    3. Pay the Premium Membership Fee");
            System.out.println("    4. Exit");
            System.out.println("******************************************");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    store.makePurchase();
                    break;
                case 2:
                    store.registerNewMember();
                    break;
                case 3:
                    // Currently not implemented
                    break;
                case 4:
                    didExit = true;
                    break;
            }
        }
    }
}
