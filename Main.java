import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int i =0;
        int k =0;
        String  asal = "";
 
        for (i = 1; i <= 100; i++)         
        { 		  	  
           int j=0; 	  
           for(k =i; k>=1; k--)
       {
              if(i%k==0)
          {
          j = j + 1;
          }
       }
       if (j ==2)
       {
          asal = asal + i + " ";
       }	
        }	
        System.out.println("1'den 100'e kadar olan asal sayılar: ");
        System.out.println(asal);
    }
}