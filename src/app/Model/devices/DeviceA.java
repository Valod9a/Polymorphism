package app.Model.devices;

import app.Model.Interface.Device;

public class DeviceA implements Device {

    public double CalcResult(double[] nums){
        return nums[0] * nums[1];
    }

    public String Result(){
        return "\nResult of multiplying is ";
    }
}
