package com.google.ads.interactivemedia.p038v3.internal;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ail */
/* compiled from: IMASDK */
public final class ail {

    /* renamed from: a */
    private final aik[] f14991a;

    /* renamed from: b */
    private int f14992b;

    public ail(aik... aikArr) {
        this.f14991a = aikArr;
        int length = aikArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ail.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f14991a, ((ail) obj).f14991a);
    }

    public final int hashCode() {
        int i = this.f14992b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f14991a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        this.f14992b = hashCode;
        return hashCode;
    }
}
