package com.company;
//Write a Java Program to concatenate following HashMaps to create a new one. Sample HashMaps :
//dic1={1=10, 2=20}
//dic2={3=30, 4=40}
//dic3={5=50,6=60}
//Expected Result : {1= 10, 2= 20, 3= 30, 4= 40, 5= 50, 6= 60}


import java.util.HashMap;

public class ExerciseC {


    public static void concatenateNum(HashMap<Integer, Integer> map1, HashMap<Integer, Integer> map2, HashMap<Integer, Integer> map3) {
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for (int i : map1.keySet()) {
            newMap.put(i, map1.get(i));
        }
        for (int i : map2.keySet()) {
            newMap.put(i, map2.get(i));
        }
        for (int i : map3.keySet()) {
            newMap.put(i, map3.get(i));
        }
        System.out.println(newMap);

    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> d1 = new HashMap<>();
        HashMap<Integer, Integer> d2 = new HashMap<>();
        HashMap<Integer, Integer> d3 = new HashMap<>();

       d1.put(1, 10);
       d1.put(2, 20);
       d2.put(3, 30);
       d2.put(4, 40);
       d3.put(5, 50);
       d3.put(6, 60);

       concatenateNum(d1,d2,d3);

    }
}





//    public static  int concatenate(HashMap<Integer>) Concatenate(HashMap<Integer, Integer>values) {
//        HashMap<Integer, Integer> concatenateNum = new HashMap<>();
//
//        for (int i = 0; i < values.length(); i++) {
//            concatenateNum.add(values(i));
//        }
//        for (int i = 0; i < values.length(); i++) {
//            concatenateNum.add(values(i));
//        }
//        return concatenateNum;
//    }
//
//
//    public static void main(String[] args) {
//        HashMap<String, Integer>addition = new HashMap<>();
//
//        addition.put("1=", 10);
//        addition.put("2=", 20);
//        addition.put("3=", 30);
//        addition.put("4=", 40);
//        addition.put("5=", 50);
//        addition.put("6=", 60);
//
//
//        System.out.println(addition.concatenate(addition));
//    }
//}
