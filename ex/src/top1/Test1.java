package top1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(100);
        list.add(98);
        list.add(97);
        list.add(96);
        Collections.sort(list);
        list.remove(0);
        list.remove(list.size()-1);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("最后得分：" + sum/3);
    }
}
