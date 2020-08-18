package com.javapractice.nestedclass;

class StaticInnerExample1{
    static int data=30;
    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        StaticInnerExample1.Inner obj=new StaticInnerExample1.Inner();
        obj.msg();
    }
}