public class Runnablemain {
    public static void main(String[] args){
        threadrunnable myrunnable=new threadrunnable();
        Thread thread=new Thread(myrunnable);
        thread.start(); 

        for (int i = 1; i <= 5; i++) {
            System.out.println("mainthread is Running"+i);
        }

    }
}
