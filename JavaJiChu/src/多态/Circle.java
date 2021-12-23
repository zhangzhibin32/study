package 多态;

import java.util.Objects;

//圆形
public class Circle extends GeometricObject{
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(String color, Double weight, Double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }


    @Override
    public Double findArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
