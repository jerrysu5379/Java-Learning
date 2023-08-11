package uk.jerrysu.inherit;

public class TestOverride {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.run();
        h1.stop();
        Plane p=new Plane();
        p.run();
        p.stop();
    }
}

class Vehicle{
    public void run(){
        System.out.println("run...");
    }
    public void stop(){
        System.out.println("stop...");
    }
    public final void add(){
        System.out.println("Oil!");
    }
}

class Horse extends Vehicle{
    public void run(){
        System.out.println("四蹄翻飞");
    }
}

class Plane extends Vehicle{
    public void stop(){
        System.out.println("在机场停下");
    }
    //public void add(){}
}