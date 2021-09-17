package b12_java_collection_framework.practice.hashmap_linkedhashmap_treemap;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Jose",24);
        hashMap.put("Peter",29);
        hashMap.put("Grace", 19);

        System.out.println("Display entries in HashMap" + "size " +  hashMap.size());
        System.out.println(hashMap + "\n");
        //Tối ưu cho các thao tác tìm kiếm, thêm và xoá
        //Truyền hashMap vào để chuyển đối qua TreeMap
//        Tối ưu cho thao tác duyệt qua các entry theo trật tự sắp xếp của các key
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        hashMap.put("Smith", 30);
        hashMap.put("Jose",24);
        hashMap.put("Peter",29);
        hashMap.put("Grace", 19);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        //Kế thừa HashMap, hỗ trợ sắp xếp các entry
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Jose", 24);
        linkedHashMap.put("Peter", 29);
        linkedHashMap.put("Grace", 19);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Peter"));

    }
}
