package ticket;

/**
 * Created by mhan on 10/28/2016.
 * Tickets have default price which is $50.
 * Should throw exception for illegal value
 */
public class Ticket {
    protected double price;
    protected int number;

    public Ticket(int number) {
        this(number, 50); //default price is 50
    }

    public Ticket(int number, double price) {
        if(number < 1)
            throw new IllegalArgumentException("number cannot be 0 or negative");
//        if(price < 0)
//            throw new IllegalArgumentException("Price cannot be negative");
        this.number = number;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Number:" + number + ",Price:" + price;
    }
}
