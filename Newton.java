import javax.swing.*;
public class Newton{

   public double squareRoot(double n , double epsilon){
            double x = n ;
            double root;
            
            while (true)
               {
                  root = ( x + n / x) / 2;
                  
                  if (Math.abs(root - x) < epsilon)
                     break;
                  
                  x = root;   
               }
               return root;
     }
 }