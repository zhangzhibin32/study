package 多态;

public class Student extends Person{
    protected String school="曲沃二中";

    public String getInfo(){
        return "Name"+name+"Age"+age+"school"+school;
    }
}
