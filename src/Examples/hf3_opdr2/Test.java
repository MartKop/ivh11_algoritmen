package Examples.hf3_opdr2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(8);
        list1.add(13);
        list1.add(21);
        list1.add(34);
        list1.add(55);
        list1.add(89);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(8);
        list2.add(16);
        list2.add(32);
        list2.add(64);
        list2.add(128);
        list2.add(256);
        list2.add(512);
        list2.add(1024);

        ArrayList<Integer> merged = mergeArraysEasy(list1, list2);
        for (Integer x : merged) {
            System.out.println(x);
        }
    }

    public static ArrayList<Integer> mergeArraysEasy(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> tList = new ArrayList<Integer>();
        tList.addAll(list1);
        tList.addAll(list2);
        Collections.sort(tList);

        return tList;
    }

    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int temp = 0;
        for (Integer x : list1) {
            while(x < list2.get(0)) {
                answer.add(x);
                list1.remove(x);
            }
        }

        return answer;
    }
}
