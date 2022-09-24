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
public final class vy1 implements SensorEventListener {

    /* renamed from: a */
    private final Context f20938a;
    @Nullable

    /* renamed from: b */
    private SensorManager f20939b;

    /* renamed from: c */
    private Sensor f20940c;

    /* renamed from: d */
    private long f20941d;

    /* renamed from: e */
    private int f20942e;

    /* renamed from: f */
    private uy1 f20943f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f20944g;

    vy1(Context context) {
        this.f20938a = context;
    }

    /* renamed from: a */
    public final void mo18916a() {
        synchronized (this) {
            if (this.f20944g) {
                SensorManager sensorManager = this.f20939b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f20940c);
                    zze.zza("Stopped listening for shake gestures.");
                }
                this.f20944g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18917b() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36870E6     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x006a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x0015:
            android.hardware.SensorManager r0 = r6.f20939b     // Catch:{ all -> 0x006a }
            r1 = 1
            if (r0 != 0) goto L_0x0035
            android.content.Context r0 = r6.f20938a     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x006a }
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch:{ all -> 0x006a }
            r6.f20939b = r0     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "Shake detection failed to initialize. Failed to obtain accelerometer."
            com.google.android.gms.internal.ads.co0.zzj(r0)     // Catch:{ all -> 0x006a }
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x002f:
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch:{ all -> 0x006a }
            r6.f20940c = r0     // Catch:{ all -> 0x006a }
        L_0x0035:
            boolean r0 = r6.f20944g     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0068
            android.hardware.SensorManager r0 = r6.f20939b     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0068
            android.hardware.Sensor r2 = r6.f20940c     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0068
            r3 = 2
            r0.registerListener(r6, r2, r3)     // Catch:{ all -> 0x006a }
            a5.e r0 = com.google.android.gms.ads.internal.zzt.zzA()     // Catch:{ all -> 0x006a }
            long r2 = r0.currentTimeMillis()     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r0 = com.google.android.gms.internal.ads.p00.f36886G6     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.n00 r4 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r4.mo18570b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x006a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x006a }
            long r4 = (long) r0     // Catch:{ all -> 0x006a }
            long r2 = r2 - r4
            r6.f20941d = r2     // Catch:{ all -> 0x006a }
            r6.f20944g = r1     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "Listening for shake gestures."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vy1.mo18917b():void");
    }

    /* renamed from: c */
    public final void mo18918c(uy1 uy1) {
        this.f20943f = uy1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36870E6)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)))) >= ((Float) C8311wv.m39277c().mo18570b(p00.f36878F6)).floatValue()) {
                long currentTimeMillis = zzt.zzA().currentTimeMillis();
                if (this.f20941d + ((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f36886G6)).intValue()) <= currentTimeMillis) {
                    if (this.f20941d + ((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f36894H6)).intValue()) < currentTimeMillis) {
                        this.f20942e = 0;
                    }
                    zze.zza("Shake detected.");
                    this.f20941d = currentTimeMillis;
                    int i = this.f20942e + 1;
                    this.f20942e = i;
                    uy1 uy1 = this.f20943f;
                    if (uy1 != null) {
                        if (i == ((Integer) C8311wv.m39277c().mo18570b(p00.f36902I6)).intValue()) {
                            ly1 ly1 = (ly1) uy1;
                            ly1.mo33427g(new iy1(ly1), ky1.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
