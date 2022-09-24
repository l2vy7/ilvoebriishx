package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AacUtil;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.startapp.c6 */
/* compiled from: Sta */
public class C11822c6 {

    /* renamed from: j */
    public static final AtomicInteger f52668j = new AtomicInteger();

    /* renamed from: a */
    public final Context f52669a;

    /* renamed from: b */
    public final C5069e f52670b;

    /* renamed from: c */
    public final C12462z2<MotionMetadata> f52671c;

    /* renamed from: d */
    public final Handler f52672d;

    /* renamed from: e */
    public C11884e6 f52673e;

    /* renamed from: f */
    public boolean f52674f;

    /* renamed from: g */
    public int f52675g;

    /* renamed from: h */
    public Sensor f52676h;

    /* renamed from: i */
    public final SensorEventListener f52677i = new C11823a();

    /* renamed from: com.startapp.c6$a */
    /* compiled from: Sta */
    public class C11823a implements SensorEventListener {
        public C11823a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                C11822c6 c6Var = C11822c6.this;
                C11884e6 e6Var = c6Var.f52673e;
                if (e6Var != null) {
                    if (!(e6Var.f52901a.offer(sensorEvent))) {
                        c6Var.mo45199a(8, (Throwable) null);
                    }
                }
            } catch (OutOfMemoryError unused) {
                C11822c6 c6Var2 = C11822c6.this;
                c6Var2.getClass();
                c6Var2.mo45204e();
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }

    public C11822c6(Context context, C5069e eVar, C12462z2<MotionMetadata> z2Var, Handler handler) {
        this.f52669a = context;
        this.f52670b = eVar;
        this.f52671c = z2Var;
        this.f52672d = handler;
    }

    /* renamed from: a */
    public final MotionMetadata mo45198a() {
        MotionMetadata call = this.f52671c.call();
        if (call == null || !call.mo46369u()) {
            return null;
        }
        return call;
    }

    /* renamed from: b */
    public double mo45201b() {
        MotionMetadata a = mo45198a();
        if (a == null) {
            return -1.0d;
        }
        C11884e6 e6Var = this.f52673e;
        if (e6Var != null) {
            return Double.longBitsToDouble(e6Var.f52903c.get());
        }
        double d = (double) this.f52670b.getFloat("e9142de3c7cc5952", 0.0f);
        double a2 = C12352u.m53511a(System.currentTimeMillis(), this.f52670b.getLong("7783513af1730383", 0), a.mo46348b(), a.mo46347a(), a.mo46349c(), C12114ob.m52723a(0.0d, a.mo46347a(), a.mo46349c()));
        Double.isNaN(d);
        return d * a2;
    }

    /* renamed from: c */
    public final void mo45202c() {
        if (this.f52673e != null) {
            C5069e.C5070a a = this.f52670b.edit();
            float longBitsToDouble = (float) Double.longBitsToDouble(this.f52673e.f52904d.get());
            a.mo21101a("e9142de3c7cc5952", Float.valueOf(longBitsToDouble));
            a.f22385a.putFloat("e9142de3c7cc5952", longBitsToDouble);
            long j = this.f52673e.f52905e.get();
            a.mo21101a("7783513af1730383", Long.valueOf(j));
            a.f22385a.putLong("7783513af1730383", j);
            a.apply();
            if (mo45200a(4)) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52885d);
                d4Var.f22126d = "MP.save";
                d4Var.f22127e = String.format(Locale.ENGLISH, "%.6f", new Object[]{Double.valueOf(mo45201b())});
                d4Var.mo20661a();
            }
        }
    }

    /* renamed from: d */
    public final void mo45203d() {
        SensorManager sensorManager;
        MotionMetadata a = mo45198a();
        if (a != null && (sensorManager = (SensorManager) this.f52669a.getSystemService("sensor")) != null && Build.VERSION.SDK_INT >= 9 && this.f52676h == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            int min = Math.min(Math.max(10000, (int) (C5015nb.m22935e(a.mo46366r()) * 1000)), AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND);
            if (defaultSensor != null && sensorManager.registerListener(this.f52677i, defaultSensor, min)) {
                this.f52676h = defaultSensor;
                double d = (double) this.f52670b.getFloat("e9142de3c7cc5952", 0.0f);
                long j = this.f52670b.getLong("7783513af1730383", 0);
                C11884e6 e6Var = this.f52673e;
                if (e6Var != null) {
                    e6Var.interrupt();
                    this.f52673e = null;
                }
                if (this.f52673e == null) {
                    StringBuilder a2 = C12458z0.m53804a("startapp-mp-");
                    a2.append(f52668j.incrementAndGet());
                    C11884e6 e6Var2 = new C11884e6(a2.toString(), this.f52669a, a, a.mo46365q(), d, j);
                    this.f52673e = e6Var2;
                    e6Var2.start();
                }
                if (mo45200a(1)) {
                    C5004d4 d4Var = new C5004d4(C11882e4.f52885d);
                    d4Var.f22126d = "MP.start";
                    d4Var.f22127e = defaultSensor.getName() + "," + defaultSensor.getMinDelay() + "," + defaultSensor.getPower();
                    d4Var.mo20661a();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo45204e() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f52669a.getSystemService("sensor");
        if (sensorManager != null && (sensor = this.f52676h) != null) {
            sensorManager.unregisterListener(this.f52677i, sensor);
            this.f52676h = null;
            mo45202c();
            C11884e6 e6Var = this.f52673e;
            if (e6Var != null) {
                e6Var.interrupt();
                this.f52673e = null;
            }
            if (mo45200a(2)) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52885d);
                d4Var.f22126d = "MP.stop";
                d4Var.mo20661a();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo45200a(int i) {
        MotionMetadata a;
        if (!this.f52674f || (a = mo45198a()) == null || (i & a.mo46358j()) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo45199a(int i, Throwable th) {
        if (mo45200a(i)) {
            int i2 = this.f52675g;
            if (!((i2 & i) != 0)) {
                this.f52675g = i2 | i;
                if (th != null) {
                    C5004d4.m22887a(th);
                    return;
                }
                C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                d4Var.f22126d = "MP";
                d4Var.f22127e = String.valueOf(i);
                d4Var.mo20661a();
            }
        }
    }
}
