package com;

import java.util.ArrayList;

public class coreLoop {

    public static void main(String[] args) {


        ArrayList<String> data = new ArrayList<String>();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");
        data.add("E");
        data.add("F");
        data.add("G");
        data.add("H");
        data.add("I");
        data.add("K");
        data.add("L");
        data.add("M");

        String kk =" ";

        int k = 0;
        for(int i = 0; i < 2; i++) {
            int a = 1;
            int j ;
            for( j = k; j<data.size(); j++) {

                if(data.get(j).equals("A")){
                    System.out.println("kanon");
                }
                else if (data.get(j).equals("H")){
                    System.out.println("Hira");                }

                kk += " " +data.get(j);
                System.out.println("2nd Iteration: " + data.get(j));
                a++;
                k++;
                if(a == 6) {
                    break;
                }
            }
            System.out.println("interval");

            a = 1;

        }
        System.out.println(kk );

    }
}
