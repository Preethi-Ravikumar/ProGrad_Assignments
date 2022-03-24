/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;
import java.util.Scanner;
public class FindingPairs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        calculate(l,a,k);
    }
    private static void calculate(int l, int[] a, int k) {
        int m,count=0;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                m=a[i]*a[j];
                if(m==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}