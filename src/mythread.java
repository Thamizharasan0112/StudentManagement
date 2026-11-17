public class mythread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("welcome to java"+i);
        }
    }
}