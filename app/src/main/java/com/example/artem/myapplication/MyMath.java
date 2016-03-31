package com.example.artem.myapplication;

/**
 * Created by artem on 3/31/2016.
 */
public class MyMath {

    public String NumToNum (String num){
        try{
            return Integer.toString( Integer.getInteger(num) + 1);
        }catch(Exception e){
            //This catch block catches all the exceptions
            return "";
        }
    }
}
