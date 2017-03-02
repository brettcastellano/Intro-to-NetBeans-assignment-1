/*
 * March 2, 2017
Practicing variables and assigning values
Brett Castellano
 */

package u2a1;


/**
 *
 * @author brcas1396
 */
public class U2A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
       //Question 1
       double pi=3.14;      //storing value for pi
       int rSquared=15*15;      //area of cirle: pir^2
       double circleArea;       //variable for area of circle 
       
       //Question 2
       String gretzkyName="Wayne Gretzky";
       int gretzkyNumber=99;
       
       //Question 3
       double rectangleWidth=5.7;
       double rectangleLength=4.8;
       double rectangleArea;
       
       //Question 4
       int hours=40;
       double insurance=2.00;
       double wage=10.55;
       double netPay;
       double tax;
       double initialPay;
       
       //Question 5
       double carpetWidth=8.5;
       int carpetLength=6;
       double carpetArea;
       double price=19.95;
       
       //Question 1
       circleArea=pi*rSquared;      //area of circle which will be 
       
       //Question 3
       rectangleArea=rectangleWidth*rectangleLength;
       
       //Question4
       initialPay=(hours*wage-insurance);
       tax=(initialPay)-(initialPay-(22*initialPay/100));
       
       //Question 5
       carpetArea=carpetWidth*carpetLength;
       
            
       //Question 1
       System.out.println("The area of the circle is "+circleArea+" cm.");
       
       //Question 2
       System.out.println(gretzkyName+" is number "+gretzkyNumber);
       
       //Question 3
       System.out.println("The width of the rectangle is "+rectangleWidth);
       System.out.println("The length of the rectangle is "+rectangleLength);
       System.out.println("The area of the rectangle is "+rectangleArea);
       
       //Question 4
       System.out.println("The net pay is "+(initialPay-tax));
            
       
       
       
       
       
       
    }
    
}

