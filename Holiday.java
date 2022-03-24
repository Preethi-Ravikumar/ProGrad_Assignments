/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;

import java.util.Scanner;
public class Holiday {
    private String name;
    private int day;
    private String month;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public boolean inSameMonth(Holiday h){
        return this.month.equals(h.month);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int d=sc.nextInt();
        String m=sc.next();
        Holiday obj=new Holiday(n,d,m);
        Holiday obj1=new Holiday("abc",7,"may");
        boolean result=obj.inSameMonth(obj1);
        System.out.println(result);
    }
}
