/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;
import java.util.*;
public class Permutation
{
    public static int factorialUsingRecursion (int number){
        if (number == 0 || number == 1)
            return 1;
    return number* factorialUsingRecursion (number-1);
}
public static int factorialUsingIteration (int number) {
    int factorial = 1;
    for(int i=1; i<=number; ++i) {
        factorial=factorial*i;
    }
    return factorial;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputString = sc.nextLine();
    int length = inputString.length();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for(int i=0; i<length; ++i) {
        map.put(inputString.charAt(i), (map.getOrDefault(inputString.charAt(i), 0)+1));
    }
    int nominator = factorialUsingIteration (length);
    int denominator = 1;
    for (Map.Entry<Character, Integer> entry: map.entrySet()){
        denominator=denominator * factorialUsingIteration (entry.getValue());
    }
    int answer = nominator / denominator;
    System.out.println(answer);
}
}