/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;

import java.util.Scanner;

public class BalancingBrackets {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        calculate(s);
    }
    public static void calculate(String s){
        String a="";
        int f=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            
                if(s.charAt(i)=='('){
                    if(s.contains(")")){
                        //continue;
                    }
                    else{
                        a+=s.charAt(i)+")";
                        f++;
                    }
                }
                else if(s.charAt(i)==')'){
                    if(s.contains("(")){
                        //continue;
                    }
                    else{
                        a+="("+s.charAt(i);
                        f++;
                    }
                }
                else if(s.charAt(i)=='{'){
                    if(s.contains("}")){
                        //continue;
                    }
                    else{
                        a+=s.charAt(i)+"}";
                        f++;
                    }
                }
                else if(s.charAt(i)=='}'){
                    if(s.contains("{")){
                        //continue;
                    }
                    else{
                        a+="{"+s.charAt(i);
                        f++;
                    }
                }
                else if(s.charAt(i)=='['){
                    if(s.contains("]")){
                        //continue;
                    }
                    else{
                        a+=s.charAt(i)+"]";
                        f++;
                    }
                }
                else if(s.charAt(i)==']'){
                    if(s.contains("[")){
                        //continue;
                    }
                    else{
                        a+="["+s.charAt(i);
                        f++;
                    }
                }
                else{
                    a+=s.charAt(i);
                    f++;
                }
            
        }
        if(f==0){
            System.out.println("Already it is balanced");
        }
        else{
            System.out.println("Balanced string is: "+a);
        }
    }
    
}
