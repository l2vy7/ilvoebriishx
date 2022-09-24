package androidx.work;

import android.os.Build;
import androidx.work.C1504y;

/* renamed from: androidx.work.o */
/* compiled from: OneTimeWorkRequest */
public final class C1486o extends C1504y {

    /* renamed from: androidx.work.o$a */
    /* compiled from: OneTimeWorkRequest */
    public static final class C1487a extends C1504y.C1505a<C1487a, C1486o> {
        public C1487a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f6526c.f25944d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1486o mo7018c() {
            if (!this.f6524a || Build.VERSION.SDK_INT < 23 || !this.f6526c.f25950j.mo6877h()) {
                return new C1486o(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1487a mo7019d() {
            return this;
        }
    }

    C1486o(C1487a aVar) {
        super(aVar.f6525b, aVar.f6526c, aVar.f6527d);
    }

    /* renamed from: d */
    public static C1486o m7784d(Class<? extends ListenableWorker> cls) {
        return (C1486o) new C1487a(cls).mo7053b();
    }
}
