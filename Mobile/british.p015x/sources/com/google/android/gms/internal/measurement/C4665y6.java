package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.y6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C4665y6 implements Serializable, C9391v6 {

    /* renamed from: b */
    final Object f21266b;

    C4665y6(Object obj) {
        this.f21266b = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof C4665y6)) {
            return false;
        }
        Object obj2 = this.f21266b;
        Object obj3 = ((C4665y6) obj).f21266b;
        if (obj2 == obj3 || obj2.equals(obj3)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21266b});
    }

    public final String toString() {
        String obj = this.f21266b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        return this.f21266b;
    }
}
