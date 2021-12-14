package 第三章泛型;

import java.util.ArrayList;

public class GenericClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public <C> C method(C c){
        return c;
    }
    public void printArray(ArrayList<?> list){
        System.out.println(list);
    }
}
