//Obs;Make;Model;Type;Origin;DriveTrain;MSRP;Invoice;EngineSize;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Length
//11;Audi;A4 3.0 Quattro 4dr manual;Sedan;Europe;All;$33,430;$30,366;3;6;220;17;26;3583;104;179
public class Car {
    private int id;
    private String make;
    private String model;
    private Invoice invoice;
    private double MPG_City;
    private double MPG_Highway;

    public Car(Taxes taxes, int id, String make, String model, Invoice invoice, double MPG_City, double MPG_Highway) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.invoice = invoice;
        this.MPG_City = MPG_City;
        this.MPG_Highway = MPG_Highway;
    }


    public double computeEnvTaxes() {
        double retVal = 0.0;

        return retVal;
    }
}
