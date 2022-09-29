import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double bill;
        int numPeople;
        double percent;
        Scanner all = new Scanner(System.in);
        System.out.print("What is the total bill: ");
        bill = all.nextDouble();
        bill = Math.round(bill * 100);
        bill = bill / 100;//rounds bill

        System.out.print("How many people are in your group: ");
        numPeople = all.nextInt();

        System.out.println("What is the percentage of the bill you want as tip?");
        System.out.print("Do not enter the % symbol: ");
        percent = all.nextDouble();

        double tip = ((double) percent / 100 * bill);
        tip = Math.round(tip * 100);
        tip = tip / 100;//rounds tip
        double tipPPerson = tip / numPeople;
        tipPPerson = Math.round(tipPPerson * 100);
        tipPPerson = tipPPerson / 100;//rounds tipPPerson

        DecimalFormat format = new DecimalFormat("###,###,###,###,###.##");
        format.setDecimalSeparatorAlwaysShown(true);
        format.setMinimumFractionDigits(2);//makes decimals returned always show the second place, even as zero

        System.out.println("------------------------");
        System.out.println("Bill: " + (format.format(bill)));
        System.out.println("Number of people: " + numPeople);
        System.out.println("Percent of bill for tip: " + percent + "%");
        System.out.println();
        System.out.println("=========================");
        System.out.println();
        System.out.println("Tip: " + (format.format(tip)));
        System.out.print("Tip per person: " );
        System.out.println(format.format(tipPPerson));
        System.out.println("------------------------");










    }
}