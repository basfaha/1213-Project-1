import java.util.*;
import java.util.ArrayList;

/**
 * A class representing a bookstore that sells books, CDs, and DVDs to members.
 */
public class BookStore {
    // Fields
    private ArrayList<Book> books = new ArrayList<>(); // ArrayList of books
    private ArrayList<CD> cds; // ArrayList of CDs
    private ArrayList<DVD> dvds; // ArrayList of DVDs
    private ArrayList<Member> members; // ArrayList of members
    private ArrayList<PremiumMember> premiumMembers; // ArrayList of premium members
    private int numInCart = 0;

    /**
     * Constructs a new BookStore object.
     */
    public BookStore() { // Initializes all ArrayLists
        cds = new ArrayList<>();
        dvds = new ArrayList<>();
        members = new ArrayList<>();
        premiumMembers = new ArrayList<>();

        members.add(new Member("John Doe", 20));
        premiumMembers.add(new PremiumMember("John Doe", 20, false));

        // Products in stock
        books.add(new Book("Charlotte's Web", "K.B White", 10.99, 1, 1));
        books.add(new Book("Lord of the Rings", "J.R.R Tolkien", 12.99, 10, 2));
        cds.add(new CD("How to be a Human Being", "Glass Animals", 10.99, 10, 3));
        cds.add(new CD("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 13.49, 10, 4));
        dvds.add(new DVD("The ShawShank Redemption", "Frank Darabont", 20.99, 10, 5));
        dvds.add(new DVD("Puss in Boots: The Last Wish", "Joel Crawford", 17.39, 10, 6));

    }

    // Getter and Setter methods
    public ArrayList<Book> getBooks() { // Returns ArrayList of books
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) { // Sets ArrayList of books
        this.books = books;
    }

    public ArrayList<CD> getCds() { // Returns ArrayList of CDs
        return this.cds;
    }

    public void setCds(ArrayList<CD> cds) { // Sets ArrayList of CDs
        this.cds = cds;
    }

    public ArrayList<DVD> getDvds() { // Returns ArrayList of DVDs
        return this.dvds;
    }

    public void setDvds(ArrayList<DVD> dvds) { // Sets ArrayList of DVDs
        this.dvds = dvds;
    }

    public ArrayList<Member> getMembers() { // Returns ArrayList of members
        return this.members;
    }

    public void setMembers(ArrayList<Member> members) { // Sets ArrayList of members
        this.members = members;
    }

    public ArrayList<PremiumMember> getPremiumMembers() { // Returns ArrayList of premium members
        return this.premiumMembers;
    }

    public void setPremiumMembers(ArrayList<PremiumMember> premiumMembers) { // Sets ArrayList of premium members
        this.premiumMembers = premiumMembers;
    }

    /**
     * Method to add a regular member to the ArrayList of members
     * 
     * @param member The Member object to add to the ArrayList
     */
    public void addMember(Member member) {
        members.add(member);
    }

    // Method to add a premium member to the ArrayList of premium members
    public void addPremiumMember(PremiumMember premiumMember) {
        premiumMembers.add(premiumMember);
    }

    // Method to list all available items in the store
    public void listMenu() {
        // Loops through ArrayList of books
        for (int i = 0; i < this.getBooks().size(); i++) {
            Book book = this.getBooks().get(i);
            System.out.println((i + 1) + ". " + book.getName() + " by " + book.getAuthor() + ": BOOK");
        }
        // Loops through ArrayList of CDs
        for (int i = 0; i < this.getCds().size(); i++) {
            CD cd = this.getCds().get(i);
            System.out
                    .println((i + 1 + this.getBooks().size()) + ". " + cd.getName() + " by " + cd.getArtist() + ": CD");
        }
        // Loops through ArrayList of DVDs
        for (int i = 0; i < this.getDvds().size(); i++) {
            DVD dvd = this.getDvds().get(i);
            System.out.println((i + 1 + this.getBooks().size() + this.getCds().size()) + ". " + dvd.getName() + " by "
                    + dvd.getDirector() + ": DVD");
        }
    }

    /**
     * Prompts the user to select an item to purchase, adds it to the cart, and
     * proceeds to checkout if desired.
     */
    public void makePurchase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which of the following would you like to purchase?");
        System.out.println("");
        this.listMenu();
        int itemSell = sc.nextInt();
        this.addToCart(itemSell);
        System.out.println("Will that be all?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int isDone = sc.nextInt();
        if (isDone == 2) {
            makePurchase();
            System.out.println("");
            System.out.println("Put in the number beside the product you want to purchase");
        } else {
            if (numInCart > 0) {
                cartCheckout();
            }
        }

    }

    /**
     * Calculates the total cost of the items in the cart and prompts the member to
     * complete the purchase.
     */
    public void cartCheckout() {
        double total = 0;
        for (Book book : this.getBooks()) {
            total += book.getPrice() * book.getNumInCart();
        }

        for (CD cd : this.getCds()) {
            total += cd.getPrice() * cd.getNumInCart();
        }

        for (DVD dvd : this.getDvds()) {
            total += dvd.getPrice() * dvd.getNumInCart();
        }

        System.out.println("Your total amount comes to " + total + "$");
        System.out.println("");
        this.memberPurchase(total);
    }

    public void addToCart(int itemSell) {
        if (itemSell <= this.getBooks().size()) {
            int index = itemSell - 1;
            Book book = this.getBooks().get(index);
            if (book.getQuantity() <= 0) {
                System.out.println("Book out of stock!");
            }
            if ((book.getNumInCart() + 1) > book.getQuantity()) {
                System.out.println("I'm sorry! You have chosen all the Books in stock.");
            }
            book.setNumInCart(book.getNumInCart() + 1);
            numInCart++;
        } else if (itemSell <= this.getBooks().size() + this.getCds().size()) {
            int index = itemSell - 1 - this.getBooks().size();
            CD cd = this.getCds().get(index);
            if (cd.getQuantity() <= 0) {
                System.out.println("cds out of stock!");
            }
            if ((cd.getNumInCart() + 1) > cd.getQuantity()) {
                System.out.println("I'm sorry! You have chosen all the Cd's in stock.");
            }
            cd.setNumInCart(cd.getNumInCart() + 1);
            numInCart++;
        } else {
            int index = itemSell - 1 - this.getBooks().size() - this.getCds().size();
            DVD dvd = this.getDvds().get(index);
            if (dvd.getQuantity() <= 0) {
                System.out.println("DVD's out of stock!");
            }
            if ((dvd.getNumInCart() + 1) > dvd.getQuantity()) {
                System.out.println("I'm sorry! You have chosen all the DVD's in stock.");
            }
            dvd.setNumInCart(dvd.getNumInCart() + 1);
            numInCart++;
        }

        System.out.println("You have " + numInCart + " products in your cart");

    }

    public void memberPurchase(double total) {
        System.out.println("Which member is buying today?");
        System.out.println("");
        System.out.println("Normal Members: ");
        for (int i = 0; i < getMembers().size(); i++) {
            Member member = this.getMembers().get(i);
            System.out.println((i + 1) + ". " + member.getName());
        }
        System.out.println("");
        System.out.println("Premium Members: ");
        for (int i = 0; i < getPremiumMembers().size(); i++) {
            PremiumMember premiumMember = this.getPremiumMembers().get(i);
            System.out.println((i + 1 + getMembers().size()) + ". " + premiumMember.getName());
        }
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s <= this.getMembers().size()) {
            int index = s - 1;
            Member member = this.getMembers().get(index);
            member.setTotalSpent(member.getTotalSpent() + total);
            System.out.println("");
            System.out.println("Total lifetime: " + member.getTotalSpent() + "$");
        } else if (s <= this.getPremiumMembers().size()) {
            int index = s - 1 - getMembers().size();
            PremiumMember premiumMember = this.getPremiumMembers().get(index);
            premiumMember.setTotalSpent(premiumMember.getTotalSpent() + total);
            System.out.println("");
            System.out.println("Total lifetime: " + premiumMember.getTotalSpent() + "$");
        }

    }

    public void registerNewMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("What is your last name?");
        String name = sc.nextLine();
        Member newMember = new Member(name);
        System.out.println("");
        members.add(newMember);
        System.out.println("New member " + name + " registered successfully!");
        System.out.println("**********************************************");
        System.out.println("");

    }

}