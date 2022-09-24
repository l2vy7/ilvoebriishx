package com.google.ads.interactivemedia.p038v3.internal;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahv */
/* compiled from: IMASDK */
public abstract class ahv implements aih {

    /* renamed from: a */
    protected final aco f14883a;

    /* renamed from: b */
    protected final int f14884b;

    /* renamed from: c */
    protected final int[] f14885c;

    /* renamed from: d */
    private final C4120ke[] f14886d;

    /* renamed from: e */
    private final long[] f14887e;

    /* renamed from: f */
    private int f14888f;

    public ahv(aco aco, int[] iArr) {
        int length = iArr.length;
        int i = 0;
        aup.m14887r(length > 0);
        aup.m14890u(aco);
        this.f14883a = aco;
        this.f14884b = length;
        this.f14886d = new C4120ke[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f14886d[i2] = aco.mo13445a(iArr[i2]);
        }
        Arrays.sort(this.f14886d, ahw.f14890b);
        this.f14885c = new int[this.f14884b];
        while (true) {
            int i3 = this.f14884b;
            if (i < i3) {
                this.f14885c[i] = aco.mo13446b(this.f14886d[i]);
                i++;
            } else {
                this.f14887e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo13731e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahv ahv = (ahv) obj;
            return this.f14883a == ahv.f14883a && Arrays.equals(this.f14885c, ahv.f14885c);
        }
    }

    /* renamed from: f */
    public void mo13732f() {
    }

    /* renamed from: g */
    public void mo13733g(float f) {
    }

    /* renamed from: h */
    public int mo13734h(long j, List<? extends adl> list) {
        return list.size();
    }

    public final int hashCode() {
        int i = this.f14888f;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f14883a) * 31) + Arrays.hashCode(this.f14885c);
        this.f14888f = identityHashCode;
        return identityHashCode;
    }

    /* renamed from: j */
    public final aco mo13737j() {
        return this.f14883a;
    }

    /* renamed from: k */
    public final int mo13738k() {
        return this.f14885c.length;
    }

    /* renamed from: l */
    public final C4120ke mo13739l(int i) {
        return this.f14886d[i];
    }

    /* renamed from: m */
    public final int mo13740m(int i) {
        return this.f14885c[i];
    }

    /* renamed from: n */
    public final int mo13741n(C4120ke keVar) {
        for (int i = 0; i < this.f14884b; i++) {
            if (this.f14886d[i] == keVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final int mo13742o(int i) {
        for (int i2 = 0; i2 < this.f14884b; i2++) {
            if (this.f14885c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final C4120ke mo13743p() {
        return this.f14886d[mo13614a()];
    }

    /* renamed from: q */
    public final int mo13744q() {
        return this.f14885c[mo13614a()];
    }

    /* renamed from: r */
    public final boolean mo13745r(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean s = mo13746s(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.f14884b) {
                if (s) {
                    break;
                }
                s = i2 != i && !mo13746s(i2, elapsedRealtime);
                i2++;
            } else if (!s) {
                return false;
            }
        }
        long[] jArr = this.f14887e;
        jArr[i] = Math.max(jArr[i], amm.m14219ai(elapsedRealtime, j));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo13746s(int i, long j) {
        return this.f14887e[i] > j;
    }

    /* renamed from: t */
    public final void mo13747t() {
    }
}
