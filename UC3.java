package COM.BL.day3;

public class UC3 {

    public static void main(String args[]){
        int Part_Time = 1;
        int Full_time = 2;
        int Emp_rate_per_hour = 20;

        int empHrs = 0;
        int empWage = 0;

        double empCkeck = (int) Math.random() * 10 % 3;

        if (empCkeck == Part_Time) {
            empHrs = 4;

        } else if (empCkeck == Full_time) {
            empHrs = 8;
        } else {
            empHrs = 0;

            empWage = empHrs * Emp_rate_per_hour;
            System.out.println("EMP WAGE" + empWage);
        }
    }
}
