package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.jk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7834jk {

    /* renamed from: a */
    public final int f33907a = 1;

    /* renamed from: b */
    private final zzapg[] f33908b;

    /* renamed from: c */
    private int f33909c;

    public C7834jk(zzapg... zzapgArr) {
        this.f33908b = zzapgArr;
    }

    /* renamed from: a */
    public final int mo32902a(zzapg zzapg) {
        for (int i = 0; i <= 0; i++) {
            if (zzapg == this.f33908b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final zzapg mo32903b(int i) {
        return this.f33908b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7834jk.class == obj.getClass() && Arrays.equals(this.f33908b, ((C7834jk) obj).f33908b);
    }

    public final int hashCode() {
        int i = this.f33909c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f33908b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        this.f33909c = hashCode;
        return hashCode;
    }
}
