package COM.BL.day3;

public class UC6 {

    public static void main(String args[]){





            final int PART_TIME = 1;
            final int FULL_TIME = 2;
            final int EMP_RATE_PER_HRS = 20;
            final int NUMBER_OF_WORKINF_DAYS = 2;
            final int MAX_HRS_MONTH=20;
            int empHrs = 0;
            int empWage = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays=0;

            while(totalEmpHrs<=MAX_HRS_MONTH && totalWorkingDays<NUMBER_OF_WORKINF_DAYS) {
                totalWorkingDays++;
                int empCheck = (int) Math.random() * 10 % 3;
                switch (empCheck) {

                    case PART_TIME:
                        empHrs = 4;
                        break;
                    case FULL_TIME:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }
                totalEmpHrs+=empHrs;

                System.out.println("Day" + totalWorkingDays+ "Emp Hr " + empHrs);
            }
            System.out.println("Total Emp Wage" + " " + totalEmpHrs);

        }
    }

