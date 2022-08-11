import java.util.Scanner;
import java.util.Arrays;

public class Employee {
    static String[] empHead = { "EmpNo", "EmpName", "JoinDate", "Designation Code", "Department", "Basic", "HRA",
            "IT" };
    static String[][] empDetail = new String[][] {
            { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000" },
            { "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000" },
            { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000" },
            { "1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000" },
            { "1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000" },
            { "1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400" },
            { "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000" }
    };

    static String[] desgHead = { "Designation Code", "Designation", "DA" };
    static String[][] desgDetail = new String[][] {
            { "e", "Engineer", "20000" },
            { "c", "Consultant", "32000" },
            { "k", "Clerk", "12000" },
            { "r", "Receptionist", "15000" },
            { "m", "Manager", "40000" }
    };

    public static void main(String[] args) {
int j = 0;

      int numbers[] =  int() (Integer.parseInt(empDetail[j][5])) ;

       System.out.print(numbers + "\t");

        Scanner obj = new Scanner(System.in);
        int id = obj.nextInt();

        switch (id) {
            case 1001:
                for (int i = 0; i < empHead.length; i++) {
                    if (empHead[i] == "EmpNo" || empHead[i] == "EmpName" || empHead[i] == "Department") {
                        System.out.print(empHead[i] + "\t");
                    } else
                        continue;
                }
                for (int i = 0; i < desgHead.length; i++) {
                    if (desgHead[i] == "Designation") {
                        System.out.print(desgHead[i] + "\t");
                        System.out.print("Salary" + "\t");
                    } else
                        continue;
                }
                System.out.print("\n");

                for (int i = 0; i <= empDetail.length; i++) {
                    if (empHead[i] == "EmpNo" || empHead[i] == "EmpName" || empHead[i] == "Department") {
                        System.out.print(empDetail[0][i] + "\t");
                    }

                    else
                        continue;
                }
                for (int i = 0; i < desgHead.length; i++) {
                    if (desgHead[i] == "Designation") {
                        System.out.print(desgDetail[0][i] + "\t");
                    }
                    if (desgHead[i] == "Salary") {
                        int salary;
                        System.out.print(desgDetail[0][i] + "\t");
                    } else
                        continue;
                }
                break;

            default:
                break;
        }
        // int i=0;
        // System.out.print(desgDetail[0][2] + empDetail[0][5] +"\t");
    }

    // public static String getSalary() {
    //     int i = 0;
    //     String Salary[] = "0";
    //     for (i = 0; i < empDetail.length; i++) {
    //         Salary[i] = empDetail[i][i] ;
    //     }
    //     return Salary[];
    // }

}
