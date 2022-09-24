package com.google.ads.interactivemedia.p038v3.internal;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aba */
/* compiled from: IMASDK */
public class aba {

    /* renamed from: a */
    public final Object f13998a;

    /* renamed from: b */
    public final int f13999b;

    /* renamed from: c */
    public final int f14000c;

    /* renamed from: d */
    public final long f14001d;

    /* renamed from: e */
    public final int f14002e;

    protected aba(aba aba) {
        this.f13998a = aba.f13998a;
        this.f13999b = aba.f13999b;
        this.f14000c = aba.f14000c;
        this.f14001d = aba.f14001d;
        this.f14002e = aba.f14002e;
    }

    public aba(Object obj) {
        this(obj, -1, -1, -1, -1);
    }

    private aba(Object obj, int i, int i2, long j, int i3) {
        this.f13998a = obj;
        this.f13999b = i;
        this.f14000c = i2;
        this.f14001d = j;
        this.f14002e = i3;
    }

    /* renamed from: a */
    public final aba mo13311a(Object obj) {
        if (this.f13998a.equals(obj)) {
            return this;
        }
        return new aba(obj, this.f13999b, this.f14000c, this.f14001d, this.f14002e);
    }

    /* renamed from: b */
    public final boolean mo13312b() {
        return this.f13999b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aba)) {
            return false;
        }
        aba aba = (aba) obj;
        return this.f13998a.equals(aba.f13998a) && this.f13999b == aba.f13999b && this.f14000c == aba.f14000c && this.f14001d == aba.f14001d && this.f14002e == aba.f14002e;
    }

    public final int hashCode() {
        return ((((((((this.f13998a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f13999b) * 31) + this.f14000c) * 31) + ((int) this.f14001d)) * 31) + this.f14002e;
    }

    public aba(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public aba(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
