/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment;
import java.io.*; 
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        File myObj = new File("sample.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created :\n " + myObj.getName());
            } else {
                System.out.println("File already exists\n");
            }
            FileWriter myWriter = new FileWriter("sample.txt");
            myWriter.write("Have a nice day\n");
            myWriter.close();
            System.out.println("Data added\n");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println( myObj.getName() + "Data in sample.txt file:\n" + data );
            }
            myReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
