package 继承.demo2;

public class Kids extends ManKind{
    private int yearsOld;

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println(yearsOld);
    }

    @Override
    public String toString() {
        return "Kids{" +
                "yearsOld=" + yearsOld +
                '}';
    }
}
