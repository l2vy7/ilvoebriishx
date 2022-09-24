package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.C7493a7;
import com.google.android.gms.internal.ads.C7562c5;
import com.google.android.gms.internal.ads.C8358y5;
import com.google.android.gms.internal.ads.C8394z5;
import com.google.android.gms.internal.ads.bo0;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzbm extends C7493a7 {

    /* renamed from: p */
    final /* synthetic */ byte[] f27864p;

    /* renamed from: q */
    final /* synthetic */ Map f27865q;

    /* renamed from: r */
    final /* synthetic */ bo0 f27866r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbm(zzbs zzbs, int i, String str, C8394z5 z5Var, C8358y5 y5Var, byte[] bArr, Map map, bo0 bo0) {
        super(i, str, z5Var, y5Var);
        this.f27864p = bArr;
        this.f27865q = map;
        this.f27866r = bo0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo28548c(Object obj) {
        mo28548c((String) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo28549m(String str) {
        this.f27866r.mo30742g(str);
        super.mo28548c(str);
    }

    public final Map<String, String> zzl() throws C7562c5 {
        Map<String, String> map = this.f27865q;
        return map == null ? Collections.emptyMap() : map;
    }

    public final byte[] zzx() throws C7562c5 {
        byte[] bArr = this.f27864p;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
