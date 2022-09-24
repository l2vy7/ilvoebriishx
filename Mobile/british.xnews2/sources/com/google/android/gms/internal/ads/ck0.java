package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ck0 {

    /* renamed from: d */
    public static final wx3<ck0> f30404d = dj0.f30805a;

    /* renamed from: a */
    public final int f30405a = 1;

    /* renamed from: b */
    private final C8281w[] f30406b;

    /* renamed from: c */
    private int f30407c;

    public ck0(C8281w... wVarArr) {
        this.f30406b = wVarArr;
        m31045c(wVarArr[0].f40610c);
        int i = wVarArr[0].f40612e;
    }

    /* renamed from: c */
    private static String m31045c(String str) {
        return (str == null || str.equals(C6540C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    /* renamed from: a */
    public final int mo30943a(C8281w wVar) {
        for (int i = 0; i <= 0; i++) {
            if (wVar == this.f30406b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C8281w mo30944b(int i) {
        return this.f30406b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ck0.class == obj.getClass() && Arrays.equals(this.f30406b, ((ck0) obj).f30406b);
    }

    public final int hashCode() {
        int i = this.f30407c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f30406b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        this.f30407c = hashCode;
        return hashCode;
    }
}
