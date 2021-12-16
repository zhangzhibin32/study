package 继承.demo4;

/*** 创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性 overdraft 代表可透支限额。* */
public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount() {
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    /** 在 CheckAccount 类中重写 withdraw 方法，其算法如下：
 * 如果（取款金额<账户余额），
 * 可直接取款
 * 如果（取款金额>账户余额），
 * 计算需要透支的额度
 * 判断可透支额 overdraft 是否足够支付本次透支需要，如果可以
 * 将账户余额修改为 0，冲减可透支金额
 * 如果不可以
 * 提示用户超过可透支额的限额*/
    public void withdraw(double amount){
        //double balance = getBalance();
        System.out.println(balance+"余额");
        if (amount<balance){
            setBalance(balance-=amount);
        }
        else if(amount>balance){
            double v = amount - balance;
            if(v>overdraft){
                System.out.println("已超过可透支额度，"+(v-overdraft));
            }
            else{
                balance=0;
                overdraft-=v;
                System.out.println("剩余可透支额度"+(overdraft));
            }
        }
    }
}
