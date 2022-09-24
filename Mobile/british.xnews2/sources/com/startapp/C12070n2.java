package com.startapp;

import com.startapp.networkTest.enums.C12084Os;
import com.startapp.networkTest.enums.PhoneTypes;
import com.startapp.networkTest.enums.SimStates;
import com.startapp.networkTest.enums.ThreeState;

/* renamed from: com.startapp.n2 */
/* compiled from: Sta */
public class C12070n2 implements Cloneable {
    @C5010hb(complex = true)
    public C11976j1 BluetoothInfo = new C11976j1();
    public String BuildFingerprint = "";
    public String DeviceManufacturer = "";
    public String DeviceName = "";
    public long DeviceUpTime;
    @C5010hb(complex = true)
    public C12340t3 HostAppInfo = new C12340t3();
    public boolean IsRooted;
    @C5010hb(complex = true)
    public C12179s6 MultiSimInfo = new C12179s6();

    /* renamed from: OS */
    public C12084Os f53324OS = C12084Os.Android;
    public String OSVersion = "";
    public String OsSystemVersion = "";
    public int PhoneCount = -1;
    public PhoneTypes PhoneType = PhoneTypes.Unknown;
    public ThreeState PowerSaveMode = ThreeState.Unknown;
    public String SimOperator = "";
    public String SimOperatorName = "";
    public SimStates SimState = SimStates.Unknown;
    public String TAC = "";
    public String UserLocal = "";

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
