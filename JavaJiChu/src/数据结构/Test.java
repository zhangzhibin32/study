package 数据结构;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        List<Details> details=new ArrayList<>();
        Boolean isFlag=true;
        int money=10000;
        while (isFlag){
            Scanner sc=new Scanner(System.in);
            System.out.println("家庭收支记账软件");
            System.out.println("1收支明细");
            System.out.println("2登记收入");
            System.out.println("3登记支出");
            System.out.println("4退    出");
            System.out.println("请选择(1-4)：_");
            int anInt = sc.nextInt();
            switch (anInt){
                case 1:
                    System.out.println("---收支明细---");
                    for (Details d: details) {
                        System.out.println(d);
                    }
                    break;
                case 2:
                    System.out.println("请输入收入");
                    int i = sc.nextInt();
                    money+=i;
                    System.out.println("请输入说明");
                    String explain=sc.next();
                    details.add(new Details("收入",money,i,explain));
                    break;
                case 3:
                    System.out.println("请输入支出");
                    i = sc.nextInt();
                    money-=i;
                    System.out.println("请输入说明");
                    explain=sc.next();
                    details.add(new Details("支出",money,i,explain));
                    break;
                case 4:
                    System.out.print("是否退出(Y/N)？");
                    char isExit = 'Y';//Utility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
            }
        }
        System.out.println("谢谢使用");



    }
}
