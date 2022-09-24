package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9154g implements C9306q {

    /* renamed from: b */
    private final boolean f45037b;

    public C9154g(Boolean bool) {
        this.f45037b = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: b */
    public final C9306q mo19177b(String str, C9326r4 r4Var, List list) {
        if ("toString".equals(str)) {
            return new C9369u(Boolean.toString(this.f45037b));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f45037b), str}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9154g) && this.f45037b == ((C9154g) obj).f45037b;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f45037b).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f45037b);
    }

    public final C9306q zzd() {
        return new C9154g(Boolean.valueOf(this.f45037b));
    }

    public final Boolean zzg() {
        return Boolean.valueOf(this.f45037b);
    }

    public final Double zzh() {
        return Double.valueOf(true != this.f45037b ? 0.0d : 1.0d);
    }

    public final String zzi() {
        return Boolean.toString(this.f45037b);
    }

    public final Iterator zzl() {
        return null;
    }
}
