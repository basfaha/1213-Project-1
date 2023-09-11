/**
 * The PremiumMember class represents a premium member in the bookstore's
 * membership system.
 * It stores the member's name, total amount spent, and whether or not the
 * premium membership fee has been paid.
 */
public class PremiumMember {
    // Fields
    private String name;
    private double totalSpent;
    private boolean isPaid;

    /**
     * Constructor for creating a PremiumMember object with the given name, total
     * amount spent, and membership fee payment status.
     * 
     * @param name       The name of the premium member
     * @param totalSpent The total amount spent by the premium member
     * @param isPaid     A boolean value representing whether or not the premium
     *                   membership fee has been paid
     */
    public PremiumMember(String name, double totalSpent, boolean isPaid) {
        this.name = name;
        this.totalSpent = totalSpent;
        this.isPaid = true;
    }

    /**
     * Getter method for retrieving the name of the premium member.
     * 
     * @return The name of the premium member
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for updating the name of the premium member.
     * 
     * @param name The new name of the premium member
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method for updating the total amount spent by the premium member.
     * 
     * @param totalSpent The new total amount spent by the premium member
     */
    public void setTotalSpent(double totalSpent) {
        this.totalSpent = totalSpent;
    }

    /**
     * Getter method for retrieving the total amount spent by the premium member.
     * 
     * @return The total amount spent by the premium member
     */
    public double getTotalSpent() {
        return totalSpent;
    }

    /**
     * Getter method for retrieving the payment status of the premium membership
     * fee.
     * 
     * @return A boolean value representing whether or not the premium membership
     *         fee has been paid
     */
    public boolean isPaid() {
        return isPaid;
    }

    /**
     * Setter method for updating the payment status of the premium membership fee.
     * 
     * @param isPaid A boolean value representing whether or not the premium
     *               membership fee has been paid
     */
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    /**
     * Method for adding a specified amount to the total amount spent by the premium
     * member.
     * 
     * @param amount The amount to add to the total amount spent by the premium
     *               member
     */
    public void addToTotalSpent(double amount) {
        this.totalSpent += amount;
    }
}
