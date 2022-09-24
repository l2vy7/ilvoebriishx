package p004a3;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: a3.f */
/* compiled from: LogTime */
public final class C0061f {

    /* renamed from: a */
    private static final double f182a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f182a = d;
    }

    /* renamed from: a */
    public static double m230a(long j) {
        double b = (double) (m231b() - j);
        double d = f182a;
        Double.isNaN(b);
        return b * d;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m231b() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }
}
