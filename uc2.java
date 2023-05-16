package COM.BL.day3;

public class uc2 {

          public static void main(String args[]){


                  int Full_Time = 1;
                  int Emp_rate_per_hour = 20;

                  int empHrs = 0;
                  int empWage = 0;

                  double empCheck = (int) Math.random() * 10 % 2;

                  if (empCheck == Full_Time) {
                      empHrs = 8;
                  } else {
                      empHrs = 0;
                      empWage = empHrs * Emp_rate_per_hour;
                      System.out.println("Emp Wage is " + " " + empWage);
                  }
              }

          }

