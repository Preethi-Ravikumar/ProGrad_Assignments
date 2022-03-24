/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;
import java.util.Scanner;
public class PerfectPRstring {
    public static void Calculate(String s){
        int l=s.length();
        int f=0,count=0;
        for(int i=0;i<l;i++){
            if(Character.isUpperCase(s.charAt(i)))
                f++;
        }
        if(f==l){
            if(s.charAt(0)=='P'){
                for(int i=0;i<l;i+=2){
                    if(s.charAt(i)=='P')
                        count++;
                }
                for(int j=1;j<l;j+=2){
                    if(s.charAt(j)=='R')
                        count++;
                }
            }
            else if(s.charAt(0)=='R'){
                for(int i=0;i<l;i+=2){
                    if(s.charAt(i)=='R')
                        count++;
                }
                for(int j=1;j<l;j+=2){
                    if(s.charAt(j)=='P')
                        count++;
                }  
            }
            if(l==count)
                System.out.println("Perfect");
            else
                System.out.println("Imperfect");
        }
        else
            System.out.println("Imperfect");
    }
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Calculate(s);
    }
}
