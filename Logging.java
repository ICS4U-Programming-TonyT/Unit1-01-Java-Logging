import java.util.Scanner;

/**

* This VolSphere programs ask the user Radius then calculates the Sphere Volume.

*

* @author  Tony Tran

* @version 1.0

* @since   2025-02-14

*/

final class Logging {
    /**
     * @exception IllegalStateException
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }


    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Displays the User the list of numbers to choose. 0.25m, 0.5 or 1m*/
        System.out.println(
                "Please choose a number from the list."
            + " The truck can only carry 1100kg \n 0.25 m, 0.5 m or 1m");
        /*Gets String Value of UserLogLength*/
        String strUserLogLength = scanner.nextLine();
        try {
            /*Converts userLogLength as a Double*/
            double userLogLength = Double.parseDouble(strUserLogLength);
            /*Checks if userLogLength is 0.25, 0.5, 1.0*/
            if (userLogLength == 0.25) {
                double truckCapacity = 1100 / (20 * userLogLength);
                /*Prints how much logs can Truck carry.*/
                System.out.printf("The Truck can carry %.0f logs.\n",
                        truckCapacity);
            } else if (userLogLength == 0.5) {
                double truckCapacity = 1100 / (20 * userLogLength);
                /*Prints how much logs can Truck carry.*/
                System.out.printf("The Truck can carry %.0f logs.\n",
                        truckCapacity);
            } else if (userLogLength == 1.0) {
                double truckCapacity = 1100 / (20 * userLogLength);
                /*Prints how much logs can Truck carry.*/
                System.out.printf("The Truck can carry %.0f logs.\n",
                        truckCapacity);
            } else {
                /*Prints error message asking user to input number from list.*/
                System.out.println(
                    "Please enter a valid number from the list.");
            }
            /*Catches if user inputs a letter.*/
        } catch (NumberFormatException error) {
            /*Gives user an error message.*/
            System.out.println("Please enter a valid number from the list. "
            + error.getMessage());
        }
    }
}
