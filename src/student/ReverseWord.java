/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;
import java.util.Scanner;
/**
 *
 * @author nbui6
 * this is for checking changes
 */
public class ReverseWord {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        char[] myLetters = new char[word.length()];
        for (int i=0; i<myLetters.length; i++)
        {
            myLetters[i] = word.charAt(i);   
            System.out.print(myLetters[i]);
        }
        System.out.println();
        for (int i=myLetters.length - 1; i>=0; i--)
        {
            System.out.println(myLetters[i]);

        }
        
    }//end of main
    
}//end of class


