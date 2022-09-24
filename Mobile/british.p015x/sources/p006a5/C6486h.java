package p006a5;

import android.os.SystemClock;

/* renamed from: a5.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C6486h implements C6483e {

    /* renamed from: a */
    private static final C6486h f26568a = new C6486h();

    private C6486h() {
    }

    /* renamed from: b */
    public static C6483e m28261b() {
        return f26568a;
    }

    /* renamed from: a */
    public final long mo24318a() {
        return System.nanoTime();
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
