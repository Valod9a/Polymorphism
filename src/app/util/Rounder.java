package app.util;

import java.text.DecimalFormat;

public class Rounder {

    public String Round(double num) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(num);
    }
}
