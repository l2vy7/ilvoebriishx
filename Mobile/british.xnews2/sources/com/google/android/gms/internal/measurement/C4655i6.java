package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.i6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C4655i6 extends C4659n6 {
    C4655i6(C4657k6 k6Var, String str, Double d, boolean z) {
        super(k6Var, "measurement.test.double_flag", d, true, (C9251m6) null);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19200a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo19209c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(c);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
