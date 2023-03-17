package com.zzb.OOP;

/**
 * 这是一个学生类
 *
 * @author zzb
 * @version 1.0
 */
public class Student extends Person {

    private double mathScore;
    private double englishScore;
    private double chineseScore;

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(double chineseScore) {
        this.chineseScore = chineseScore;
    }


    /**
     * @param mathScore    数学成绩
     * @param englishScore 英语成绩
     * @param chineseScore 语文成绩
     */

    public Student(String name,int age,String gender,double mathScore, double englishScore, double chineseScore) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.chineseScore = chineseScore;
    }

    public double sumScore() {
        return this.chineseScore + this.mathScore + this.englishScore;
    }

    public double avg() {
        return sumScore() / 3;
    }

    @Override
    public String toString() {
        return "com.zzb.OOP.Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + this.getGender() + '\'' +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                ", chineseScore=" + chineseScore +
                '}';
    }
}
