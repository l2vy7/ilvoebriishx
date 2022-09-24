package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.startapp.i9 */
/* compiled from: Sta */
public class C11966i9 {

    /* renamed from: a */
    public HashMap<Integer, C11968b> f53106a = null;

    /* renamed from: b */
    public C11942h9 f53107b = new C11942h9();

    /* renamed from: c */
    public SensorManager f53108c;

    /* renamed from: d */
    public C12128p7 f53109d;

    /* renamed from: e */
    public int f53110e;

    /* renamed from: f */
    public SensorEventListener f53111f = new C11967a();

    /* renamed from: com.startapp.i9$a */
    /* compiled from: Sta */
    public class C11967a implements SensorEventListener {
        public C11967a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            int size;
            JSONArray jSONArray;
            C11942h9 h9Var = C11966i9.this.f53107b;
            synchronized (h9Var) {
                int type = sensorEvent.sensor.getType();
                SensorEvent sensorEvent2 = h9Var.f53043a.get(Integer.valueOf(type));
                if (sensorEvent2 == null || sensorEvent2.accuracy <= sensorEvent.accuracy) {
                    h9Var.f53043a.put(Integer.valueOf(type), sensorEvent);
                }
                size = h9Var.f53043a.size();
            }
            C11966i9 i9Var = C11966i9.this;
            if (size == i9Var.f53110e) {
                i9Var.f53108c.unregisterListener(i9Var.f53111f);
                C11966i9 i9Var2 = C11966i9.this;
                C12128p7 p7Var = i9Var2.f53109d;
                if (p7Var != null) {
                    try {
                        jSONArray = i9Var2.f53107b.mo45407a();
                    } catch (Exception unused) {
                        jSONArray = null;
                    }
                    p7Var.mo45392a(jSONArray);
                }
            }
        }
    }

    /* renamed from: com.startapp.i9$b */
    /* compiled from: Sta */
    public class C11968b {

        /* renamed from: a */
        public int f53113a;

        /* renamed from: b */
        public int f53114b;

        public C11968b(C11966i9 i9Var, int i, int i2) {
            this.f53113a = i;
            this.f53114b = i2;
        }
    }

    public C11966i9(Context context, C12128p7 p7Var) {
        this.f53108c = (SensorManager) context.getSystemService("sensor");
        this.f53109d = p7Var;
        this.f53110e = 0;
        mo45448a();
    }

    /* renamed from: a */
    public final void mo45448a() {
        this.f53106a = new HashMap<>();
        SensorsConfig E = MetaData.f22407k.mo21163E();
        mo45449a(13, E.mo46404a());
        mo45449a(9, E.mo46405b());
        mo45449a(5, E.mo46407d());
        mo45449a(10, E.mo46408e());
        mo45449a(2, E.mo46410f());
        mo45449a(6, E.mo46411g());
        mo45449a(12, E.mo46414i());
        mo45449a(11, E.mo46415j());
        mo45449a(16, E.mo46406c());
    }

    /* renamed from: b */
    public void mo45450b() {
        Sensor defaultSensor;
        for (Integer intValue : this.f53106a.keySet()) {
            int intValue2 = intValue.intValue();
            C11968b bVar = this.f53106a.get(Integer.valueOf(intValue2));
            if (Build.VERSION.SDK_INT >= bVar.f53113a && (defaultSensor = this.f53108c.getDefaultSensor(intValue2)) != null) {
                this.f53108c.registerListener(this.f53111f, defaultSensor, bVar.f53114b);
                this.f53110e++;
            }
        }
    }

    /* renamed from: a */
    public final void mo45449a(int i, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.mo46322c()) {
            this.f53106a.put(Integer.valueOf(i), new C11968b(this, baseSensorConfig.mo46321b(), baseSensorConfig.mo46320a()));
        }
    }
}
