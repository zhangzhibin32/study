package 继承.demo3;

public class Circle {
    private double radius;

    public Circle() {
        this.radius=1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Double findArea(){
        return Math.PI*radius*radius;
    }
}
