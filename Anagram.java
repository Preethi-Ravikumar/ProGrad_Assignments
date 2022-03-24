/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;

import java.util.*;
public class Anagram
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    char a[]=s1.toCharArray();
	    String s2=sc.next();
	    char b[]=s2.toCharArray();
	    HashMap<Character, Integer> h1=new HashMap<Character, Integer>();
	    HashMap<Character, Integer> h2=new HashMap<Character, Integer>();
	    for(int i=0;i<a.length;i++){
	        if(h1.get(a[i])==null){
	            h1.put(a[i],1);
	        }
	        else{
	            Integer x=(int)h1.get(a[i]);
	            h1.put(a[i],++x);
	        }
	    }
	    for(int i=0;i<b.length;i++){
	        if(h2.get(b[i])==null){
	            h2.put(b[i],1);
	        }
	        else{
	            Integer x=(int)h2.get(b[i]);
	            h2.put(b[i],++x);
	        }
	    }
	    boolean r=h1.equals(h2);
		System.out.print(r);
	}
}
