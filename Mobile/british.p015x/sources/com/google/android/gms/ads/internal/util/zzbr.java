package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.C7492a6;
import com.google.android.gms.internal.ads.C8074q5;
import com.google.android.gms.internal.ads.C8145s6;
import com.google.android.gms.internal.ads.C8215u5;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.uo0;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbr extends C8215u5<C8074q5> {

    /* renamed from: n */
    private final uo0<C8074q5> f27868n;

    /* renamed from: o */
    private final bo0 f27869o;

    public zzbr(String str, Map<String, String> map, uo0<C8074q5> uo0) {
        super(0, str, new zzbq(uo0));
        this.f27868n = uo0;
        bo0 bo0 = new bo0((String) null);
        this.f27869o = bo0;
        bo0.mo30739d(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7492a6<C8074q5> mo28553a(C8074q5 q5Var) {
        return C7492a6.m30246b(q5Var, C8145s6.m37330b(q5Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo28548c(Object obj) {
        C8074q5 q5Var = (C8074q5) obj;
        this.f27869o.mo30741f(q5Var.f37864c, q5Var.f37862a);
        bo0 bo0 = this.f27869o;
        byte[] bArr = q5Var.f37863b;
        if (bo0.m30771l() && bArr != null) {
            bo0.mo30743h(bArr);
        }
        this.f27868n.zzd(q5Var);
    }
}
