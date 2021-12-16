package 继承.demo1;

public class Student extends Person{
    private long number;
    private int english;
    private int math;
    private int computer;

    public Student() {
    }

    public Student(String name,int age,String sex,long number, int english, int math, int computer) {
        setName(name);
        setAge(age);
        setSex(sex);
        this.number = number;
        this.english = english;
        this.math = math;
        this.computer = computer;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + getName() +
                "age=" + getAge() +
                "sex=" + getSex() +
                "number=" + number +
                ", english=" + english +
                ", math=" + math +
                ", computer=" + computer +
                '}';
    }
}
