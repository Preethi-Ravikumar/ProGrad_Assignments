/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;

import java.util.Scanner;
public class Palindrome {
    public static int calculate(String org, String s, String t, int j, int k, int count){
        
        String r="",r1="";
        int f=0;
        //int l=s.length();
        //int l1=t.length();
        //int k=l1-2;
        //int l2=org.length();
        
        int x=org.length()*2;
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        if(s.equals(r)){
            System.out.println("1st Palindrome : "+r);
            f=1;
            System.exit(0);
        }
        
        else if(count<x){           
            s+=s.charAt(j);
            count++;
//            System.out.println(count);
//            System.out.println(x);
//            System.out.println(s);
//            System.out.println(org);
            j=j+1;
            calculate(org,s,t,j,k,count);
            //k=org.length();
              
        }
        if(f==0){
            for(int i=t.length()-1;i>=0;i--){
                r1+=t.charAt(i);
            }
            if(t.equals(r1)){
                System.out.println("2nd Palindrome : "+r1);
                System.exit(0);
            }
            //if(l1%2==0 && k>=0){
            k=k-1;
            t+=t.charAt(k);
//            System.out.println("2nd");
//            System.out.println(t);
            calculate(org,s,t,j,k,count);
            //}
//            else if(l1%2!=0 && k>=0){
//                k=k-2;
//                t+=t.charAt(k);
//                System.out.println("2nd else");
//                System.out.println(t);
//                calculate(org,s,t,j,k,count);
//            }
            
        }
            
            return 0;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.next();
        int l=s.length();
        if(s.charAt(l-2)!=s.charAt(l-1)){
            l=l-1;
        }
        calculate(s,s,s,0,l,0); 
    }
}
            
        //System.out.println(" Not a Palindrome : "+s);