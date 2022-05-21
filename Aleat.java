package aleat;

import java.util.Random;
import java.util.Scanner;

public class Aleat {

    public static void main(String[] args) {
        Random src = new Random();
        float num1 = src.nextFloat(10);  // NÚMEROS ALEATÓRIOS DE 1 A 10 com virgula
        float num2 = src.nextFloat(10);  
        float num3 = src.nextFloat(10);
        float num4 = src.nextFloat(10);
        int count = 1;
        float sum = num1+num2+num3+num4;
        Scanner val = new Scanner(System.in);
        for(int i = 0; i < count; i++){
          System.out.println(num1); // NÚMEROS COM VIRGULA ALEÁTORIO  
          System.out.println(num2);
          System.out.println(num3);
          System.out.println(num4);
          System.out.println("----------");
        }
        float v = val.nextFloat(); // Use virgula após o primeiro número ex: 2,9832
        if(v == sum){
            System.out.println("PARABENS VC ACERTOU");
            System.out.println(sum);
        }else{
            System.out.println("TREINE MAIS!");
            System.out.println("Essa e a resposta: "+sum);
        }
        
        
      
    }
}
