package com.java.fundamentals;


import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // double grossSalary;2
        // System.out.println("Enter grossSalary: ");
        //grossSalary = sc.nextDouble();

        double basicSalary, HAR, allowances, healthInsurance,cab;
        //direct benfits
        System.out.println("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
        System.out.println("Enter HAR: ");
        HAR = sc.nextLong();
        System.out.println("Enter allowances: ");
        allowances = sc.nextLong();
        double grossSalary = basicSalary + HAR + allowances;
//indirect benfits
        System.out.println("Enter Health Insurance: ");
        healthInsurance = sc.nextLong();
        float health_Insurance_Percentage = (float) ((healthInsurance/grossSalary)*100);
        System.out.println("Enter cab: ");
        cab = sc.nextDouble();
        float cab_Percentage = (float) ((cab/grossSalary)*100);
        double indirectBenefits = healthInsurance+cab;
//retirement benfits
        System.out.println("Enter pf percentage: ");
        double pf_Percentage = sc.nextDouble();
        double employeePf = ((basicSalary*pf_Percentage)/100);
        double retirement_benefits = employeePf;
        //ctc
        double CTC = grossSalary+indirectBenefits+retirement_benefits;
        //cutting
        double employeePf_Cuttings = ((basicSalary*pf_Percentage)/100);
        System.out.println("Enter professional Tax: ");
        double Pt = sc.nextDouble();
        System.out.println("Enter working dates: ");
        byte workingDates = sc.nextByte();
        float per_Day = (float)(grossSalary/workingDates);
        System.out.println("Enter LOP Days: ");
        byte lopDay = sc.nextByte();
        float leaveCut = per_Day * lopDay;
        double TotalCuttings =  employeePf_Cuttings+Pt+leaveCut;
        double netSalary = grossSalary-TotalCuttings;







        System.out.println("--Direct Benefits--");
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("HAR: "+HAR);
        System.out.println("gross salary: "+grossSalary);
        System.out.println("Allowance: "+allowances);
        System.out.println("--InDirect Benefits--");
        System.out.println("Health Insurance: "+healthInsurance);
        System.out.println("health_Insurance_Percentage: "+ health_Insurance_Percentage);
        System.out.println("Cab: "+cab);
        System.out.println("cab_Percentage: "+cab_Percentage);
        System.out.println("InDirect Benefits: "+indirectBenefits);
        System.out.println("--Retirement Benefits--");
        System.out.println("pfPercentage: "+pf_Percentage);
        System.out.println("employee pf:"+employeePf);
        System.out.println("retirement Benefits: "+retirement_benefits);
        System.out.println("--ctc---");
        System.out.println("CTC: "+CTC);
        System.out.println("--cutting--");
        System.out.println("employee pf:"+employeePf_Cuttings);
        System.out.println("Professional Tax: "+Pt);
        System.out.println("Per day salary: "+per_Day);
        System.out.println("leave cutting: "+leaveCut);
        System.out.println("Total cuttings: "+TotalCuttings);
        System.out.println("--Total Salary--");
        System.out.println("Net Salary: "+netSalary);





        sc.close();
    }
}
