package com.maiajam.problrmsolving;


import android.content.Context;
import android.widget.Toast;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Solution {


    private static String[] part;
    String orignalString = "";
    StringBuilder reversedString  ;

    public static String getSmallestAndLargest(String s, int k) {
        int sizeOfSubStringList = s.length()-(k-1);
        String[] listOfSubString = new String[sizeOfSubStringList];
        String smallest = "";
        String largest = "";
        for(int i = 0;i< s.length()-(k-1);i++)
        {
            listOfSubString[i]= s.substring(i,i+(k));
        }

        smallest = listOfSubString[0] ;
        for (int x= 1;x<listOfSubString.length;x++)
        {
            if( smallest.compareTo(listOfSubString[x]) < 0);
            smallest = listOfSubString[x];

        }

        largest = listOfSubString[0] ;
        for (int x= 1;x<listOfSubString.length;x++)
        {
            if( largest.compareTo(listOfSubString[x]) > 0)
            largest = largest;
            else
            largest = listOfSubString[x];
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args, Context context) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
    }

    public static String reversString(String inputString)
    {
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(inputString);

        reversedString = reversedString.reverse();

        return reversedString.toString();
    }

    public static boolean checkPalindrome(String input)
    {
        if(input.compareTo(reversString(input))== 0)
            return true;
            return false ;
    }

    public static boolean splitString(String input)
    {
         part = input.split(".");
        if(part.length != 4)
            return false;
        else
            return true;
    }

    public boolean checkInteger(String input)
    {

        if(splitString(input))
        {
            for(int i= 0;i<part.length;i++)
            {
                String part1 = part[i];
                try {
                    int x = Integer.valueOf(part1);
                }catch (NumberFormatException nfe)
                {
                    return false;
                }
            }
            return true;
        }else
        {
            return false ;
        }

    }
}