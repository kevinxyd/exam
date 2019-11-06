package top4;

public class Test4 {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Thread thread1 = new Thread(threadTest,"前门");
        Thread thread2 = new Thread(threadTest,"中门");
        Thread thread3 = new Thread(threadTest,"后门");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
