/**
 * This class represents a book that can be sold in a bookstore.
 */
public class Book {
    // Fields
    private String author;
    private String name;
    private double price;
    private int quantity;
    private int numInCart;

    /**
     * Constructor with parameters for the Book class.
     * 
     * @param name      the name of the book
     * @param author    the author of the book
     * @param price     the price of the book
     * @param quantity  the quantity of the book in stock
     * @param numInCart the number of the book in the customer's cart
     */
    public Book(String name, String author, double price, int quantity, int numInCart) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.numInCart = numInCart;
    }

    /**
     * Getter method for the author of the book.
     * 
     * @return the author of the book
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Setter method for the author of the book.
     * 
     * @param author the author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Getter method for the name of the book.
     * 
     * @return the name of the book
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for the name of the book.
     * 
     * @param name the name of the book
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for the price of the book.
     * 
     * @return the price of the book
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Setter method for the price of the book.
     * 
     * @param price the price of the book
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Getter method for the quantity of the book in stock.
     * 
     * @return the quantity of the book in stock
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Setter method for the quantity of the book in stock.
     * 
     * @param quantity the quantity of the book in stock
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter method for the number of the book in the customer's cart.
     * 
     * @return the number of the book in the customer's cart
     */
    public int getNumInCart() {
        return this.numInCart;
    }

    /**
     * Setter method for the number of the book in the customer's cart.
     * 
     * @param numInCart the number of the book in the customer's cart
     */
    public void setNumInCart(int numInCart) {
        this.numInCart = numInCart;
    }

    /**
     * Method to print information about the book, including its name, author,
     * price, and quantity in stock.
     */
    public void BookCart() {
        System.out.println("Book name : " + name);
        System.out.println("Author:     " + author);
        System.out.println("Price:      " + price);
        System.out.println("Quantity:   " + quantity);
    }

}
