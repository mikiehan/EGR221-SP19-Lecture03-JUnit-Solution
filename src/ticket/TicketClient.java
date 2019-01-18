package ticket;

import java.util.Random;

/**
 *
 * Created by mhan on 10/28/2016.
 */
public class TicketClient {
    public static void main(String[] args){
        Random rand = new Random();

        Ticket ticket1 = new Ticket(rand.nextInt(100));
        Ticket ticket2 = new Ticket(rand.nextInt(100), 60.0);
        System.out.println(ticket1);
        System.out.println(ticket2);

        AdvanceTicket advTicket1 = new AdvanceTicket(rand.nextInt(100), 50);
        AdvanceTicket advTicket2 = new AdvanceTicket(rand.nextInt(100), 5);

        AdvanceTicket advTicket3 = new AdvanceTicket(rand.nextInt(100), 60.0, 50);
        AdvanceTicket advTicket4 = new AdvanceTicket(rand.nextInt(100), 60.0, 5);

        System.out.println(advTicket1);
        System.out.println(advTicket2);
        System.out.println(advTicket3);
        System.out.println(advTicket4);
    }
}
