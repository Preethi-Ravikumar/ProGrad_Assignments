/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;
import java.util.*;
public class SwappingAlternates
{
    static void swap(int n,ArrayList<Integer> a){
        for(int i=0;i<n-1;i=i+2){
            int temp=a.get(i);
            a.set(i,a.get(i+1));
            a.set(i+1,temp);
        }
        for(int i=0;i<n;i++)
            System.out.print(a.get(i));
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    ArrayList<Integer> arr= new ArrayList<Integer>(size);
	    for(int i=0;i<size;i++){
	        arr.add(sc.nextInt());
	    }
	    swap(size,arr);
	}
}
