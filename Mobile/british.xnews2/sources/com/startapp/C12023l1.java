package com.startapp;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.startapp.l1 */
/* compiled from: Sta */
public class C12023l1 {

    /* renamed from: a */
    public Context f53241a;

    /* renamed from: b */
    public C12128p7 f53242b;

    /* renamed from: c */
    public C11915g1 f53243c = new C11915g1();

    /* renamed from: d */
    public BluetoothAdapter f53244d = mo45516a();

    /* renamed from: e */
    public BroadcastReceiver f53245e;

    public C12023l1(Context context, C12128p7 p7Var) {
        this.f53241a = context;
        this.f53242b = p7Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45517a(boolean r6) {
        /*
            r5 = this;
            android.bluetooth.BluetoothAdapter r0 = r5.f53244d
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000c
            goto L_0x008a
        L_0x000c:
            com.startapp.g1 r0 = r5.f53243c
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x003e }
            r2 = 31
            if (r1 >= r2) goto L_0x001e
            android.content.Context r3 = r5.f53241a     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "android.permission.BLUETOOTH"
            boolean r3 = com.startapp.C12437y.m53782a((android.content.Context) r3, (java.lang.String) r4)     // Catch:{ all -> 0x003e }
            if (r3 != 0) goto L_0x002a
        L_0x001e:
            if (r1 < r2) goto L_0x002c
            android.content.Context r1 = r5.f53241a     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "android.permission.BLUETOOTH_CONNECT"
            boolean r1 = com.startapp.C12437y.m53782a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0042
            android.bluetooth.BluetoothAdapter r1 = r5.f53244d     // Catch:{ all -> 0x003e }
            boolean r1 = r1.isEnabled()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0042
            android.bluetooth.BluetoothAdapter r1 = r5.f53244d     // Catch:{ all -> 0x003e }
            java.util.Set r1 = r1.getBondedDevices()     // Catch:{ all -> 0x003e }
            goto L_0x0046
        L_0x003e:
            r1 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r1)
        L_0x0042:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0046:
            r0.f52965a = r1
            if (r6 == 0) goto L_0x0080
            android.content.Context r6 = r5.f53241a
            java.lang.String r0 = "android.permission.BLUETOOTH_ADMIN"
            boolean r6 = com.startapp.C12437y.m53782a((android.content.Context) r6, (java.lang.String) r0)
            if (r6 == 0) goto L_0x0080
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r0 = "android.bluetooth.device.action.FOUND"
            r6.<init>(r0)
            com.startapp.k1 r0 = new com.startapp.k1
            r0.<init>(r5)
            r5.f53245e = r0
            android.content.Context r1 = r5.f53241a     // Catch:{ Exception -> 0x006d }
            r1.registerReceiver(r0, r6)     // Catch:{ Exception -> 0x006d }
            android.bluetooth.BluetoothAdapter r6 = r5.f53244d     // Catch:{ Exception -> 0x006d }
            r6.startDiscovery()     // Catch:{ Exception -> 0x006d }
            goto L_0x0089
        L_0x006d:
            r6 = move-exception
            android.bluetooth.BluetoothAdapter r0 = r5.f53244d
            r0.cancelDiscovery()
            com.startapp.p7 r0 = r5.f53242b
            org.json.JSONObject r1 = r5.mo45518b()
            r0.mo45392a(r1)
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r6)
            goto L_0x0089
        L_0x0080:
            com.startapp.p7 r6 = r5.f53242b
            org.json.JSONObject r0 = r5.mo45518b()
            r6.mo45392a(r0)
        L_0x0089:
            return
        L_0x008a:
            com.startapp.p7 r6 = r5.f53242b
            r0 = 0
            r6.mo45392a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12023l1.mo45517a(boolean):void");
    }

    /* renamed from: b */
    public JSONObject mo45518b() {
        try {
            return this.f53243c.mo45371a();
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public void mo45519c() {
        BluetoothAdapter bluetoothAdapter;
        if (C12437y.m53782a(this.f53241a, "android.permission.BLUETOOTH_ADMIN") && this.f53245e != null && (bluetoothAdapter = this.f53244d) != null) {
            bluetoothAdapter.cancelDiscovery();
            try {
                this.f53241a.unregisterReceiver(this.f53245e);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
            this.f53245e = null;
        }
    }

    /* renamed from: a */
    public final BluetoothAdapter mo45516a() {
        if (C12437y.m53782a(this.f53241a, "android.permission.BLUETOOTH")) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        return null;
    }
}
