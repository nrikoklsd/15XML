package model;

public class Gun {
    private String model;
    private Integer handy;
    private String origin;
    private String material;
    private TTC ttc;


    public Gun() {
    }


    public Gun(String model, Integer handy, String origin, String material, TTC ttc) {
        this.model = model;
        this.handy = handy;
        this.origin = origin;
        this.material = material;
        this.ttc = ttc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHandy() {
        return handy;
    }

    public void setHandy(Integer handy) {
        this.handy = handy;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public TTC getTtc() {
        return ttc;
    }

    public void setTtc(TTC ttc) {
        this.ttc = ttc;
    }

    @Override
    public String toString() {
        return  "model.Gun{" + "model='" + model + '\'' + ", handy=" + handy + ", origin=" + origin + ", material=" + material + ", ttc=" + ttc.toString() + "}";

    }
}
