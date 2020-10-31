package domain;

import java.util.List;

//Obs;Make;Model;Type;Origin;DriveTrain;MSRP;domain.Invoice;EngineSize;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Length
//11;Audi;A4 3.0 Quattro 4dr manual;Sedan;Europe;All;$33,430;$30,366;3;6;220;17;26;3583;104;179
public class Car {
    private int id;
    private String make;
    private String model;
    private Invoice invoice;
    private double MPG_City;
    private double MPG_Highway;
    private Taxes tax;

    public Car(Taxes taxes, int id, String make, String model, Invoice invoice, double MPG_City, double MPG_Highway) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.invoice = invoice;
        this.MPG_City = MPG_City;
        this.MPG_Highway = MPG_Highway;
        this.tax = taxes;
    }


    public double computeEnvTaxes() {
        List<Integer> limits = tax.getLimits();
        List<Integer> prices = tax.getPrices();
        double retValTax = prices.get(0);
        for(int i=0;i<limits.size();i++) {
            if (limits.get(i) < MPG_City && MPG_City < limits.get(i+1)) {
                retValTax = prices.get(i+1);
            }
        }
        return retValTax;
    }

    @Override
    public String toString() {
        return "domain.Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", MPG_City=" + MPG_City +
                ", MPG_Highway=" + MPG_Highway +
                '}';
    }
}
