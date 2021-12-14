package BankTest;

public class CustomerView {
    CustomerList customerList=new CustomerList(10);
    /*用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。*/
    public void enterMainMenu(){
        boolean isFlag=true;
        while(isFlag) {
            System.out.println(" -----------------客户信息管理软件-----------------\n" +
                    "                                     1 添 加 客 户\n" +
                    "                                     2 修 改 客 户\n" +
                    "                                     3 删 除 客 户\n" +
                    "                                     4 客 户 列 表\n" +
                    "                                     5 退           出\n" +
                    "                                     请选择(1-5)：_\n");
                char c = CMUtility.readMenuSelection();
                switch (c){
                    case '1':
                        addNewCustomer();
                        break;
                    case '2':
                        modifyCustomer();
                        break;
                    case '3':
                        deleteCustomer();
                        break;
                    case '4':
                        listAllCustomers();
                        break;
                    case '5':
                        char c1 = CMUtility.readConfirmSelection();
                        if(c1=='Y')
                            isFlag=false;
                        else if (c1=='N')
                            isFlag=true;
                        break;
                }
        }
    }
    private void addNewCustomer(){
        System.out.print("姓名3");
        String name=CMUtility.readString(1);
        System.out.print("性别");
        char gender = CMUtility.readChar();
        System.out.print("年龄");
        int age = CMUtility.readInt();
        System.out.print("手机号11");
        String phone = CMUtility.readString(1);
        System.out.print("邮箱5");
        String email=CMUtility.readString(1);
        boolean b = customerList.addCustomer(new Customer(name,gender,age,phone,email));
        if (b) System.out.println("添加成功");
        else System.out.println("添加失败");
    }
    private void modifyCustomer(){
        int i = CMUtility.readInt();
        System.out.print("修改的客户");
        Customer customer = customerList.getCustomer(i - 1);
        System.out.print("姓名3");
        String name = CMUtility.readString(1, customer.getName());
        System.out.print("性别");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.print("年龄");
        int age = CMUtility.readInt(customer.getAge());
        System.out.print("手机号11");
        String phone = CMUtility.readString(1, customer.getPhone());
        System.out.print("邮箱5");
        String email=CMUtility.readString(1,customer.getEmail());

        boolean b = customerList.replaceCustomer(i-1,new Customer(name,gender,age,phone,email));
        if (b) System.out.println("修改成功");
        else System.out.println("修改失败");

    }
    private void deleteCustomer(){
        boolean b = customerList.deleteCustomer(CMUtility.readInt());
        if (b) System.out.println("删除成功");
        else System.out.println("删除失败");
    }
    private void listAllCustomers(){
        Customer[] allCustomers = customerList.getAllCustomers();
        for (Customer c:allCustomers) {
            System.out.println(c);
        }
    }
    public static void main(String[] args){
        CustomerView view=new CustomerView();
        view.enterMainMenu();
    }

}
