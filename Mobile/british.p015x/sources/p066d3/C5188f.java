package p066d3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: d3.f */
/* compiled from: ViewIndexingTrigger */
class C5188f implements SensorEventListener {

    /* renamed from: a */
    private C5189a f22661a;

    /* renamed from: d3.f$a */
    /* compiled from: ViewIndexingTrigger */
    public interface C5189a {
        /* renamed from: a */
        void mo21353a();
    }

    C5188f() {
    }

    /* renamed from: a */
    public void mo21375a(C5189a aVar) {
        this.f22661a = aVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f22661a != null) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            double d = (double) (f / 9.80665f);
            double d2 = (double) (fArr[1] / 9.80665f);
            double d3 = (double) (fArr[2] / 9.80665f);
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d3);
            if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.299999952316284d) {
                this.f22661a.mo21353a();
            }
        }
    }
}
