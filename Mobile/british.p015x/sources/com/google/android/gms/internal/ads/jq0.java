package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jq0 implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f33974a;

    /* renamed from: b */
    private final Object f33975b = new Object();

    /* renamed from: c */
    private final Display f33976c;

    /* renamed from: d */
    private final float[] f33977d = new float[9];

    /* renamed from: e */
    private final float[] f33978e = new float[9];
    @GuardedBy("sensorThreadLock")

    /* renamed from: f */
    private float[] f33979f;

    /* renamed from: g */
    private Handler f33980g;

    /* renamed from: h */
    private iq0 f33981h;

    jq0(Context context) {
        this.f33974a = (SensorManager) context.getSystemService("sensor");
        this.f33976c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32922a(iq0 iq0) {
        this.f33981h = iq0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo32923b() {
        if (this.f33980g == null) {
            Sensor defaultSensor = this.f33974a.getDefaultSensor(11);
            if (defaultSensor == null) {
                co0.zzg("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            d33 d33 = new d33(handlerThread.getLooper());
            this.f33980g = d33;
            if (!this.f33974a.registerListener(this, defaultSensor, 0, d33)) {
                co0.zzg("SensorManager.registerListener failed.");
                mo32924c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo32924c() {
        if (this.f33980g != null) {
            this.f33974a.unregisterListener(this);
            this.f33980g.post(new hq0(this));
            this.f33980g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo32925d(float[] fArr) {
        synchronized (this.f33975b) {
            float[] fArr2 = this.f33979f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f33975b) {
                if (this.f33979f == null) {
                    this.f33979f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f33977d, fArr);
            int rotation = this.f33976c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f33977d, 2, TsExtractor.TS_STREAM_TYPE_AC3, this.f33978e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f33977d, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, this.f33978e);
            } else if (rotation != 3) {
                System.arraycopy(this.f33977d, 0, this.f33978e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f33977d, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 1, this.f33978e);
            }
            float[] fArr2 = this.f33978e;
            float f = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f;
            float f2 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f2;
            float f3 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f3;
            synchronized (this.f33975b) {
                System.arraycopy(this.f33978e, 0, this.f33979f, 0, 9);
            }
            iq0 iq0 = this.f33981h;
            if (iq0 != null) {
                iq0.zza();
            }
        }
    }
}
