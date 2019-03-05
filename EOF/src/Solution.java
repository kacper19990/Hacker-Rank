import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int H;
    static int B;
    static boolean flag;

    static{
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int h = scanner.nextInt();
            int b = scanner.nextInt();

            if (h < 1 || b < 1){
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            else {
                H = h;
                B = b;
                flag = true;
            }
        }
        scanner.close();
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

