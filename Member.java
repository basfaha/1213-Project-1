/**
 * The Member class represents a member in a book store.
 */
public class Member {
    // Fields
    private String name;
    private double totalSpent;

    /**
     * Constructs a Member object with a given name and total spent amount.
     * 
     * @param name       the name of the member
     * @param totalSpent the total amount spent by the member
     */
    public Member(String name, double totalSpent) {
        this.name = name;
        this.totalSpent = totalSpent;
    }

    /**
     * Constructs a Member object with a given name and total spent amount of 0.
     * 
     * @param name the name of the member
     */
    public Member(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the member.
     * 
     * @return the name of the member
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the total amount spent by the member.
     * 
     * @return the total amount spent by the member
     */
    public double getTotalSpent() {
        return totalSpent;
    }

    /**
     * Sets the total amount spent by the member.
     * 
     * @param totSpent the new total amount spent by the member
     */
    public void setTotalSpent(double totSpent) {
        this.totalSpent = totSpent;
    }

    /**
     * Adds to the member's total spent amount.
     * 
     * @param amount the amount to add to the member's total spent
     */
    public void addToTotalSpent(double amount) {
        this.totalSpent += amount;
    }

    /**
     * Prints information about the member, including their name and total spent
     * amount.
     */
    public void allMembers() {
        System.out.println("The member " + name + " have spent " + totalSpent + "$.");
    }

}