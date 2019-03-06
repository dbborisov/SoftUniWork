package daySix.homework.cars;

public class VehicleCatalogue {

    private  String type;
    private  String model;
    private  String color;
    private  int hpower;

    public VehicleCatalogue(String type, String model, String color, int hpower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hpower = hpower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHpower() {
        return hpower;
    }

    public void setHpower(int hpower) {
        this.hpower = hpower;
    }
}
