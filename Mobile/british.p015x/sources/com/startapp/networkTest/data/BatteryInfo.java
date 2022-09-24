package com.startapp.networkTest.data;

import com.startapp.C12458z0;
import com.startapp.networkTest.enums.BatteryChargePlugTypes;
import com.startapp.networkTest.enums.BatteryHealthStates;
import com.startapp.networkTest.enums.BatteryStatusStates;
import java.io.Serializable;

/* compiled from: Sta */
public class BatteryInfo implements Cloneable, Serializable {
    private static final long serialVersionUID = -937846764179533362L;
    public int BatteryCapacity;
    public BatteryChargePlugTypes BatteryChargePlug = BatteryChargePlugTypes.Unknown;
    public int BatteryCurrent;
    public BatteryHealthStates BatteryHealth = BatteryHealthStates.Unknown;
    public float BatteryLevel;
    public long BatteryRemainingEnergy;
    public BatteryStatusStates BatteryStatus = BatteryStatusStates.Unknown;
    public String BatteryTechnology = "";
    public String BatteryTemp = "";
    public int BatteryVoltage;
    public boolean MissingPermission = false;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        StringBuilder a = C12458z0.m53804a("BatteryLevel: ");
        a.append(this.BatteryLevel);
        a.append("% BatteryStatus: ");
        a.append(this.BatteryStatus);
        a.append(" BatteryHealth: ");
        a.append(this.BatteryHealth);
        a.append(" BatteryVoltage: ");
        a.append(this.BatteryVoltage);
        a.append(" mV BatteryTemp: ");
        a.append(this.BatteryTemp);
        a.append(" °C BatteryChargePlug: ");
        a.append(this.BatteryChargePlug);
        a.append(" BatteryTechnology: ");
        a.append(this.BatteryTechnology);
        a.append(" Battery Current ");
        a.append(this.BatteryCurrent);
        a.append(" mA BatteryCapacity ");
        a.append(this.BatteryCapacity);
        a.append(" mAh BatteryRemainingEnergy ");
        a.append(this.BatteryRemainingEnergy);
        a.append(" nWh");
        return a.toString();
    }
}
