package COM.BL.day3;

public class UC4 {


    public static void main(String args[]){



            final int PART_TIME = 1;
            final int FULL_TIME = 2;
            final int EMP_RATE_PER_HRS = 20;
            int empHrs = 0;
            int empWage = 0;

            int empCheck = (int) Math.random() * 10 % 3;
            switch (empCheck) {

                case PART_TIME:
                    empHrs = 4;
                    break;
                case FULL_TIME:
                    empHrs = 8;

                default:
                    empHrs = 0;
            }

            empWage = empHrs * EMP_RATE_PER_HRS;
            System.out.println("Emp Wage" + empWage);
        }



        }

