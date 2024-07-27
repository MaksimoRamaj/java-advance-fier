package org.example.oop.classes;

public class OuterClass {

    private int d = 10;
    private int a = 5;
    static int b = 10;
    InnerClass innerClass;


    public OuterClass(int d, int a) {
        this.d = d;
        this.a = a;
    }

    public InnerClass createInnerClassMethod(int x){
        this.innerClass = new InnerClass(x);
        return innerClass;
    }

    static class StaticInnerClass{
        int x = 50;
        static int y = 20;
        public StaticInnerClass() {
        }

        public StaticInnerClass(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public static int getY() {
            return y;
        }

        public static void setY(int y) {
            StaticInnerClass.y = y;
        }
    }

    class InnerClass{
        private int x = 12;

        public InnerClass() {
        }

        public InnerClass(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void myInnerClassMethod(){
            System.out.println("My inner class method");
        }
    }

    public void myOuterMethodClass(){
        System.out.println("Inside my outer class method");
    }
}
