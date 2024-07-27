package org.example.oop.exceptions.checkedAndUnchecked;

public class Demo {
    public static void main(String[] args){

        try {
            myMethod2();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void myMethod2()throws Exception{
        myMethod();
    }


    //checked exception
    public static void myMethod()throws Exception{
        throw new Exception();
    }
    //unchecked exception
    public static void myRunTimeExcMethod(){
        throw new RuntimeException();
    }
}
