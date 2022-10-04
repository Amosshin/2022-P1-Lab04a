// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double monthrate = (annualRate/100)/12;
        double numYears   = 30;
        double nummonths = numYears*12;
        double y = 1+monthrate;

        double x = Math.pow(y,nummonths);
        double up = monthrate*x;
        double down= x-1;
        double frac = up/down;
        double payment = (frac)*principal;
        double payment1 =Math.ceil(payment*100);
        double payment2 = payment1/100;
        double total = payment*nummonths;
        double total1 = Math.ceil(total*10);
        double total2 = total1/10;



        double interest = total - principal;
        double interest1 = Math.ceil(interest*10);
        double interest2 = interest1/10;



        System.out.println("Principal : $"+ principal);
        System.out.println("Annual rate:"+ annualRate + "%");
        System.out.println("Number of years:"+ numYears);
        System.out.println("Monthly payment:$"+  payment2);
        System.out.println("total payment:$"+total2);
        System.out.println("total interests:$" + interest2);











    }
}

