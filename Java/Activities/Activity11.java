package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Blue");
        colors.put(3, "Green");
        colors.put(4, "Yellow");
        colors.put(5, "Black");

        System.out.println(colors);
        System.out.println(colors.remove(2, "blue"));
        System.out.println(colors.containsValue("green"));
        System.out.println(colors.size());
    }
}
