package 继承.demo2;

public class KidsTest {
    public static void main(String[] args) {
        Kids someKid=new Kids();
        someKid.setSalary(0);
        someKid.setYearsOld(25);
        someKid.setSex(0);
        someKid.ManOrWoMan();
        someKid.employed();
        someKid.printAge();
    }
}
