package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9384v implements C9306q {
    /* renamed from: b */
    public final C9306q mo19177b(String str, C9326r4 r4Var, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", new Object[]{str}));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C9384v;
    }

    public final C9306q zzd() {
        return C9306q.f45372d0;
    }

    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return AdError.UNDEFINED_DOMAIN;
    }

    public final Iterator zzl() {
        return null;
    }
}
