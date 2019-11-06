package top4;

public class ThreadTest implements Runnable{
    private static int count = 80;
    private Object object = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (count <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "上车" + (81-count) + " 人还剩下 " + (count - 1) + "个座位");
                count --;
            }
        }
    }
}
