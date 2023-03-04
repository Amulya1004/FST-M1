package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> set= new HashSet<String>();
            set.add("Apple");
            set.add("Banana");
            set.add("Cucumber");
            set.add("Grapes");
            set.add("Orange");
            set.add("kiwi");

            System.out.println(set.size());
            System.out.println(set.remove("Cucumber"));
            System.out.println(set.remove("Strawberry"));
            System.out.println(set.contains("Cherry"));
            System.out.println(set);

        }
    }

