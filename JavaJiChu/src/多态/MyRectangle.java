package 多态;

import java.util.Objects;

public class MyRectangle extends GeometricObject{
    private Double width;
    private Double height;

    public MyRectangle() {
    }

    public MyRectangle(String color, Double weight, Double width, Double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyRectangle that = (MyRectangle) o;
        return Objects.equals(width, that.width) && Objects.equals(height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
