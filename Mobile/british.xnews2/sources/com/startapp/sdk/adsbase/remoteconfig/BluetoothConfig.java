package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class BluetoothConfig implements Serializable {
    private static final long serialVersionUID = 6500835630965723999L;
    private int discoveryIntervalInMinutes = 1440;
    private boolean enabled = false;
    private long refreshInterval = 900000;
    private int timeoutInSec = 20;

    /* renamed from: a */
    public int mo46325a() {
        return this.discoveryIntervalInMinutes;
    }

    /* renamed from: b */
    public long mo46326b() {
        return this.refreshInterval;
    }

    /* renamed from: c */
    public int mo46327c() {
        return this.timeoutInSec;
    }

    /* renamed from: d */
    public boolean mo46328d() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BluetoothConfig bluetoothConfig = (BluetoothConfig) obj;
        if (this.timeoutInSec == bluetoothConfig.timeoutInSec && this.enabled == bluetoothConfig.enabled && this.discoveryIntervalInMinutes == bluetoothConfig.discoveryIntervalInMinutes && this.refreshInterval == bluetoothConfig.refreshInterval) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), Integer.valueOf(this.discoveryIntervalInMinutes), Long.valueOf(this.refreshInterval)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
