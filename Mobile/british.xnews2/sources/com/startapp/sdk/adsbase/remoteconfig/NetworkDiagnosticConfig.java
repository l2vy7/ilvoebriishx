package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class NetworkDiagnosticConfig implements Serializable {
    private static final long serialVersionUID = 600844380854621516L;
    private boolean enabled;
    private int ief;
    private int minCountToSend = 10;
    private int sendingIntervalMinutes = 60;
    private int types = 1;

    /* renamed from: a */
    public int mo46370a() {
        return this.ief;
    }

    /* renamed from: b */
    public int mo46371b() {
        return this.minCountToSend;
    }

    /* renamed from: c */
    public int mo46372c() {
        return this.sendingIntervalMinutes;
    }

    /* renamed from: d */
    public int mo46373d() {
        return this.types;
    }

    /* renamed from: e */
    public boolean mo46374e() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkDiagnosticConfig networkDiagnosticConfig = (NetworkDiagnosticConfig) obj;
        if (this.enabled == networkDiagnosticConfig.enabled && this.sendingIntervalMinutes == networkDiagnosticConfig.sendingIntervalMinutes && this.minCountToSend == networkDiagnosticConfig.minCountToSend && this.types == networkDiagnosticConfig.types && this.ief == networkDiagnosticConfig.ief) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.sendingIntervalMinutes), Integer.valueOf(this.minCountToSend), Integer.valueOf(this.types), Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
