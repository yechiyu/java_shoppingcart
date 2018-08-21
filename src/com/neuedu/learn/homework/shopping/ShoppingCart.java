package com.neuedu.learn.homework.shopping;

import lombok.Data;

import java.util.*;

@Data
public class ShoppingCart {
    private List<Item> lis=new LinkedList<>();


    public void buy(ArrayList<Goods> gd,String in){
        String[] ins=in.split(" |,|x|X");
        if (ins.length==1){
            int a=Integer.parseInt(ins[0]);
            int target=0;
            for (int i=0;i<lis.size();i++){
                if (lis.get(i).equals(a)){
                    target=i;
                    break;
                }
            }

                Set<String> value=gd.get(a-1).getMenu().keySet();
                Iterator<String> setIt=value.iterator();
            Scanner sc=new Scanner(System.in);
            System.out.println("请选择类别:");
            String str3;
            while (setIt.hasNext()){
                Object key = setIt.next();
                Collection values = (Collection)gd.get(a-1).getMenu().get(key);
                System.out.print(key+":");
                Iterator valuesIterator = values.iterator();
                while(valuesIterator.hasNext()){
                    String[] st5=valuesIterator.next().toString().split("-");
                    System.out.print(" "+st5[0]+" ");
//                    System.out.print(" "+st5[1]+" ");
                }
                System.out.println();
            }
            str3=sc.next();
            String[] st4=str3.split(",");
//            System.out.println(Arrays.toString(st4));
            if (target==0){
                Item it=new Item(gd.get(a-1),str3,gd.get(a-1).getPrice(),1);
                lis.add(it);
            }else{
                lis.get(target).setKind(str3);
            }
            Iterator<String> setIt1=value.iterator();
            double index=0;
            while (setIt1.hasNext()){
                Object key = setIt1.next();
                Collection values = (Collection)gd.get(a-1).getMenu().get(key);
//                System.out.print(key+":");
                Iterator valuesIterator = values.iterator();

                while(valuesIterator.hasNext()){
                        String[] st5=valuesIterator.next().toString().split("-");
//                    System.out.println(Arrays.toString(st5));
                    for (int i = 0; i < st4.length; i++) {
                        if (st4[i].equals(st5[0])){
//                            System.out.println(Double.parseDouble(st5[1]));
                            index+=Double.parseDouble(st5[1]);
//                            lis.get(target).setPrice(lis.get(target).getPrice()+Double.parseDouble(st5[1]));
                        }
                    }

                }
                lis.get(target).setPrice(lis.get(target).getGd().getPrice()+index);
                System.out.println();
            }


            return;
        }
        for (int i = 0; i < ins.length; i+=2) {
            int target=1;
            for (Item o:lis){
                if (o.equals(Integer.parseInt(ins[i]))){
                    o.setAmound(o.getAmound()+Integer.parseInt(ins[i+1]));
                    target=-1;
                    break;
                }
            }
            if (target==1){
                Item it=new Item(gd.get(Integer.parseInt(ins[i])-1),gd.get(Integer.parseInt(ins[i])-1).getPrice(),Integer.parseInt(ins[i+1]));
                lis.add(it);
            }

        }
    }

    public void show(){
        System.out.println("---------------购物车-------------");
        System.out.println("\n"+"名称     "+"\t\t\t"+"单价*数量        "+"\t"+"合计     ");
        if (lis.isEmpty()){
            System.out.println("您的购物车空空如也,赶紧去购物吧!!");
        }
        for(Item o:lis){
            System.out.println(o.getGd().getName()+"("+o.getKind()+")"+"    \t"+o.getPrice()+"*"+o.getAmound()+"      \t"+o.getPrice()*o.getAmound());
        }
    }


    public void delete(String in){
        String[] ins=in.split(" |,|x|X");
        for (int i = 0; i < ins.length; i+=2) {
            for (Item o:lis){
                if (o.equals(Integer.parseInt(ins[i]))){
                    o.setAmound(o.getAmound()-Integer.parseInt(ins[i+1]));
                    if (o.getAmound()<=0){
                        lis.remove(o);
                    }
                    break;
                }
            }
        }


    }

    public void clear(){
        lis.clear();
    }


    public int selctadd(Custom cs1){
        System.out.println(cs1.getName()+"请选择你的收件地址:");
        for (int i = 0; i < cs1.getAdr().size(); i++) {
            cs1.getAdr().get(i).ToString();
        }
        Scanner sc=new Scanner(System.in);
        int sj=sc.nextInt();
        return sj;
    }
}
