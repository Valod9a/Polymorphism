package app.devices;

import app.Interface.Device;

public class DeviceA implements Device {

    public double CalcResult(double[] nums){
        return nums[0] * nums[1];
    }
}
