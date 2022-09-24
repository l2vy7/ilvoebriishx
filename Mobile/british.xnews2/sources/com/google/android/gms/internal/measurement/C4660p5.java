package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.appnext.core.AppnextError;
import java.util.Objects;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.p5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C4660p5 extends C4658l6 {

    /* renamed from: a */
    private final Context f21256a;

    /* renamed from: b */
    private final C9391v6 f21257b;

    C4660p5(Context context, @Nullable C9391v6 v6Var) {
        Objects.requireNonNull(context, AppnextError.NULL_CONTEXT);
        this.f21256a = context;
        this.f21257b = v6Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo19206a() {
        return this.f21256a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final C9391v6 mo19207b() {
        return this.f21257b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f21257b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.C4658l6
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.l6 r5 = (com.google.android.gms.internal.measurement.C4658l6) r5
            android.content.Context r1 = r4.f21256a
            android.content.Context r3 = r5.mo19206a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.v6 r1 = r4.f21257b
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.internal.measurement.v6 r5 = r5.mo19207b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.android.gms.internal.measurement.v6 r5 = r5.mo19207b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4660p5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f21256a.hashCode() ^ 1000003) * 1000003;
        C9391v6 v6Var = this.f21257b;
        if (v6Var == null) {
            i = 0;
        } else {
            i = v6Var.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f21256a.toString();
        String valueOf = String.valueOf(this.f21257b);
        StringBuilder sb = new StringBuilder(obj.length() + 46 + valueOf.length());
        sb.append("FlagsContext{context=");
        sb.append(obj);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
