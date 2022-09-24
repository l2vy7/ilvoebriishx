package com.google.android.gms.internal.measurement;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.x6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C4664x6 implements C9391v6 {
    @CheckForNull

    /* renamed from: b */
    volatile C9391v6 f21263b;

    /* renamed from: c */
    volatile boolean f21264c;
    @CheckForNull

    /* renamed from: d */
    Object f21265d;

    C4664x6(C9391v6 v6Var) {
        Objects.requireNonNull(v6Var);
        this.f21263b = v6Var;
    }

    public final String toString() {
        Object obj = this.f21263b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f21265d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(obj2);
        sb2.append(")");
        return sb2.toString();
    }

    public final Object zza() {
        if (!this.f21264c) {
            synchronized (this) {
                if (!this.f21264c) {
                    C9391v6 v6Var = this.f21263b;
                    v6Var.getClass();
                    Object zza = v6Var.zza();
                    this.f21265d = zza;
                    this.f21264c = true;
                    this.f21263b = null;
                    return zza;
                }
            }
        }
        return this.f21265d;
    }
}
