/**
 * The DVD class represents a DVD in a movie store.
 */
public class DVD {
    // Fields
    private String director;
    private String name;
    private double price;
    private int quantity;
    private int numInCart;

    /**
     * Constructs a DVD object with a given name, director, price, quantity and
     * number in cart.
     * 
     * @param name      the name of the DVD
     * @param director  the director of the DVD
     * @param price     the price of the DVD
     * @param quantity  the quantity of the DVD in stock
     * @param numInCart the number of the DVD in the shopping cart
     */
    public DVD(String name, String director, double price, int quantity, int numInCart) {
        this.director = director;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.numInCart = numInCart;
    }

    // Getter and Setter methods
    /**
     * Returns the director of the DVD.
     * 
     * @return the director of the DVD
     */
    public String getDirector() {
        return this.director;
    }

    /**
     * Sets the director of the DVD.
     * 
     * @param director the director of the DVD
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Returns the name of the DVD.
     * 
     * @return the name of the DVD
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the DVD.
     * 
     * @param name the name of the DVD
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the price of the DVD.
     * 
     * @return the price of the DVD
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets the price of the DVD.
     * 
     * @param price the price of the DVD
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the quantity of the DVD.
     * 
     * @return the quantity of the DVD
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Sets the quantity of the DVD.
     * 
     * @param quantity the quantity of the DVD
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Returns the number of DVDs in the cart.
     * 
     * @return the number of DVDs in the cart
     */
    public int getNumInCart() {
        return this.numInCart;
    }

    /**
     * Sets the number of DVDs in the cart.
     *
     * @param numInCart the number of DVDs in the cart
     */
    public void setNumInCart(int numInCart) {
        this.numInCart = numInCart;
    }

    /**
     * Prints the DVD's information in the cart.
     */
    public void DVDCart() {
        System.out.println("DVD movie : " + name);
        System.out.println("Director " + director);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
