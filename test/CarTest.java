import org.junit.Before;
import org.junit.Test;
//Data: Obs;Make;Model;Type;Origin;DriveTrain;MSRP;Invoice;EngineSize;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Length
//11;Audi;A4 3.0 Quattro 4dr manual;Sedan;Europe;All;$33,430;$30,366;3;6;220;17;26;3583;104;179
//  case "benzin": tmpInt = new int[]{10470, 5500, 2340, 1050, 330};
//  case "diesel": tmpInt = new int[]{25730, 8270, 4190, 2440, 460};
//  case "benzin": return toList(new int[]{0, 5, 10, 15, 20});


//Userstory: Som PO vil jeg gerne kunne se en beregning af enhedsprisen for en given bil baseret på
// 1) afskrivningen af dens indkøbspris og 2) miljøafgiften
// task1: lav en bil med de rette attributter
// task2: lav en miljøberegner som kan injiceres i bilen
// task2.1: find miljødata

import static org.junit.Assert.*;

public class CarTest {
    Invoice invoice;
    Car car;
    @Before
    public void setup(){
        invoice = new Invoice("$30,366");
        car = new Car(11,"Audi","A4 3.0 Quattro 4dr manual",invoice,17,26);
    }
    @Test
    public void createCarWithAttr() {
        Car car = new Car(11,"Audi","A4 3.0 Quattro 4dr manual",invoice,17,26);
        //Car car = new Car(11,"Audi","A4 3.0 Quattro 4dr manual","$30,366",17,26);
        //Car car = null;
        assertNotNull(car);
    }

    @Test
    public void computeEnvTaxesTest(){
        // 17 * 0.43 = 7.31
        double expected = 5500.0;
        double actual = car.computeEnvTaxes();
        assertEquals(expected,actual,0.0000001);
    }
}