package examen5;
import java.util.*;
public class Examen5 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int x,y,i;
        for (i=1;i<=2;i++){
            long inicio=System.nanoTime();
            long fin=System.nanoTime();
            long tiempo=fin-inicio;
        int Num[]={1000,900,500,400,
                  100,90,50,40,
                  10,9,5,4,1};
        String Nr[]={"m","cm","d","cd",
                     "c","xc","l","xl",
                     "x","ix","v","iv","i"};
        while(i<=2){
            i++;
            x=scan.nextInt();
            if (x==0)
                break;
            System.out.println("Numero: "+x);
            y=0;
            while(x>0){
                if(Num[y]<=x){
                    System.out.print(Nr[y]);
                    x=x-Num[y];
                }
                else
                    y++;
            }
            System.out.println();
            }
        System.out.println("El trabajo tomo: "+tiempo);
        }
    }
}
