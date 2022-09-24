package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acs */
/* compiled from: IMASDK */
public final class acs {

    /* renamed from: a */
    public final int f14196a = -1;

    /* renamed from: b */
    public final Uri[] f14197b = new Uri[0];

    /* renamed from: c */
    public final int[] f14198c = new int[0];

    /* renamed from: d */
    public final long[] f14199d = new long[0];

    public acs() {
        aup.m14885p(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && acs.class == obj.getClass()) {
            acs acs = (acs) obj;
            return Arrays.equals(this.f14197b, acs.f14197b) && Arrays.equals(this.f14198c, acs.f14198c) && Arrays.equals(this.f14199d, acs.f14199d);
        }
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f14197b) - 31) * 31) + Arrays.hashCode(this.f14198c)) * 31) + Arrays.hashCode(this.f14199d);
    }
}
