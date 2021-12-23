package 多态.练习10;

public class Student {
    private int score;
    private String level;



    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Student(int score) {
        this.score = score;

    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", level='" + level + '\'' +
                '}';
    }
}
