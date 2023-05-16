package COM.BL.day3;

import java.util.Scanner;

public class uc1 {

    public static void main(String args[]) {


        int Full_Time = 1;
        double empCheck = (int) Math.random() * 10 % 2;
        if (empCheck == Full_Time) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}