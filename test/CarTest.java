import org.junit.Test;
//Data: Obs;Make;Model;Type;Origin;DriveTrain;MSRP;Invoice;EngineSize;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Length
//11;Audi;A4 3.0 Quattro 4dr manual;Sedan;Europe;All;$33,430;$30,366;3;6;220;17;26;3583;104;179

//Userstory: Som PO vil jeg gerne kunne se en beregning af enhedsprisen for en given bil baseret på
// 1) afskrivningen af dens indkøbspris og 2) miljøafgiften
// task1: lav en bil med de rette attributter
// task2: lav en miljøberegner som kan injiceres i bilen

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void createCarWithAttr() {
        //Car car = new Car(11,"Audi","A4 3.0 Quattro 4dr manual","$30,366",17,26);
        Car car = null;
        assertNotNull(car);
    }

}