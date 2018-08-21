package com.neuedu.learn.homework.shopping;


import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@ToString
public class Address {
    @NonNull private int id;
    @NonNull private String address;
    @NonNull private String recName;
    private boolean isDefault=false;

    public Address(int id,String address,String recName,boolean isDefault){
        this.id=id;
        this.address=address;
        this.recName=recName;
        this.isDefault=isDefault;
    }

    public void ToString(){
        System.out.println("编号     "+"\t"+"地址              "+"\t"+"收件人      "+"\t"+"是否默认地址");
        System.out.println(getId()+"      \t"+getAddress()+"     \t"+getRecName()+"     \t"+isDefault());
    }

    public void toString1(){
        System.out.println(getAddress()+"\t"+"收件人"+getRecName());
    }



}
