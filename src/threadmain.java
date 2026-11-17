public class threadmain {
       public static void main(String[] args) {
     mythread mythread=new mythread();
     mythread.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("welcome to class"+i);
        }
    }
}