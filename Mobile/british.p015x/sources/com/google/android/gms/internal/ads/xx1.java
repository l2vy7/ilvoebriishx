package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xx1 implements SensorEventListener {
    @Nullable

    /* renamed from: a */
    private final SensorManager f20985a;
    @Nullable

    /* renamed from: b */
    private final Sensor f20986b;

    /* renamed from: c */
    private float f20987c = 0.0f;

    /* renamed from: d */
    private Float f20988d = Float.valueOf(0.0f);

    /* renamed from: e */
    private long f20989e = zzt.zzA().currentTimeMillis();

    /* renamed from: f */
    private int f20990f = 0;

    /* renamed from: g */
    private boolean f20991g = false;

    /* renamed from: h */
    private boolean f20992h = false;
    @Nullable

    /* renamed from: i */
    private wx1 f20993i = null;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f20994j = false;

    xx1(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f20985a = sensorManager;
        if (sensorManager != null) {
            this.f20986b = sensorManager.getDefaultSensor(4);
        } else {
            this.f20986b = null;
        }
    }

    /* renamed from: a */
    public final void mo18969a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!(!this.f20994j || (sensorManager = this.f20985a) == null || (sensor = this.f20986b) == null)) {
                sensorManager.unregisterListener(this, sensor);
                this.f20994j = false;
                zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3.f20985a == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r3.f20986b != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        com.google.android.gms.internal.ads.co0.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18970b() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36910J6     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ all -> 0x003e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return
        L_0x0015:
            boolean r0 = r3.f20994j     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002d
            android.hardware.SensorManager r0 = r3.f20985a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002d
            android.hardware.Sensor r1 = r3.f20986b     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x002d
            r2 = 2
            r0.registerListener(r3, r1, r2)     // Catch:{ all -> 0x003e }
            r0 = 1
            r3.f20994j = r0     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "Listening for flick gestures."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x003e }
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            android.hardware.SensorManager r0 = r3.f20985a
            if (r0 == 0) goto L_0x0038
            android.hardware.Sensor r0 = r3.f20986b
            if (r0 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            java.lang.String r0 = "Flick detection failed to initialize. Failed to obtain gyroscope."
            com.google.android.gms.internal.ads.co0.zzj(r0)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xx1.mo18970b():void");
    }

    /* renamed from: c */
    public final void mo18971c(wx1 wx1) {
        this.f20993i = wx1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36910J6)).booleanValue()) {
            long currentTimeMillis = zzt.zzA().currentTimeMillis();
            if (this.f20989e + ((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f36926L6)).intValue()) < currentTimeMillis) {
                this.f20990f = 0;
                this.f20989e = currentTimeMillis;
                this.f20991g = false;
                this.f20992h = false;
                this.f20987c = this.f20988d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f20988d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f20988d = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.f20987c;
            h00 h00 = p00.f36918K6;
            if (floatValue > f + ((Float) C8311wv.m39277c().mo18570b(h00)).floatValue()) {
                this.f20987c = this.f20988d.floatValue();
                this.f20992h = true;
            } else if (this.f20988d.floatValue() < this.f20987c - ((Float) C8311wv.m39277c().mo18570b(h00)).floatValue()) {
                this.f20987c = this.f20988d.floatValue();
                this.f20991g = true;
            }
            if (this.f20988d.isInfinite()) {
                this.f20988d = Float.valueOf(0.0f);
                this.f20987c = 0.0f;
            }
            if (this.f20991g && this.f20992h) {
                zze.zza("Flick detected.");
                this.f20989e = currentTimeMillis;
                int i = this.f20990f + 1;
                this.f20990f = i;
                this.f20991g = false;
                this.f20992h = false;
                wx1 wx1 = this.f20993i;
                if (wx1 != null) {
                    if (i == ((Integer) C8311wv.m39277c().mo18570b(p00.f36934M6)).intValue()) {
                        ly1 ly1 = (ly1) wx1;
                        ly1.mo33427g(new jy1(ly1), ky1.GESTURE);
                    }
                }
            }
        }
    }
}
