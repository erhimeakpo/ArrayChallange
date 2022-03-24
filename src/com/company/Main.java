package com.company;
import javax.swing.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
	// write your code here
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        printArray(sortIntegers(myIntegers));
    }

    //Gets user input of numbers and returns it as an array
    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter: " + capacity + " integer values:\r");

        for(int i=0; i<array.length; i++){
            array[i] = input.nextInt();
        }
        return array;
    }
//Prints out Array Index and contents in each index
   static void printArray(int[] array) {
       System.out.println("-------------------------------------");

       for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        boolean flag = true;
        int temp;

        int[] sortedArray = Arrays.copyOf(array, array.length);
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}


