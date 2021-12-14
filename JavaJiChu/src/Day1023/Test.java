package Day1023;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
         JFrame f=new JFrame("英雄联盟");
        f.setSize(200, 300);//设置容器尺寸
        f.setLocation(200, 200);//设置容器位置
        f.setLayout(null);//设置布局。
        f.setBackground(Color.red);
        JButton b = new JButton("一键秒对方基地挂");
        b.setBounds(50, 50, 280, 30);//设置按钮在容器中的位置

        f.add(b);//将按钮加在容器上
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//界面关闭后程序结束

        f.setVisible(true);//界面可视化。
}
}
