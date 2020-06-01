package com.i.controller;

public class a {
    int add(int i,int a){
        try {
            return i+a;
        }catch (Exception e){
            System.out.println("1");
        }finally {
            System.out.println("1111111111111");
        }
        return 100;
    }
    public static void main(String[] args) {
        a a = new a();
        System.out.println(a.add(1, 4));
        String s;
    }


}

