package 继承.demo3;

public class Cylinder extends Circle{
    private Double length;

    public Cylinder() {
        this.length = 1.0;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public Double findArea() {
        return super.findArea();
    }

    public Double findVolume(){
        return findArea()*length;
    }
}
