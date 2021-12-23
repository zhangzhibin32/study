package 多态.练习10;

import java.util.Scanner;
import java.util.Vector;

public class Test {
    @org.junit.Test
    public void test(){
        Vector<Student> vector = new Vector();
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while (flag){
            System.out.println("成绩");
            int score = new Scanner(System.in).nextInt();
            vector.addElement(new Student(score));
            if(score<0)
                flag=false;
        }
        int maxScore=0;
        for (int i = 0; i < vector.size(); i++) {
            if (maxScore<vector.elementAt(i).getScore()){
                maxScore=vector.elementAt(i).getScore();
            }
        }
        for (int i = 0; i < vector.size(); i++) {
            if (maxScore-vector.elementAt(i).getScore()<=10){
                vector.elementAt(i).setLevel("A等");
            }else if(maxScore-vector.elementAt(i).getScore()<=20){
                vector.elementAt(i).setLevel("B等");
            }else if(maxScore-vector.elementAt(i).getScore()<=30){
                vector.elementAt(i).setLevel("C等");
            }else{
                vector.elementAt(i).setLevel("D等");
            }
            System.out.println(vector.elementAt(i));
        }

    }
}
