// Isaac Yun, February 25th, Digits.java, 
// take a 3 digit number and seperate each of the digits
public class Digits {


    public static void main(String[]args)
    {
        int number;
        int ones;
        int tens;
        int hundreds;
        int thousands;
        number = 2580;

        ones = number % 10;
        tens = (number / 10) % 10;
        hundreds = ((number / 10)/10)%10;
        thousands = (((number / 10)/10)/10)%10;
        System.out.println("The ones digit is " + ones + ", the tens digit is " + tens + ", the hundreds digit is " + hundreds + ", the thousands digit is " + thousands + ".");
    }
}

