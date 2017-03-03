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
        double pi = 3.14;      //store value for pi
        int rSquared = 15 * 15;      //area of cirle: pir^2
        double circleArea;       //variable for area of circle 

        //Question 2
        String gretzkyName = "Wayne Gretzky";      //store Gretzky's full name
        int gretzkyNumber = 99;        //store Gretzky's number

        //Question 3
        double rectangleWidth = 5.7;       //create variables and store rectangle parameters
        double rectangleLength = 4.8;
        double rectangleArea;        //variable for area of rectangle

        //Question 4
        int hours = 40;        //create variables using givens
        double insurance = 2.00;
        double wage = 10.55;
        double netPay;       //create variables for calculations
        double tax;
        double initialPay;

        //Question 5
        double carpetWidth = 8.5;      //create variables for given parameters
        int carpetLength = 6;
        double price = 19.95;
        double carpetArea;       //create variables for calculations 
        double cost;

        //Question 6
        int amountPaid = 20;       //create variable for money given
        double purchasedPrice = 12.49;     //create variable for orignal price

        //Question 1
        circleArea = pi * rSquared;      //area of circle which will be calculated

        //Question 3
        rectangleArea = rectangleWidth * rectangleLength;        //area of rectangle which will be calculated

        //Question4
        initialPay = (hours * wage - insurance);       //calculate initial pay using other variables
        tax = (initialPay) - (initialPay - (22 * initialPay / 100));       //calculate tax using other variables

        //Question 5
        carpetArea = carpetWidth * carpetLength;     //calculate area of carpet
        cost = carpetArea * price;       //calculate cost of carper using area

        //Question 1
        System.out.println("The area of the circle is " + circleArea + " cm.");      //prints the calculated area of the circle

        //Question 2
        System.out.println(gretzkyName + " is number " + gretzkyNumber);     //prints Wayne Gretzky's full name and jersey number using variables for both

        //Question 3
        System.out.println("The width of the rectangle is " + rectangleWidth);     //prints parameters of rectangle
        System.out.println("The length of the rectangle is " + rectangleLength);
        System.out.println("The area of the rectangle is " + rectangleArea);

        //Question 4
        System.out.println("The net pay is " + (initialPay - tax));      //calculates and prints net pay using variables for initial pay and tax

        //Question 5
        System.out.println("The cost to carpet a room " + carpetWidth + "m by " + carpetLength + "m is " + cost);      //prints cost of carpet and its parameters using variables

        //Question 6
        System.out.println("Purchased price: \t\t\t" + purchasedPrice + "\n Taxes: \t\t\t\t" + ((purchasedPrice * 1.13) - purchasedPrice) + "\n Total: \t\t\t\t" + purchasedPrice * 1.13);       //calculates and prints purchased price, taxes and total using variable for purchased price
        System.out.println("Change due:\t\t\t\t" + (amountPaid - (purchasedPrice * 1.13)));        //calculates and prints change due using variables for amount paid and purchased price

    }

}
