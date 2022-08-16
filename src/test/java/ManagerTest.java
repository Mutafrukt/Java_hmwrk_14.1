import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    Repository repo = new Repository();
    Manager manager = new Manager(repo);

    Ticket ticket1 = new Ticket(12,10000, "DME", "ARH", 2 );
    Ticket ticket2 = new Ticket(34, 20000, "VNK", "HKT", 6);
    Ticket ticket3 = new Ticket(46, 40000, "SVO", "HAV", 12);
    Ticket ticket4 = new Ticket(7, 4000, "KRR", "AER", 1);
    Ticket ticket5 = new Ticket(845, 13000, "VAR", "CAN", 3);
    Ticket ticket6 = new Ticket(132,11000, "DME", "ARH", 2 );
    Ticket ticket7 = new Ticket(1552,9000, "DME", "ARH", 2 );
    Ticket ticket8 = new Ticket(456,5000, "DME", "KRR", 2 );


    @Test
    public void shouldFindIf3AndSort(){

        manager.save(ticket1);
        manager.save(ticket2);
        manager.save(ticket3);
        manager.save(ticket4);
        manager.save(ticket5);
        manager.save(ticket6);
        manager.save(ticket7);
        manager.save(ticket8);

        Ticket[] expected = {ticket7, ticket1, ticket6};
        Ticket[] actual = manager.searchBy("DME", "ARH");

        Assertions.assertArrayEquals(expected, actual);

    }

}
