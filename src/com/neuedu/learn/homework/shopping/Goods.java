package com.neuedu.learn.homework.shopping;


import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Data
@ToString
@RequiredArgsConstructor
public class Goods {

    @NonNull private int id;
    @NonNull private String name;
    private String detail;
    @NonNull private double price;
    private MultiMap menu=new MultiValueMap();
    private String kind;

    Goods(){

    }

    Goods(int id,String name,String detail,double price,String menu_k,String[] menu_v){
        this.id=id;
        this.name=name;
        this.price=price;
        this.detail=detail;
        for (int i = 0; i < menu_v.length; i++) {
            this.menu.put(menu_k,menu_v[i]);
        }
    }

    Goods(int id,String name,String detail,double price){
        this.id=id;
        this.name=name;
        this.detail=detail;
        this.price=price;
    }

    Goods(int id, String name, String detail, double price, String[] menu_k, String[][] menu_v){
        this.id=id;
        this.name=name;
        this.detail=detail;
        this.price=price;
        for (int i = 0; i < menu_k.length; i++) {
            for (int j = 0; j < menu_v[i].length; j++) {

                this.menu.put(menu_k[i],menu_v[i][j]);
            }
        }
    }
    Goods(int id, String name, String detail, double price, String menu_k, String menu_v){
        this.id=id;
        this.name=name;
        this.detail=detail;
        this.price=price;
        this.menu.put(menu_k,menu_v);
    }

}
