package com.google.ads.interactivemedia.p039v3.internal;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arg */
/* compiled from: IMASDK */
final class arg implements arf {

    /* renamed from: a */
    private final Object f15605a = new Object();

    /* renamed from: b */
    private final int f15606b;

    /* renamed from: c */
    private final aqz<Void> f15607c;

    /* renamed from: d */
    private int f15608d;

    /* renamed from: e */
    private int f15609e;

    /* renamed from: f */
    private int f15610f;

    /* renamed from: g */
    private Exception f15611g;

    /* renamed from: h */
    private boolean f15612h;

    public arg(int i, aqz<Void> aqz) {
        this.f15606b = i;
        this.f15607c = aqz;
    }

    /* renamed from: a */
    private final void m14590a() {
        int i = this.f15608d;
        int i2 = this.f15609e;
        int i3 = this.f15610f;
        int i4 = this.f15606b;
        if (i + i2 + i3 != i4) {
            return;
        }
        if (this.f15611g != null) {
            aqz<Void> aqz = this.f15607c;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            aqz.mo14237m(new ExecutionException(sb.toString(), this.f15611g));
        } else if (this.f15612h) {
            this.f15607c.mo14239o();
        } else {
            this.f15607c.mo14235k(null);
        }
    }

    /* renamed from: b */
    public final void mo14210b(Object obj) {
        synchronized (this.f15605a) {
            this.f15608d++;
            m14590a();
        }
    }

    /* renamed from: c */
    public final void mo14211c(Exception exc) {
        synchronized (this.f15605a) {
            this.f15609e++;
            this.f15611g = exc;
            m14590a();
        }
    }

    /* renamed from: d */
    public final void mo14212d() {
        synchronized (this.f15605a) {
            this.f15610f++;
            this.f15612h = true;
            m14590a();
        }
    }
}
