package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.Executor;
import p190b5.C6508a;

/* renamed from: com.google.android.gms.common.api.internal.j */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7259j<L> {

    /* renamed from: a */
    private final Executor f29025a;

    /* renamed from: b */
    private volatile L f29026b;

    /* renamed from: c */
    private volatile C7260a<L> f29027c;

    /* renamed from: com.google.android.gms.common.api.internal.j$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C7260a<L> {

        /* renamed from: a */
        private final L f29028a;

        /* renamed from: b */
        private final String f29029b;

        C7260a(L l, String str) {
            this.f29028a = l;
            this.f29029b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7260a)) {
                return false;
            }
            C7260a aVar = (C7260a) obj;
            return this.f29028a == aVar.f29028a && this.f29029b.equals(aVar.f29029b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f29028a) * 31) + this.f29029b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.j$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C7261b<L> {
        /* renamed from: a */
        void mo29879a(L l);

        /* renamed from: b */
        void mo29880b();
    }

    C7259j(Looper looper, L l, String str) {
        this.f29025a = new C6508a(looper);
        this.f29026b = C4604n.m20099l(l, "Listener must not be null");
        this.f29027c = new C7260a<>(l, C4604n.m20094g(str));
    }

    /* renamed from: a */
    public void mo29873a() {
        this.f29026b = null;
        this.f29027c = null;
    }

    /* renamed from: b */
    public C7260a<L> mo29874b() {
        return this.f29027c;
    }

    /* renamed from: c */
    public void mo29875c(C7261b<? super L> bVar) {
        C4604n.m20099l(bVar, "Notifier must not be null");
        this.f29025a.execute(new C7326w1(this, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo29876d(C7261b<? super L> bVar) {
        L l = this.f29026b;
        if (l == null) {
            bVar.mo29880b();
            return;
        }
        try {
            bVar.mo29879a(l);
        } catch (RuntimeException e) {
            bVar.mo29880b();
            throw e;
        }
    }
}
