package com.startapp;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;

/* renamed from: com.startapp.k1 */
/* compiled from: Sta */
public class C12004k1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C12023l1 f53192a;

    public C12004k1(C12023l1 l1Var) {
        this.f53192a = l1Var;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.device.action.FOUND".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            C11915g1 g1Var = this.f53192a.f53243c;
            if (g1Var.f52966b == null) {
                g1Var.f52966b = new HashSet();
            }
            g1Var.f52966b.add(bluetoothDevice);
        } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
            this.f53192a.mo45519c();
            C12023l1 l1Var = this.f53192a;
            l1Var.f53242b.mo45392a(l1Var.mo45518b());
        }
    }
}
