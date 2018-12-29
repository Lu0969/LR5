package com.company;
import java.util.Date;

class SomeThread extends Thread{

    public void run() {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
public class Main {

    public static void main(String args[]) {
       SomeThread test =new SomeThread();
       test.run();

       SomeThread test1 =new SomeThread();
       test1.run();
    }
}