package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ff0 {

    /* renamed from: h */
    public static final wx3<ff0> f31712h = C7802ip.f33390a;

    /* renamed from: a */
    public final long f31713a;

    /* renamed from: b */
    public final int f31714b;

    /* renamed from: c */
    public final Uri[] f31715c;

    /* renamed from: d */
    public final int[] f31716d;

    /* renamed from: e */
    public final long[] f31717e;

    /* renamed from: f */
    public final long f31718f;

    /* renamed from: g */
    public final boolean f31719g;

    public ff0(long j) {
        this(0, -1, new int[0], new Uri[0], new long[0], 0, false);
    }

    /* renamed from: a */
    public final int mo31846a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f31716d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: b */
    public final ff0 mo31847b(int i) {
        int[] iArr = this.f31716d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f31717e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, C6540C.TIME_UNSET);
        return new ff0(0, 0, copyOf, (Uri[]) Arrays.copyOf(this.f31715c, 0), copyOf2, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ff0.class == obj.getClass()) {
            ff0 ff0 = (ff0) obj;
            return this.f31714b == ff0.f31714b && Arrays.equals(this.f31715c, ff0.f31715c) && Arrays.equals(this.f31716d, ff0.f31716d) && Arrays.equals(this.f31717e, ff0.f31717e);
        }
    }

    public final int hashCode() {
        return ((((((this.f31714b * 961) + Arrays.hashCode(this.f31715c)) * 31) + Arrays.hashCode(this.f31716d)) * 31) + Arrays.hashCode(this.f31717e)) * 961;
    }

    private ff0(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        nu1.m20745d(iArr.length == uriArr.length);
        this.f31713a = 0;
        this.f31714b = i;
        this.f31716d = iArr;
        this.f31715c = uriArr;
        this.f31717e = jArr;
        this.f31718f = 0;
        this.f31719g = false;
    }
}
