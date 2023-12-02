package app.Model.devices;

import app.Model.Interface.Device;

public class DeviceB implements Device {

    private static final double COEFFICIENT = 2.5;

    public double CalcResult(double[] nums) {
        double sum = 0;
        for(double i : nums){
            sum += i;
        }
        return sum * COEFFICIENT;
    }

    public String Result(){
        return "\nResult of adding with coefficient is ";
    }
}
