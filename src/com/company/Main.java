package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s1, s2;
        String status = "";
        int length, l1, l2, i, j;
        int found = 0, notFound = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first word: ");
        s1 = scan.nextLine();
        System.out.print("Please enter the second word: ");
        s2 = scan.nextLine();

        l1 = s1.length();
        l2 = s2.length();

        if(l1 == l2)
        {
            length = l1;
            for(i = 0; i < length; i++)
            {
                found = 0;
                for(j = 0; j < length; j++)
                {
                    if (s1.charAt(i) == s2.charAt(j))
                    {
                        found = 1;
                        break;
                    }
                }
                if(found == 0)
                {
                    notFound = 1;
                    break;
                }
            }
            if(notFound == 1)
            {
                status = "not ";
            }
        }
        else
        {
            status = "not ";
        }
        System.out.println(s1 + " and " + s2 + " are " + status + "anagrams of each other.");
    }
}
