import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tien1", 20);
        hashMap.put("Tien2", 22);
        hashMap.put("Tien3", 23);
        hashMap.put("Tien4", 24);
        hashMap.put("Tien5", 25);
        hashMap.put("Tien6", 26);
        hashMap.put("Tien7", 27);
        System.out.println("hashMap :" + hashMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Tien7", 27);
        linkedHashMap.put("Tien1", 20);
        linkedHashMap.put("Tien3", 23);
        linkedHashMap.put("Tien2", 22);
        linkedHashMap.put("Tien6", 26);
        linkedHashMap.put("Tien4", 24);
        linkedHashMap.put("Tien5", 25);
        System.out.println("linkedHashMap " +linkedHashMap);
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Tien1", 20);
        treeMap.put("Tien2", 22);
        treeMap.put("Tien3", 23);
        treeMap.put("Tien4", 24);
        treeMap.put("Tien5", 25);
        treeMap.put("Tien6", 26);
        treeMap.put("Tien7", 27);
        System.out.println("tree map"+treeMap);
    }
}