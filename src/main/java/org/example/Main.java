package org.example;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static double rent(int mRent, int property){
        int months = 12;
        int annualRent = mRent * months;
       double rentYield = (double) annualRent / property * 100;
        return rentYield;

    };
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        /*
        for(int i = 4; i <= 8; i++){
            System.out.println("i =" + i);
        }
        System.out.println(10 >= 10);
        System.out.println(10 > 10);
        System.out.println(10 <= 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);
         */

        /*
        Point pointA = new Point(10, 20);
        System.out.println("This is: "+ pointA);
        int[] number = new int[3];
        number[0] = 22;
        number[1] = 20;
        number[2] = 30;
        System.out.println(
                Arrays.toString(number)
        );

         */
        //Topic: Learn arrays
        /*
        int[] numbers = new int[5];
        Arrays.fill(numbers,6);
       // System.out.println(Arrays.toString(numbers));
       // System.out.println(numbers.length);
        String[] words = new String[2];
        //words[0] = "James";
        //words[1] = "Noe";
        Arrays.fill(words,"Hellen");
       // System.out.println(Arrays.toString(words));
        String[] classMate = {
                "Moses",
                "Bruce",
                "Mukami",
                "Allan",
                "Purity"
        };
        for(int i = 0; i < classMate.length; i++){
            System.out.println(classMate[i]);
        }

         */
      double rentYield = rent(1200, 3300000);
        System.out.println("The Annual rental yield is:"+ rentYield);

    }
     //Tips: This is what you should consider when creating methods.
    /*
    - Access Modifier
    - Optional static
    - Return type
    - Name
    - Optional Parameters
    - Method Body
    - Optional return value
     */
}