package com.driver;

public class Main {
    public static void main(String [] args)
    {
        RWOnly obj=new RWOnly(); 
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // The field RWOnly.name is not visible

        obj.setName("dewashish");
        System.out.println(obj.getName());
    }
}