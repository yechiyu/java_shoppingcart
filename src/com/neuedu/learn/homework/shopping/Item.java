package com.neuedu.learn.homework.shopping;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@ToString
public class Item{
    private Goods gd;
    private String kind;
    private double price;
    private int amound;

    public Item(Goods gd,String kind,double price,int amound){
        this.gd=gd;
        this.kind=kind;
        this.price=price;
        this.amound=amound;
    }

    public Item(Goods gd,double price,int amound){
        this.gd=gd;
        this.price=price;
        this.amound=amound;
    }

    public boolean equals(int o){
        if (this.getGd().getId()==o){
            return true;
        }else

        return false;
    }

}
