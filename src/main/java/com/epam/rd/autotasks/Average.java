package com.epam.rd.autotasks;

import java.util.Scanner;
//import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int i = 0;
        boolean k = true;
        while (k){
            //Scanner scanner = new Scanner(System.in);
            i = ++i;
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
        sum = sum + num;

        }
    double Average = sum/i;
    int average = (int)Average;
        System.out.println(average);
    }

}
