package com.zhang.demo01;
//代理
public class Proxy implements Rent{
    //拿到房东
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }
    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //中介费
    public void fare(){
        System.out.println("收中介费");
    }
    //签合同
    public void heTong(){
        System.out.println("签租赁合同");
    }
}
