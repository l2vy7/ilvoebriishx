package p128p1;

import android.os.Handler;
import android.os.Looper;
import androidx.work.C1499u;
import p089i0.C5426e;

/* renamed from: p1.a */
/* compiled from: DefaultRunnableScheduler */
public class C5883a implements C1499u {

    /* renamed from: a */
    private final Handler f24654a = C5426e.m24378a(Looper.getMainLooper());

    /* renamed from: a */
    public void mo7029a(long j, Runnable runnable) {
        this.f24654a.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public void mo7030b(Runnable runnable) {
        this.f24654a.removeCallbacks(runnable);
    }
}
