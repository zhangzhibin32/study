package 多态.练习10;

import java.util.Scanner;
import java.util.Vector;

public class Stest {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        int maxScore=0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("成绩");
            int score = sc.nextInt();
            if(score<0) break;
            if (maxScore<score) maxScore=score;
            vector.addElement(score);
        }
        for (int i = 0; i < vector.size(); i++) {
            if (maxScore-vector.elementAt(i)<=10){
                System.out.println(i+"成绩"+vector.elementAt(i)+"A等");
            }else if(maxScore-vector.elementAt(i)<=20){
                System.out.println(i+"成绩"+vector.elementAt(i)+"B等");
            }else if(maxScore-vector.elementAt(i)<=30){
                System.out.println(i+"成绩"+vector.elementAt(i)+"C等");
            }else{
                System.out.println(i+"成绩"+vector.elementAt(i)+"D等");
            }
        }
    }
}
