package top3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String sc = scanner.nextLine();
        String[] split = sc.split("");
        Test3.getCount(split);
    }
    //统计次数
    public static void getCount(String[] strings){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(0);
            if (hashMap.get(c) == null){
                hashMap.put(c,1);
            } else {
                hashMap.put(c,hashMap.get(c) + 1);
            }
        }
        //遍历map
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        for (Map.Entry map:entries) {
            System.out.println(map.getKey() + "=" + map.getValue());
        }
    }
}
