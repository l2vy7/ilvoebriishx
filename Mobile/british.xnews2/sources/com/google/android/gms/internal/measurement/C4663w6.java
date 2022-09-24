package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.w6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C4663w6 implements Serializable, C9391v6 {

    /* renamed from: b */
    final C9391v6 f21260b;

    /* renamed from: c */
    volatile transient boolean f21261c;
    @CheckForNull

    /* renamed from: d */
    transient Object f21262d;

    C4663w6(C9391v6 v6Var) {
        Objects.requireNonNull(v6Var);
        this.f21260b = v6Var;
    }

    public final String toString() {
        Object obj;
        if (this.f21261c) {
            String valueOf = String.valueOf(this.f21262d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f21260b;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    public final Object zza() {
        if (!this.f21261c) {
            synchronized (this) {
                if (!this.f21261c) {
                    Object zza = this.f21260b.zza();
                    this.f21262d = zza;
                    this.f21261c = true;
                    return zza;
                }
            }
        }
        return this.f21262d;
    }
}
