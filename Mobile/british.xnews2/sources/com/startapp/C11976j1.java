package com.startapp;

import com.startapp.networkTest.enums.bluetooth.BluetoothConnectionState;
import java.util.ArrayList;

/* renamed from: com.startapp.j1 */
/* compiled from: Sta */
public class C11976j1 {
    public BluetoothConnectionState A2DPConnectionState;
    public boolean BluetoothEnabled;
    @C5010hb(type = ArrayList.class, value = C11953i1.class)
    public ArrayList<C11953i1> ConnectedA2DPBluetoothDevices = new ArrayList<>();
    @C5010hb(type = ArrayList.class, value = C11953i1.class)
    public ArrayList<C11953i1> ConnectedHeadsetBluetoothDevices = new ArrayList<>();
    @C5010hb(type = ArrayList.class, value = C11953i1.class)
    public ArrayList<C11953i1> ConnectedHealthBluetoothDevices = new ArrayList<>();
    public BluetoothConnectionState HeadsetConnectionState;
    public BluetoothConnectionState HealthConnectionState;
    public boolean MissingPermission = false;
    @C5010hb(type = ArrayList.class, value = C11953i1.class)
    public ArrayList<C11953i1> PairedBluetoothDevices = new ArrayList<>();

    public C11976j1() {
        BluetoothConnectionState bluetoothConnectionState = BluetoothConnectionState.Unknown;
        this.HealthConnectionState = bluetoothConnectionState;
        this.HeadsetConnectionState = bluetoothConnectionState;
        this.A2DPConnectionState = bluetoothConnectionState;
    }
}
