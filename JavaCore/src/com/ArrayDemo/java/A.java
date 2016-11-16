package com.ArrayDemo.java;

import java.util.ArrayList;
import java.util.Iterator;

class A {

    public static void main(String[] args) {
        test test1 = new test(1);
        test test2 = new test(2);
        test test3 = new test(3);
        ArrayList al = new ArrayList();
        al.add(test1);
        al.add(test2);
        ArrayList al1 = new ArrayList();
        al1 = (ArrayList) al.clone();

        al1.add(test3);
        System.out.println("al"+al.toString());
       /* for (Iterator it = al1.iterator(); it.hasNext();) {
            System.out.println("al1: " + it.next());
        }*/

/*for (Iterator it = al.iterator(); it.hasNext();) {
            System.out.println("al: " + it.next());
        }*/
        System.out.println("al1"+al1.toString());
        test1.num = -1;
        test2.num = -1;
        test3.num = 2;
        System.out.println("al"+al.toString());
        System.out.println("al1"+al1.toString());
       /* for (Iterator it = al1.iterator(); it.hasNext();) {
            System.out.println("al1: " + it.next());
        }*/

/*for (Iterator it = al.iterator(); it.hasNext();) {
            System.out.println("al: " + it.next());
        }*/
    }

    static class test {

        int num = 0;

        test(int i) {
            num = i;
        }

        
        @Override
        public String toString() {
            return "" + num;
        }
    }
}