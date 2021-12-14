package Day1023;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FightAgainstLandlord {
    /**
     * ①准备牌
     *      54张牌，存储到一个集合中
     *      特殊牌 大王小王
     *      其它52张牌
     *      定义一个数组/集合，存储4种花色 ♤♥♣♢
     *      定义一个数组/集合，存储13个序号2,A,K...3
     *      嵌套遍历两个数组/集合，组合52张牌
     *  ②洗牌
     *      使用集合工具类Collections的方法
     *      static void shuffle(List<？>list)使用指定的随机源对指定列表进行置换
     *      会随机打乱集合中元素的顺序
     *  ③发牌
     *      要求1人17张，剩余3张作为底牌，一人一张轮流发牌。集合的索引(0-55)%3
     *      定义4个集合，存储3个玩家的牌和底牌
     *      索引%2，有两个值0，1 0%2=0 1%2=1 2%2=0 3%2=1
     *      索引%3，有三个值0，1，2 0%3=0 1%3=1 2%3=2 3%3=0
     *      索引>=51 改底牌发牌
     *  ④看牌
     * */
    public static void main(String[] args) {
        List<String> decor=new ArrayList<>();
        Collections.addAll(decor,"♤","♥","♣","♢");
        List<String> brand=new ArrayList<>();
        Collections.addAll(brand,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        List<String> list=new ArrayList<>();
        list.add("大王");
        list.add("小王");
        for (int i = 0; i < decor.size(); i++) {
            for (int j = 0; j < brand.size(); j++) {
                list.add(decor.get(i)+brand.get(j));
            }
        }
        Collections.shuffle(list);
        for (String name: list) {
            System.out.print(name);
        }
        System.out.println();
        List<String> one=new ArrayList<>();
        List<String> two=new ArrayList<>();
        List<String> three=new ArrayList<>();
        List<String> dipai=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i>=51){
                dipai.add(list.get(i));
            }else if(i%3==0){
                three.add(list.get(i));
            }else if(i%2==0){
                two.add(list.get(i));
            }else
                one.add(list.get(i));
        }
        for (String name: one) {
            System.out.print(name);
        }
        System.out.println();
        for (String name: two) {
            System.out.print(name);
        }
        System.out.println();
        for (String name: three) {
            System.out.print(name);
        }
        System.out.println();
        for (String name: dipai) {
            System.out.print(name);
        }
    }
}
