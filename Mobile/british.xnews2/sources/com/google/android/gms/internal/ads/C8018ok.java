package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ok */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C8018ok {

    /* renamed from: a */
    protected final C7834jk f36510a;

    /* renamed from: b */
    protected final int[] f36511b;

    /* renamed from: c */
    private final zzapg[] f36512c = new zzapg[1];

    /* renamed from: d */
    private int f36513d;

    public C8018ok(C7834jk jkVar, int... iArr) {
        Objects.requireNonNull(jkVar);
        this.f36510a = jkVar;
        for (int i = 0; i <= 0; i++) {
            this.f36512c[i] = jkVar.mo32903b(iArr[i]);
        }
        Arrays.sort(this.f36512c, new C7982nk((C7944mk) null));
        this.f36511b = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.f36511b[i2] = jkVar.mo32902a(this.f36512c[i2]);
        }
    }

    /* renamed from: a */
    public final int mo33929a(int i) {
        return this.f36511b[0];
    }

    /* renamed from: b */
    public final int mo33930b() {
        int length = this.f36511b.length;
        return 1;
    }

    /* renamed from: c */
    public final zzapg mo33931c(int i) {
        return this.f36512c[i];
    }

    /* renamed from: d */
    public final C7834jk mo33932d() {
        return this.f36510a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C8018ok okVar = (C8018ok) obj;
            return this.f36510a == okVar.f36510a && Arrays.equals(this.f36511b, okVar.f36511b);
        }
    }

    public final int hashCode() {
        int i = this.f36513d;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f36510a) * 31) + Arrays.hashCode(this.f36511b);
        this.f36513d = identityHashCode;
        return identityHashCode;
    }
}
