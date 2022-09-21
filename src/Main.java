import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double bill;
        int numPeople;
        int percent;
        Scanner all = new Scanner(System.in);
        System.out.print("What is the total bill:");
        bill = all.nextDouble();
        bill = Math.round(bill * 100);
        bill = bill / 100;

        System.out.print("How many people are in your group");
        numPeople = all.nextInt();

        System.out.println("What is the percentage of the bill you want as tip?");
        System.out.print("Do not enter the % symbol:");
        percent = all.nextInt();

        double tip = ((double) percent / 100 * bill);
        tip = Math.round(tip * 100);
        tip = tip / 100;
        double tipPPerson = tip / numPeople;
        tipPPerson = Math.round(tipPPerson * 100);
        tipPPerson = tipPPerson / 100;
        System.out.println("------------------------");
        System.out.println("Bill: " + bill);
        System.out.println("Number of people: " + numPeople);
        System.out.println("Percent of bill for tip: " + percent + "%");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=========================");
        System.out.println("Tip per person: " + tipPPerson);











    }
}