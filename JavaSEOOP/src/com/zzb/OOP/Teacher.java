package com.zzb.OOP;

public class Teacher extends Person{
    private String num;
    private int year;
    private String room;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Teacher() {
    }

    public Teacher(String name,int age,String gender,String num, int year, String room) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender) ;
        this.num = num;
        this.year = year;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", num='" + num + '\'' +
                ", year=" + year +
                ", room='" + room + '\'' +
                '}';
    }
}
