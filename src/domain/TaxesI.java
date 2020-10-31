package domain;

import java.util.List;

public interface TaxesI {
    public String getType();
    public List<Integer> getPrices();
    public List<Integer> getLimits();
    public int getFilter();
}
