package com.neuedu.learn.homework.shopping;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Custom cs1=TestCaseAddCs.addCs();
        ArrayList<Goods> gd=TestCaseAddCs.addGd();

        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        ShoppingCart buyCart=new ShoppingCart();
        buyCart.buy(gd,in);

        do {

            buyCart.show();
            System.out.println("删除选1,增加选2,清空购物车3,结账选4");
            int choice=sc.nextInt();

            if (choice==2){
                System.out.println("选择你要增加的序号与数量:(2x3,4x2   ||  n)");
                in=sc.next();
                buyCart.buy(gd,in);
            }else if (choice==1){
                System.out.println("选择你要删除的序号与数量:(2x2 4x1)");
                in=sc.next();
                buyCart.delete(in);
            }else if (choice==3){
                buyCart.clear();
            }else if (choice==4){
                int sj=buyCart.selctadd(cs1);
                long time=System.currentTimeMillis();
                Date now=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
                String info=sdf.format(now);
                Order od=new Order(String.valueOf(time),info,cs1.getAdr().get(sj-1),buyCart);
                od.ToString();
                System.out.println("是否结账:1付款,2返回");
                int jz=sc.nextInt();
                if (jz==1){
                    System.out.println("谢谢惠顾!");
                    break;
                }
            }
            else {
                break;
            }
        }while (true);

    }
}
