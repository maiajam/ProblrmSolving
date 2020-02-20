package com.maiajam.problrmsolving;


import android.content.Context;
import android.widget.Toast;

import java.util.Scanner;

public class Solution {

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
}