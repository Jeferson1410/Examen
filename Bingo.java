package bingo;
import java.util.*;
public class Bingo {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int num=(int)Math.random()*75+1;
            int [][]cartilla=new int [5][5];
	    ArrayList<Integer> bingo = new ArrayList<Integer>();
	    boolean valido=false;
	    int temp=0;
            int numero=0;
	    for(int i=0;i<=4;i++){
	        for(int x=0;x<cartilla.length;x++){
	            while(!valido){
	                temp=(int)(Math.random()*15)+1+15*i;
	                if(!bingo.contains(temp)){
	                    valido=true;
	                    bingo.add(temp);
	                }
	            }
	            cartilla[x][i]=temp;
	            valido=false;
	        }
	    }
	    cartilla[2][2] = 0;  
	    String Bingo []={"B","I","N","G","O"};
	    for(int i=0;i<Bingo.length;i++)
	        System.out.print(Bingo[i]+ "\t");
	    System.out.println();
	    for(int fil=0;fil<cartilla.length;fil++){
	        for(int col=0;col<cartilla[fil].length;col++){
	            System.out.print(cartilla[fil][col]+ "\t");
	    }
	        System.out.println();
	}
            for (int x=1;x<=6;x++){
            System.out.println("Ingrese un numero: ");
                numero=scan.nextInt();
            if (bingo.contains(numero))
                System.out.println("Numero acertado");
            else
                System.out.println("Numero no acertado");}
    }
}