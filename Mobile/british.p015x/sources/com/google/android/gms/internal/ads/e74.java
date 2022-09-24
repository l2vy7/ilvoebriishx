package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class e74 {

    /* renamed from: a */
    protected final ck0 f31249a;

    /* renamed from: b */
    protected final int f31250b;

    /* renamed from: c */
    protected final int[] f31251c;

    /* renamed from: d */
    private final C8281w[] f31252d;

    /* renamed from: e */
    private int f31253e;

    public e74(ck0 ck0, int[] iArr, int i) {
        int length = iArr.length;
        nu1.m20747f(length > 0);
        Objects.requireNonNull(ck0);
        this.f31249a = ck0;
        this.f31250b = length;
        this.f31252d = new C8281w[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f31252d[i2] = ck0.mo30944b(iArr[i2]);
        }
        Arrays.sort(this.f31252d, d74.f30680b);
        this.f31251c = new int[this.f31250b];
        for (int i3 = 0; i3 < this.f31250b; i3++) {
            this.f31251c[i3] = ck0.mo30943a(this.f31252d[i3]);
        }
    }

    /* renamed from: a */
    public final int mo31494a(int i) {
        return this.f31251c[0];
    }

    /* renamed from: b */
    public final int mo31495b() {
        return this.f31251c.length;
    }

    /* renamed from: c */
    public final C8281w mo31496c(int i) {
        return this.f31252d[i];
    }

    /* renamed from: d */
    public final ck0 mo31497d() {
        return this.f31249a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e74 e74 = (e74) obj;
            return this.f31249a == e74.f31249a && Arrays.equals(this.f31251c, e74.f31251c);
        }
    }

    public final int hashCode() {
        int i = this.f31253e;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f31249a) * 31) + Arrays.hashCode(this.f31251c);
        this.f31253e = identityHashCode;
        return identityHashCode;
    }
}
