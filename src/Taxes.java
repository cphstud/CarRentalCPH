import java.util.List;

public class Taxes implements TaxesI{
    private String type;
    private List<Integer> prices;
    private List<Integer> limits;
    private int filter;

    public Taxes(String type, List<Integer> prices, List<Integer> limits, int filter) {
        this.type = type;
        this.prices = prices;
        this.limits = limits;
        this.filter = filter;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public List<Integer> getPrices() {
        return null;
    }

    @Override
    public List<Integer> getLimits() {
        return null;
    }

    @Override
    public int getFilter() {
        return 0;
    }
}
