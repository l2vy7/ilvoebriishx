package com.startapp.networkTest.data;

import com.startapp.C12458z0;
import com.startapp.networkTest.enums.HotspotStates;
import com.startapp.networkTest.enums.WifiStates;
import com.startapp.networkTest.enums.wifi.WifiAuthAlgorithms;
import com.startapp.networkTest.enums.wifi.WifiDetailedStates;
import com.startapp.networkTest.enums.wifi.WifiGroupCiphers;
import com.startapp.networkTest.enums.wifi.WifiKeyManagements;
import com.startapp.networkTest.enums.wifi.WifiPairwiseCiphers;
import com.startapp.networkTest.enums.wifi.WifiProtocols;
import com.startapp.networkTest.enums.wifi.WifiSupplicantStates;
import java.io.Serializable;

/* compiled from: Sta */
public class WifiInfo implements Cloneable, Serializable {
    private static final long serialVersionUID = 8111287616823344527L;
    public HotspotStates HotspotState = HotspotStates.Unknown;
    public boolean MissingPermission = false;
    public WifiAuthAlgorithms WifiAuthAlgorithm = WifiAuthAlgorithms.Unknown;
    public String WifiBSSID = "";
    public transient String WifiBSSID_Full;
    public WifiDetailedStates WifiDetailedState = WifiDetailedStates.Unknown;
    public int WifiFrequency = 0;
    public WifiGroupCiphers WifiGroupCipher = WifiGroupCiphers.Unknown;
    public WifiKeyManagements WifiKeyManagement = WifiKeyManagements.Unknown;
    public int WifiLinkQuality = -1;
    public String WifiLinkSpeed = "";
    public transient long WifiLinkSpeedBps;
    public transient String WifiMacAddress = "";
    public WifiPairwiseCiphers WifiPairwiseCipher = WifiPairwiseCiphers.Unknown;
    public WifiProtocols WifiProtocol = WifiProtocols.Unknown;
    public int WifiRxLev;
    public String WifiSSID = "";
    public transient String WifiSSID_Full;
    public WifiStates WifiState = WifiStates.Unknown;
    public WifiSupplicantStates WifiSupplicantState = WifiSupplicantStates.Unknown;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder a = C12458z0.m53804a("WifiState: ");
        a.append(this.WifiState);
        a.append("\n");
        sb.append(a.toString());
        sb.append("WifiDetailedState: " + this.WifiDetailedState + "\n");
        sb.append("WifiSupplicantState: " + this.WifiSupplicantState + "\n");
        sb.append("WifiProtocol: " + this.WifiProtocol + "\n");
        sb.append("WifiGroupCipher: " + this.WifiGroupCipher + "\n");
        sb.append("WifiAuthAlgorithm: " + this.WifiAuthAlgorithm + "\n");
        sb.append("WifiPairwiseCipher: " + this.WifiPairwiseCipher + "\n");
        sb.append("WifiFrequency: " + this.WifiFrequency + "\n");
        sb.append("WifiLinkQuality: " + this.WifiLinkQuality + "\n");
        sb.append("WifiLinkSpeed: " + this.WifiLinkSpeed + "\n");
        sb.append("WifiRxLev: " + this.WifiRxLev + "\n");
        sb.append("WifiBSSID: " + this.WifiBSSID + "\n");
        sb.append("WifiSSID: " + this.WifiSSID + "\n");
        sb.append("WifiMacAddress: " + this.WifiMacAddress + "\n");
        return sb.toString();
    }
}
