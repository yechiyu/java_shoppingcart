package com.neuedu.learn.homework.shopping;

import com.neuedu.learn.homework.shoppingcart.List;
import lombok.ToString;

import javax.xml.crypto.Data;


@lombok.Data
public class Order {

    private String oid;
    private String data;
    private Address addr;
    private ShoppingCart buyCart;
    private double total;

    public Order(String oid,String data,Address addr,ShoppingCart buyCart){
        this.oid=oid;
        this.data=data;
        this.addr=addr;
        this.buyCart=buyCart;
        for (Item o:buyCart.getLis()){
            setTotal(getTotal()+o.getAmound()*o.getPrice());
        }
    }


    public void ToString(){
        System.out.println("\n-----------订单信息:-----------");
        System.out.println("订单编号:"+getOid());
        System.out.println("购买时间:"+getData());
        System.out.print("收货地址:");getAddr().toString1();
        System.out.println("-----------物品列表:------------");
        buyCart.show();
        System.out.println("-----------总计"+getTotal()+"------------");
    }


}
