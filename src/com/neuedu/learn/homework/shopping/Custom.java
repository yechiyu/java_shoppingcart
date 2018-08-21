package com.neuedu.learn.homework.shopping;


import com.neuedu.learn.oo_01.Addr;
import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

@Data
@ToString
public class Custom {
    private int id;
    private String name;
    private List<Address> adr;

    public Custom(){

    }

    Custom(int id, String name, Address adr){
        this.id=id;
        this.name=name;
        this.adr.add(adr);
    }

    Custom(int id, String name, Address... adr){
        this.id=id;
        this.name=name;
        this.adr= Arrays.asList(adr);
    }


}
