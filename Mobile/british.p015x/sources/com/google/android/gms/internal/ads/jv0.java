package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jv0 {

    /* renamed from: e */
    public static final wx3<jv0> f34052e = iu0.f33522a;

    /* renamed from: a */
    private final ck0 f34053a;

    /* renamed from: b */
    private final int[] f34054b;

    /* renamed from: c */
    private final int f34055c;

    /* renamed from: d */
    private final boolean[] f34056d;

    public jv0(ck0 ck0, int[] iArr, int i, boolean[] zArr) {
        int i2 = ck0.f30405a;
        this.f34053a = ck0;
        this.f34054b = (int[]) iArr.clone();
        this.f34055c = i;
        this.f34056d = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jv0.class == obj.getClass()) {
            jv0 jv0 = (jv0) obj;
            return this.f34055c == jv0.f34055c && this.f34053a.equals(jv0.f34053a) && Arrays.equals(this.f34054b, jv0.f34054b) && Arrays.equals(this.f34056d, jv0.f34056d);
        }
    }

    public final int hashCode() {
        return (((((this.f34053a.hashCode() * 31) + Arrays.hashCode(this.f34054b)) * 31) + this.f34055c) * 31) + Arrays.hashCode(this.f34056d);
    }
}
