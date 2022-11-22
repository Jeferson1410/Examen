package examen5;
import java.util.*;
public class Examen5 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int x,y;
        int Vh[]={1000,900,500,400,
                  100,90,50,40,
                  10,9,5,4,1};
        String Nr[]={"m","cm","d","cd",
                     "c","xc","l","xl",
                     "x","ix","v","iv","i"};
        while(true){
            x=scan.nextInt();
            if (x==0)
                break;
            System.out.println("Numero: "+x);
            y=0;
            while(x>0){
                if(Vh[y]<=x){
                    System.out.print(Nr[y]);
                    x=x-Vh[y];
                }
                else
                    y++;
            }
            System.out.println();
        }
    }
}
