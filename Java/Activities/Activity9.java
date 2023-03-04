package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args){
        List<String> arrList= new ArrayList<>();
        arrList.add("Chandler");
        arrList.add("Ross");
        arrList.add("Joey");
        arrList.add("Mike");
        arrList.add("Richard");

        System.out.println("Print All the Objects:");
        for(String s:arrList){
            System.out.println(s);
        }

        System.out.println(arrList.get(2));
        System.out.println(arrList.contains("Joey"));
        System.out.println(arrList.size());
        arrList.remove("Richard");
        System.out.println(arrList.size());
    }
}
