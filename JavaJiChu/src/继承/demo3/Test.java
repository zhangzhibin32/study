package 继承.demo3;

public class Test {
    public static void main(String[] args) {
        /*Cylinder cylinder = new Cylinder();
        cylinder.setLength(5.0);
        //cylinder.setRadius(2);
        System.out.println(cylinder.findVolume());*/
        A b=new B();
        b.show();
    }


   static class A {
        int a = 1;
        double d = 2.0;

        void show() {
            System.out.println("Class A: a=" + a + "\td=" + d);
        }
    }

   static class B extends A {
        float a = 3.0f;
        String d = "Java program.";

        void show() {
            super.show();
            System.out.println("Class B: a=" + a + "\td=" + d);
        }
    }

}
