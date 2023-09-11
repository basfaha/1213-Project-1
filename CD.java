/**
 * The CD class represents a CD in a music store.
 */
public class CD {
    // Fields
    private String artist;
    private String name;
    private double price;
    private int quantity;
    private int numInCart;

    /**
     * Constructs a CD object with a given name, artist, price, quantity, and number
     * in cart.
     * 
     * @param name      the name of the CD
     * @param artist    the artist of the CD
     * @param price     the price of the CD
     * @param quantity  the quantity of the CD in stock
     * @param numInCart the number of the CD in the customer's cart
     */
    public CD(String name, String artist, double price, int quantity, int numInCart) {
        this.artist = artist;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.numInCart = numInCart;
    }

    // Getter and Setter methods
    /**
     * Returns the artist of the CD.
     * 
     * @return the artist of the CD
     */
    public String getArtist() {
        return this.artist;
    }

    /**
     * Sets the artist of the CD.
     * 
     * @param artist the new artist of the CD
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Returns the name of the CD.
     * 
     * @return the name of the CD
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the CD.
     * 
     * @param name the new name of the CD
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the price of the CD.
     * 
     * @return the price of the CD
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets the price of the CD.
     * 
     * @param price the new price of the CD
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the quantity of the CD in stock.
     * 
     * @return the quantity of the CD in stock
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Sets the quantity of the CD in stock.
     * 
     * @param quantity the new quantity of the CD in stock
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Returns the number of the CD in the cart.
     * 
     * @return the number of the CD in the cart
     */
    public int getNumInCart() {
        return this.numInCart;
    }

    /**
     * Sets the number of the CD in the cart.
     * 
     * @param numInCart the new number of the CD in the cart
     */
    public void setNumInCart(int numInCart) {
        this.numInCart = numInCart;
    }

    // To String method to print CD in Stock
    public void CDCart() {
        System.out.println("Book record : " + name);
        System.out.println("Artist " + artist);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

}
