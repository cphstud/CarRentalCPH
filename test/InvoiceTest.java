import domain.Invoice;
import org.junit.Test;

import static org.junit.Assert.*;
// "$30,366"

public class InvoiceTest {

    @Test
    public void getPriceFromStringTest() {
        String input = "$30,366";
        Invoice invoice = new Invoice(input);
        int expected = 30366;
        int actual = invoice.getInvoiceNumber();
        assertEquals(expected,actual);
    }

}