/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;
import java.io.IOException;
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        try{
            int a,b,r;
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nEnter any option");
            int o=sc.nextInt();
            switch(o){
                case 1:r=a+b;
                    break;
                case 2:r=a-b; 
                    break;
                case 3:r=a*b;
                    break;
                case 4:r=a/b;
                    break;
                default:
                    System.out.println("Enter a number only between 1 to 4");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Exception :"+e+"\nFor division the first input should be larger than second input.");
        }
        catch(InputMismatchException e){
            System.out.println("Exception :"+e+"\nEnter numbers only.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}