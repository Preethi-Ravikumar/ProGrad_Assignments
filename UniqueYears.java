/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;
import java.util.regex.*;
import java.util.Scanner;
import java.lang.*;
public class UniqueYears
{
    public static void calculate(String date){
        int j=0;
        int l=date.length();
        String[] s=new String[l];
        for(int i=0;i<l;i++){
            if(Character.isDigit(date.charAt(i))){
                s[j]=date.substring(i,i+10);
                i=i+9;
                j++;
            }
        }
        String regex="^[0-3][0-9]-[0-1][0-9]-[0-9][0-9][0-9][0-9]$";
        Pattern pat=Pattern.compile(regex);
        for(int i=0;i<j;i++){
            Matcher mat=pat.matcher(s[i]);
            if(mat.matches()){
                s[i]=s[i].substring(6);
        }
        }
        int x,count=0,f=j+1;
        for(int i=0;i<j;i++){
            boolean isUnique=true;
            for(x=i+1;x<j;x++){
                if(s[i].equals(s[x])){
                    isUnique=false;
                    f=x;
                }
            }
            if(i==f)
                continue;
            if(isUnique)
                count=count+1;
        }
        System.out.println(count);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String date=sc.nextLine();
	    calculate(date);
	}
}