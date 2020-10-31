import domain.Taxes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TaxesTest {

    @Test
    public void getLimits() {
        int[] limits = new int[]{0, 5, 10, 15, 20};
        int[] prices = new int[]{10470, 5500, 2340, 1050, 330};
        Taxes taxes = new Taxes("benzin",toList(prices),toList(limits),1000);
    }

    public List<Integer> toList(int[] ints) {
        List<Integer> intList = new ArrayList<Integer>(ints.length);
        for (int i : ints) {
            intList.add(i);
        }
        return intList;
    }
}