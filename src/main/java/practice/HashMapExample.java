package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    HashMap<String, String> hmap = new HashMap<>();

    public void addHashmapValue(){
        hmap.put("IE", "Internet Explorer");
        hmap.put("CB", "Chrome Browser");
        hmap.put("MF", "Mozilla Firefox");
        hmap.put("SB", "Safari Browser");

        //System.out.println("Browser name of SB: " + hmap.get("SB"));

        for(Map.Entry me: hmap.entrySet()){
            System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());
        }

       System.out.println();
        System.out.println("Size of the map: " + hmap.size());


        System.out.println();
        System.out.println("Content of the map: " + hmap);

        System.out.println();
        if(hmap.containsKey("MF")){
            String val = hmap.get("MF");
            System.out.println("Value for MF: " + val);
        }

    }


    public static void main(String[] args) {
        HashMapExample hme = new HashMapExample();
        hme.addHashmapValue();
    }
}
