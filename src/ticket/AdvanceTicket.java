package ticket;

/**
 * Created by mhan on 12/3/2016.
 * Advance tickets purchased 10 or more days before the event
 *   has 40% discount than Ticket,
 *   and advance tickets purchased fewer than 10 days before the event has 20% discount.
 */
public class AdvanceTicket extends Ticket{

    public AdvanceTicket(int number, int daysAdvanced) {
        this(number, 50, daysAdvanced);
    }

    public AdvanceTicket(int number, double price, int daysAdvanced){
        super(number, price);
        if (daysAdvanced >= 10) {
            this.price *= 0.6;
        } else if (daysAdvanced >= 1) {
            this.price *= 0.8;
        }
    }

    @Override
    public String toString() {
        return "ticket.Ticket Type: Advanced," + super.toString();
    }
}
