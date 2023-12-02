package app.view;

import java.util.Locale;
import java.util.Scanner;

public class Inputer {

    public String MenuInp(){
        Scanner sc1 = new Scanner(System.in);
        return sc1.nextLine();
    }

    public double[] Nums(){
        Scanner sc2 = new Scanner(System.in);
        sc2.useLocale(Locale.ENGLISH);
        double[] nums = new double[2];

        nums[0] = sc2.nextDouble();
        nums[1] = sc2.nextDouble();
        sc2.close();
        return nums;
    }
}
