
package javaapplication1;
import java.util.Scanner;
import java.util.Random;
public class Question5 {
    
     public static void main(String[] args) {
        int i,j;
        Random obj=new Random(); 
        
         Scanner console=new Scanner(System.in);
          System.out.println("How many numbers");
          j=console.nextInt();
          for(int k=1;k<=j;k++){
               i=obj.nextInt(800);
         if(i%2==0){
             System.out.println(+i+" is even:");
         }
         else{
         System.out.println(+i+" is odd:");
         }
          }

         
     }    
}
