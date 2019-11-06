package top2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Cart> list = new ArrayList<>();
        Cart cart1 = new Cart("g10000","笔记本",10000.0);
        Cart cart2 = new Cart("g10001","手机",5000.0);
        Cart cart3 = new Cart("g20000", "苹果", 50.0);
        System.out.println("============添加商品===========");
        list.add(cart1);
        list.add(cart2);
        list.add(cart3);
        System.out.println("添加 " + cart1.getName() + " 成功");
        System.out.println("添加 " + cart2.getName() + " 成功");
        System.out.println("添加 " + cart3.getName() + " 成功");
        System.out.println("==============打印商品=============");
        int sumPrice = 0;
        for (Cart cart:list) {
            sumPrice += cart.getPrice();
            System.out.println(cart.getId() + "," + cart.getName() + "," + cart.getPrice());
        }
        System.out.println("-------------------");
        System.out.println("原价为：" + sumPrice);
        System.out.println("折后价为：" + ((sumPrice - cart3.getPrice())*0.88 + cart3.getPrice()));
    }
}
