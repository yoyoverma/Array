package Array;

// import java.util.Scanner;
import java.util.*;
// package Arrayas;

public class Arrays1 {
    public static void main(String args[]){
        //Qs. Take an array as input from the user. Search for a 
        //given number x and print the index at which it occurs.
        //for normal method
        // int[] marks = new int[3];
        
        try (// marks[0]= 97;
                // marks[1]= 98;
                // marks[2]=100;
                // System.out.println(marks[0]);
                // System.out.println(marks[1]);
                // System.out.println(marks[2]);
                // for input
        Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int numbers[] = new int[size];

//input
            for(int i=0; i<size; i++){
                numbers[i] = sc.nextInt();
            }
            //jisko dhoonda hai usko input lete hai
            int x = sc.nextInt();
//output
            for(int i=0; i<numbers.length; i++){
                if(numbers[i] == x){
                    System.out.println(" x found at index : " + i);
                }
            }
        }
    }
}
