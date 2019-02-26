package model;

public class TTC {


    public TTC() {
    }

    private Integer sightRange;
    private String stockAvailability;
    private String  opticsAvailability;
    private String carry;



    public Integer getSightRange() {
        return sightRange;
    }

    public void setSightRange(Integer sightRange) {
        this.sightRange = sightRange;
    }

    public String getStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(String stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public String getOpticsAvailability() {
        return opticsAvailability;
    }

    public void setOpticsAvailability(String opticsAvailability) {
        this.opticsAvailability = opticsAvailability;
    }

    public String getCarry() {
        return carry;
    }

    public void setCarry(String carry) {
        this.carry = carry;
    }

    @Override
    public String toString() {
        return "model.TTC{" + "sightRange=" + sightRange + ", stockAvailability=" + stockAvailability + ", opticsAvailability=" + opticsAvailability + ", carry=" + carry + "}";
    }
}
