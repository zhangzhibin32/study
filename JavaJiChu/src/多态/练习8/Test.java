package 多态.练习8;

public class Test {

    public static void main(String[] args) {
        Order order=new Order(1,"209");
        Order order1=new Order(1,"209");

        System.out.println(order.equals(order1));
        MyDate myDate=new MyDate(2000,12,02);
        MyDate myDate1=new MyDate(2000,12,02);
        System.out.println(myDate.equals(myDate1));
    }


}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

}