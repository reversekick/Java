package com.bitlrn.intro.callbyreference;

public class CallByReferenceSample {
    private int data;
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public static void update(CallByReferenceSample reference){
        reference.setData(50);
    }

    public void setData(CallByReferenceSample ref){
        ref.setData(100);
    }

    public static void main(String[] args){
        CallByReferenceSample cbrs = new CallByReferenceSample();
        cbrs.setData(10);
        System.out.println("Data of the object = "+ cbrs.getData());
        update(cbrs);
        System.out.println("Data of the object after using static update ="+cbrs.getData());
        cbrs.setData(cbrs);
        System.out.println("Data of the object after using set Data ="+cbrs.getData());
    }
}
