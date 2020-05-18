import javax.swing.*;

public class NewtonTest{

   private double getNumber(){
      double n = 0;
        try {
            n = Double.parseDouble(JOptionPane.showInputDialog("Write a number that you want to find the square root"));
            if(n <= 0) {
               JOptionPane.showMessageDialog(null, "The number must be greater than 0");
               n = getNumber();
               return n;
            }
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please write a number without any other symboles");
            n = getNumber();
            return n;
        }
        return n;
   }
   
   private double getEpsilon() {
        double i = 0;
        try {
            i = Double.parseDouble(JOptionPane.showInputDialog("Type the precision that the answer should be"));
            if(i <= 0 || i >= 1) {
                JOptionPane.showMessageDialog(null, "The epsilon value must be between 0 and 1");
                i = getEpsilon();
                return i;
            }
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Epsilon value should be a number");
            i = getEpsilon();
            return i;
        }
        return i;
    }

public static void main (String[] args){

   Newton newton = new Newton();
   NewtonTest a = new NewtonTest();
   
   double number = a.getNumber();
   double epsilon = a.getEpsilon();
   
   double answer = newton.squareRoot(number,epsilon);
   
   JOptionPane.showMessageDialog(null, "The square root of " + number + " is " + answer);
 }
}