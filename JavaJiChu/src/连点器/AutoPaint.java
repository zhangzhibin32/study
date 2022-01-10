package 连点器;

import java.awt.*;
import java.awt.event.InputEvent;
    public class AutoPaint {
        public static void main(String[] args) throws AWTException {
            Robot robot = new Robot();
            robot.delay(3000); //运行代码后，暂停三秒，留够时间去打开电脑自带的画板，并点击形状里面的椭圆形

            //1111111111111111111111
            int i = 10;
            while (i-- > 0) {
                robot.mouseMove(920, 700);
            }
            int n=1;
            while(n++<99999){

            robot.mousePress(InputEvent.BUTTON1_MASK);

            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(100);       //画完一个圆停止0.2s，否则因为计算机执行速度太快，看不到动态作图的过程
                System.out.println(n);
            }

        }
}


                                                                                                        //-