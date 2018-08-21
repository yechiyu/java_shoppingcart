package com.neuedu.learn.homework.shopping;

import java.util.ArrayList;

public class TestCaseAddCs {

    static Custom addCs(){
        Address ad1=new Address(1,"致馨公寓          ","小张");
        Address ad2=new Address(2,"东软睿道教育有限公司","Tom",true);
        Address[] ad=new Address[]{ad1,ad2};
        Custom cs1=new Custom(1,"Tom",ad);
        return cs1;

    }

    public static ArrayList<Goods> addGd(){
        Goods gd1=new Goods(1,"小米","手机",4000.0,"型号",new String[]{"小米8-500.0","小米8 SE-770.0"});
        Goods gd2=new Goods(2,"iphone","手机",6000.0,"型号",new String[]{"iphone6-300.0","iphone7-600.0","iphone9-1000.0","iphoneX-1888.0"});
        Goods gd3=new Goods(3,"脸盆",20.0);
        Goods gd4=new Goods(4,"牙刷","生活用品",16.0);
        Goods gd5=new Goods(5,"Nike","衣服",799.0,new String[]{"颜色","尺寸"},new String[][]{{"白色-10.0","黑色-10.0","绿色-10.0"},{"165-5.0","170-5.0","175-5.0","180-5.0","185-5.0"}});
        Goods gd6=new Goods(6,"测试","测试",999.0,"颜色","白色");


        ArrayList<Goods> gd=new ArrayList<Goods>();

        gd.add(gd1);
        gd.add(gd2);
        gd.add(gd3);
        gd.add(gd4);
        gd.add(gd5);
        gd.add(gd6);
        System.out.println("-------------------欢迎光临----------------------\n");
        System.out.println("序号     "+"\t"+"名称      "+"\t"+"类别      "+"\t"+"价格");
        for(Goods o:gd){
            System.out.println(o.getId()+"       \t"+o.getName()+"     \t"+o.getDetail()+"     \t"+o.getPrice());
        }
        System.out.println("\n请选择你要购买的商品序号:(并用逗号或空格分隔开   3x4,5x2  ||  n)\n");

        return gd;

    }
}
