package 多态;
//几何形状
public class GeometricObject {
    private String color;
    private Double weight;

    public GeometricObject() {
    }

    public GeometricObject(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double findArea(){
        return null;
    }
}
