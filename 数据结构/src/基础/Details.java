package 基础;

public class Details {
    private String type;
    private Integer TotalAmount;
    private Integer money;
    private String explain;

    public Details() {
    }

    public Details(String type, Integer totalAmount, Integer money, String explain) {
        this.type = type;
        TotalAmount = totalAmount;
        this.money = money;
        this.explain = explain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        TotalAmount = totalAmount;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public String toString() {
        return
                  type + "\t" +
                  TotalAmount +"\t" +
                  money +"\t" +
                  explain + "\n"
                ;
    }
}
