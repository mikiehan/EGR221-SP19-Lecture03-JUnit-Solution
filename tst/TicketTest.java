import org.junit.Assert;
import org.junit.Test;
import ticket.AdvanceTicket;
import ticket.Ticket;

public class TicketTest {

    /**
     * Testing whether default price is 50 for Ticket
     */
    @Test
    public void test1(){
        Ticket t1 = new Ticket(111);
        Assert.assertTrue(t1.getPrice() == 50);
    }

    /**
     * Testing whether Ticket constructor throws an exception for
     * invalid price
     */
    @Test
    public void test2(){
        try {
            Ticket t1 = new Ticket(111, -50);
            Assert.fail("The code should never ever execute here");
        }catch (IllegalArgumentException ex){
            System.out.println("IllegalArgumentException thrown " +
                               ex.getMessage());
        }
    }

    /**
     * Testing advanced ticket that is purchased 10 days or more
     * before the event. It should have 40% discount
     */
    @Test
    public void test3(){
        double regularPrice = 70;
        AdvanceTicket t = new AdvanceTicket(111, regularPrice , 10);
        Assert.assertTrue("advanced ticket should have 40% discount",
                t.getPrice() == regularPrice * 0.6);
    }

    /**
     * Testing advanced ticket that is purchased less than 10 days
     * before the event. It should have 20% discount
     */
    @Test
    public void test4(){
        double regularPrice = 70;
        AdvanceTicket t = new AdvanceTicket(111, regularPrice , 8);
        Assert.assertTrue("advanced ticket should have 20% discount",
                t.getPrice() == regularPrice * 0.8);
    }

    /**
     * Testing advanced ticket that is purchased the same day of the event
     * do not get the discount
     */
    @Test
    public void test5(){
        double regularPrice = 70;
        AdvanceTicket t = new AdvanceTicket(111, regularPrice , 0);
        Assert.assertTrue("advanced ticket should have no discount",
                t.getPrice() == regularPrice);
    }
}


















//import org.junit.Assert;
//import org.junit.Test;
//import ticket.Ticket;
//
//public class TicketTest {
////    //Testing the default price of Ticket
////    @Test
////    public void test1(){
////        Ticket t1 = new Ticket(111);
////        Assert.assertTrue("default price should be 50",
////                           t1.getPrice() == 50);
////    }
////
////    //Negative test of constructor
////    //check whether this really throws the IllegalArgumentException
////    @Test
////    public void test2(){
////        try {
////            Ticket t1 = new Ticket(-111);
////            Assert.fail(); //If we reach to this line that means
////            // Ticket didn't throw the exception
////        } catch (IllegalArgumentException e){
////            System.out.println("IllegalArgumentException happened!" +
////                    e.getMessage());
////        }
////    }
//}
