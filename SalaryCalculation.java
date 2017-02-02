package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anoush Atayan on 1/31/2017.
 */
public class SalaryCalculation {


    public static void main(String[] args) throws IOException {
        System.out.println("Please fill your Gross Salary");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double grossSalary = Double.parseDouble(reader.readLine());
        SalaryCalculation sc = new SalaryCalculation();
        String s = String.format("%,.2f", sc.netSalaryCalculation(grossSalary));

        System.out.println(s);


    }


    public double netSalaryCalculation(double grossSalary){
        double netSalary=0;

        if (grossSalary<1323){

            return 0;

        }

      else if (grossSalary<=120000) {
            netSalary = grossSalary-grossSalary*0.244-1000;

        }
        else if (grossSalary>120000 && grossSalary<2000000){
            netSalary = grossSalary - 29280 - (grossSalary-120000)*0.26-1000;
        }
        else {
            netSalary = grossSalary - 518080 - (grossSalary-2000000)*0.36-1000;

        }
       return netSalary;
    }
}
