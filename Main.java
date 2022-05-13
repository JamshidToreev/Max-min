//2-labaratoriya 1-esep
import static java.lang.Math.random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(100*random());
            System.out.print(a[i]+"  ");
        }
        System.out.println("");
        int max=a[0], min=a[0];
        for (int i = 1; i < a.length; i++) {
            if(max<a[i]){
            max=a[i];
            }
            if(min>a[i]){
            min=a[i];
            }}
            System.out.println(max-min);
        }
    }
    

