package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cn0 {

    /* renamed from: a */
    private int f30429a;

    /* renamed from: b */
    private final e74[] f30430b;

    public cn0(e74[] e74Arr, byte... bArr) {
        this.f30430b = e74Arr;
        int length = e74Arr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cn0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f30430b, ((cn0) obj).f30430b);
    }

    public final int hashCode() {
        int i = this.f30429a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f30430b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        this.f30429a = hashCode;
        return hashCode;
    }
}
