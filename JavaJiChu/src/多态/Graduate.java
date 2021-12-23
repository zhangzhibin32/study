package 多态;

public class Graduate extends Student{
    public String major="IT";

    @Override
    public String getInfo() {
        return "Name"+name+"Age"+age+"school"+school+"Major"+major;
    }
}
