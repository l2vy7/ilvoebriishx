package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class vv1 {

    /* renamed from: a */
    protected final String f40563a = z10.f42255b.mo34648e();

    /* renamed from: b */
    protected final Map<String, String> f40564b = new HashMap();

    /* renamed from: c */
    protected final Executor f40565c;

    /* renamed from: d */
    protected final io0 f40566d;

    /* renamed from: e */
    protected final boolean f40567e;

    /* renamed from: f */
    private final yw2 f40568f;

    protected vv1(Executor executor, io0 io0, yw2 yw2) {
        this.f40565c = executor;
        this.f40566d = io0;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue()) {
            this.f40567e = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37227v1)).booleanValue();
        } else {
            this.f40567e = ((double) C8241uv.m38466e().nextFloat()) <= z10.f42254a.mo34648e().doubleValue();
        }
        this.f40568f = yw2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo35503a(Map<String, String> map) {
        return this.f40568f.mo35979a(map);
    }

    /* renamed from: b */
    public final void mo35504b(Map<String, String> map) {
        String a = this.f40568f.mo35979a(map);
        if (this.f40567e) {
            this.f40565c.execute(new uv1(this, a));
        }
        zze.zza(a);
    }
}
