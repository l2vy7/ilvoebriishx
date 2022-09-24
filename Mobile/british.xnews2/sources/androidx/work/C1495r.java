package androidx.work;

import android.os.Build;
import androidx.work.C1504y;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.r */
/* compiled from: PeriodicWorkRequest */
public final class C1495r extends C1504y {

    /* renamed from: androidx.work.r$a */
    /* compiled from: PeriodicWorkRequest */
    public static final class C1496a extends C1504y.C1505a<C1496a, C1495r> {
        public C1496a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
            super(cls);
            this.f6526c.mo23973e(timeUnit.toMillis(j));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1495r mo7018c() {
            if (!this.f6524a || Build.VERSION.SDK_INT < 23 || !this.f6526c.f25950j.mo6877h()) {
                return new C1495r(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1496a mo7019d() {
            return this;
        }
    }

    C1495r(C1496a aVar) {
        super(aVar.f6525b, aVar.f6526c, aVar.f6527d);
    }
}
