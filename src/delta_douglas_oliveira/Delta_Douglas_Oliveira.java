
package delta_douglas_oliveira;

import java.util.Scanner;

public class Delta_Douglas_Oliveira {

    
    public static void main(String[] args) 
    {Scanner entrada = new Scanner (System.in);
     double A,B,C, delta, x1, x2;
     System.out.println("digite o valor de A: ");
      A = entrada.nextDouble();  
      System.out.println("digite o valor de B: ");   
      B = entrada.nextDouble(); 
      System.out.println("digite o valor de c: ");
      C = entrada.nextDouble();
      if (A!=0);
      delta = (double) ( Math.pow (B,2)- (4*A*C) );
      if  (delta>0)
      { x1 = (double)( (-B)+Math.sqrt (delta)/(2*A) );
        x2 = (double)( (-B) -Math.sqrt (delta)/ (2*A));
      System.out.println("As raizes x1: " +x1+ " x2 : " +x2);}
      
      else if (delta==0)
      { x1 =(double)( (-B) +Math.sqrt (delta) / (2*A) );
      System.out.println ("As raizes são X1 : " +x1);
      }
      else if (delta<0)
      {System.out.println ("A equação não possui raizes reais");
      
      }
      
        
    
    }
    
}
