import java.util.Arrays;
import java.util.Scanner;

public class triangle {
 public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
    char attendance=scan.next().charAt(0);
    switch(attendance){
        case'o':
            System.out.println("on=duty");
            break;
        case'a':
            System.out.println("absent");
            break;
        case'p':
            System.out.println("present");
            break;
        default:
            System.out.println("invalid info");
            break;



    }

    }
}
